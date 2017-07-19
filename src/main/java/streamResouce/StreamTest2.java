package streamResouce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by zhanghanbin on 2017/7/5.
 */
public class StreamTest2  {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "hello world");
        try(Stream<String> stream = list.stream()) {
            stream.onClose(()->{
                System.out.println("onClose1");
            }).onClose(()->{
                System.out.println("onClose2");
            }).forEach(item->{
                System.out.println(item);
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
