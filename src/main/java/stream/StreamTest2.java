package stream;

import java.util.Arrays;
import java.util.List;

/**
 * Created by zhanghanbin on 2017/5/10.
 *
 * 流不存储值，通过管道的方式获取值
 */
public class StreamTest2 {
    public static void main(String[] args) {
        //有一个需求：把列表中的所有数字乘以2再求和
        List<Integer> lists = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(lists.stream().map(item -> item * 2).reduce(0,Integer::sum));
        System.out.println(lists.stream().map(item -> item * 2).reduce(0,(a,b)->a+b));

    }
}
