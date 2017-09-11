package streamResouce;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerTest {
    public void test(Consumer<Integer> consumer) {
        consumer.accept(100);
    }

    public static void main(String[] args) {
        ConsumerTest consumerTest = new ConsumerTest();
        Consumer<Integer> consumer = i -> System.out.println(i);
        IntConsumer intConsumer = i->System.out.println(i);

        consumerTest.test(consumer); //传统的面向对象方式
        consumerTest.test(consumer::accept); //函数式方式，传递行为
        consumerTest.test(intConsumer::accept); //函数式方式，传递行为

    }
}
