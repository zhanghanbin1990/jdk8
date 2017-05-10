package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by zhanghanbin on 2017/5/10.
 *
 * 流由3部分组成
 * 1、源
 * 2、零个或多个中间操作
 * 3、终止操作
 *
 * 流操作的分类：
 * 1、惰性求值
 * 2、及早求值
 *
 */
public class StreamTest1 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("hello", "world", "hello world");
        List<String> lists = Arrays.asList("zhangsan", "lisi", "wangwu");
        Stream.of(lists);

        IntStream.of(new int[]{5,6,7}).forEach(System.out::println);
        System.out.println("--------");
        IntStream.range(3, 8).forEach(System.out::println);
        System.out.println("--------");
        IntStream.rangeClosed(3, 8).forEach(System.out::println);



    }
}
