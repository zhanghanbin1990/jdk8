import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by zhanghanbin on 2017/5/6.
 */
public class FunctionTest2 {

    public static void main(String[] args) {
        FunctionTest2 test = new FunctionTest2();
        System.out.println(test.compute1(2,value->value*3,value->value*value));
        System.out.println(test.compute2(2,value->value*3,value->value*value));
        System.out.println(test.compute3(2,value->value*3,value->value*value));

        System.out.println(test.compute4(3, 2, (value1, value2) -> value1 + value2));
        System.out.println(test.compute4(3, 2, (value1, value2) -> value1 - value2));
        System.out.println(test.compute4(3, 2, (value1, value2) -> value1 * value2));
        System.out.println(test.compute4(3, 2, (value1, value2) -> value1 / value2));


        System.out.println(test.compute5(5,5,(value1,value2)->value1+value2,value -> value*2));
    }

    public int compute1(int a,Function<Integer,Integer> function1,Function<Integer,Integer> function2) {
        return function1.compose(function2).apply(a);
    }

    public int compute2(int a,Function<Integer,Integer> function1,Function<Integer,Integer> function2) {
        return function1.andThen(function2).apply(a);
    }

    public int compute3(int a,Function<Integer,Integer> function1,Function<Integer,Integer> function2) {
        return function1.compose(function2).andThen(function1).apply(a);
    }

    public int compute4(int a, int b, BiFunction<Integer,Integer,Integer> function) {
        return function.apply(a,b);
    }

    public int compute5(int a,int b,BiFunction<Integer,Integer,Integer> function,Function<Integer,Integer> function1) {
        return function.andThen(function1).apply(a,b);
    }

}
