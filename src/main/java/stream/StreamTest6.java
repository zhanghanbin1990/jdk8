package stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhanghanbin on 2017/5/21.
 *
 *
 * 集合关注的是数据与数据存储本身
 * 流关注的则是对数据的计算
 * 流是无法重复使用或消费的
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
