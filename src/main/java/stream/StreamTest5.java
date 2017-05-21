package stream;

import java.util.IntSummaryStatistics;
import java.util.UUID;
import java.util.stream.Stream;

/**
 * Created by zhanghanbin on 2017/5/18.
 */
public class StreamTest5 {
    public static void main(String[] args) {

        //作业：找出该流中大于2的元素，然后将每个元素乘以2，然后忽略掉流中的前两个元素，然后取流中的前两个元素，
        //最后求出流中元素的总和

        Stream<Integer> stream = Stream.iterate(1, item -> item + 2).limit(6);

        //System.out.println(stream.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).sum());


        //stream.filter(item->item>2).mapToInt(item->item*2).skip(2).limit(2).min().ifPresent(System.out::println);


        IntSummaryStatistics summaryStatistics = stream.filter(item -> item > 2).mapToInt(item -> item * 2).skip(2).limit(2).summaryStatistics();

        System.out.println(summaryStatistics.getCount());
        System.out.println(summaryStatistics.getMax());
    }
}
