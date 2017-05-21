package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by zhanghanbin on 2017/5/17.
 */
public class StreamTest4 {
    public static void main(String[] args) {
        //把集合的每一个字符转化成大写输出
        List<String> list = Arrays.asList("hello", "world", "hello world");
        list.stream().map(String::toUpperCase).collect(Collectors.toCollection(ArrayList::new)).forEach(System.out::println);

        //求出每一个数字的平方再输出
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        list1.stream().map(item -> item * item).collect(Collectors.toCollection(ArrayList::new)).forEach(System.out::println);


        //flatMap实例
        Stream<List<Integer>> stream = Stream.of(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5, 6));
        stream.flatMap(thisList->thisList.stream()).map(item->item*item).forEach(System.out::println);




    }
}
