package streamResouce;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhanghanbin on 2017/7/5.
 */
public class StreamTest3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world","welcome","person","student");
        list.stream().forEach(System.out::println);
    }
}
