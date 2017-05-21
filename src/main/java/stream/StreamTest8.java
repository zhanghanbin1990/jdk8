package stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhanghanbin on 2017/5/21.
 * <p>
 * 流都是短路操作的
 */
public class StreamTest8 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");

//        list.stream().mapToInt(item -> item.length()).filter(length -> length == 5)
//                .findFirst().ifPresent(System.out::println);

        list.stream().mapToInt(item->{
            int length = item.length();
            System.out.println(item);
            return length;
        }).filter(length -> length==5).findFirst().ifPresent(System.out::println);
    }

}
