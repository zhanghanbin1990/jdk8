package collerctor;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/**
 * Created by zhanghanbin on 2017/6/19.
 * 输入Set<String>
 * 输出Map<String,String>
 */
public class MySetCollector2<T> implements Collector<T,Set<T>,Map<T,T>>{

    @Override
    public Supplier<Set<T>> supplier() {
        System.out.println("supplier invoker");
        return HashSet<T>::new;
    }

    @Override
    public BiConsumer<Set<T>, T> accumulator() {
        System.out.println("accumulator invoker");
//        return Set::add;
        return (set,item)->{
            System.out.println("accumulator "+ set +","+Thread.currentThread().getName());
            set.add(item);
        };
    }

    //combiner只有在并行流时才会被调用
    @Override
    public BinaryOperator<Set<T>> combiner() {
        System.out.println("combiner invoker");
        return (set1,set2)->{
            set1.addAll(set2);
            return set1;
        };
    }

    @Override
    public Function<Set<T>, Map<T, T>> finisher() {
        System.out.println("finisher invoker");
        return set->{
            Map<T, T> map = new HashMap<>();
            set.stream().forEach(item->{
                map.put(item, item);
            });
            return map;
        };
    }

    /**
     * 收集器是什么特性是由characteristics()来确定的
     * @return
     */
    @Override
    public Set<Characteristics> characteristics() {
        System.out.println("characteristics invoker");
        return Collections.unmodifiableSet(EnumSet.of(Characteristics.UNORDERED,Characteristics.CONCURRENT));
    }

    public static void main(String[] args) {
        for(int i =0;i<100;++i) {
            List<String> list = Arrays.asList("hello", "hello", "welcome","bdd","ccc","a", "B", "C", "b", "a","e","f","zhang");
            Set<String> set = new HashSet<>();
            set.addAll(list);
            Map<String,String> map = set.parallelStream().collect(new MySetCollector2<>());
            System.out.println(map);
        }
    }
}

