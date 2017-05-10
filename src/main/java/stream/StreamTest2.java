package stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhanghanbin on 2017/5/10.
 */
public class StreamTest2 {
    public static void main(String[] args) {
        List<Integer> lists = Arrays.asList(2, 3, 4, 5, 7);
        System.out.println(lists.stream().map(item -> item * 2).reduce(0, Integer::sum));
    }
}
