package collerctor;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

import static java.util.stream.Collector.Characteristics.IDENTITY_FINISH;
import static java.util.stream.Collector.Characteristics.UNORDERED;

/**
 * Created by zhanghanbin on 2017/6/18.
 * 自定义Collector接口
 */
public class MySetCollector<T> implements Collector<T,Set<T>,Set<T>> {

    /**
     * 被accumulator()调用的最初的结果容器
     * @return
     */
    @Override
    public Supplier<Set<T>> supplier() {
//        return ()->new HashSet<T>();
        System.out.println("supplier invoker");
        return HashSet<T>::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
//        return Set<T>::add;
        System.out.println("accumulator invoker");
        return (set, item) -> set.add(item);
    }

    //把并行流的结果合并一起
    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoker");
        return (set1,set2)->{
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<Set<T>, Set<T>> finisher() {
//        return t->t;
        System.out.println("finisher invoker");
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoker");
        return Collections.unmodifiableSet(EnumSet.of(IDENTITY_FINISH,UNORDERED));
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "world", "welcome");
        //注意参见collect的实现
        Set<String> set = list.stream().collect(new MySetCollector<>());
        System.out.println(set);
    }
}
