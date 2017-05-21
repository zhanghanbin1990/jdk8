package stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhanghanbin on 2017/5/21.
 */
public class StreamTest6 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "hello world");
        //list.stream().map(item -> item.substring(0, 1).toUpperCase() + item.substring(1)).forEach(System.out::println);

        list.stream().map(item->{
            String result = item.substring(0,1).toUpperCase()+item.substring(1);
            System.out.println("test");
            return result;
        }).forEach(System.out::println);

    }
}
