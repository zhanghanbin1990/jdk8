package stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * Created by zhanghanbin on 2017/5/21.
 * paralleStream和Stream区别
 * 一个是并行流，一个是串行流
 */
public class StreamTest7 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(50000000);//5千万
        for(int i =0;i<list.size();i++) {
            list.add(UUID.randomUUID().toString());
        }
        System.out.println("开始排序");
        //串行流
        long startTime = System.nanoTime();
        //list.stream().sorted().count();
        list.parallelStream().sorted().count();
        long endTime = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toNanos(endTime - startTime);
        System.out.println("排序耗时" + millis);
    }
}
