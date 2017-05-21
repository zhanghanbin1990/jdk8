package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by zhanghanbin on 2017/5/21.
 */
public class StreamTest9 {
    public static void main(String[] args) {
        //Stream<List<Integer>> stream = Stream.of(Arrays.asList(1), Arrays.asList(2, 3), Arrays.asList(4, 5, 6));

        //stream.flatMap(thisList->thisList.stream()).map(item->item*2).forEach(System.out::println);

        //单词去重

        List<String> list = Arrays.asList("hello welcome", "welcome hello", "hello world");
        list.stream().map(item->item.split(" ")).flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);

    }
}
