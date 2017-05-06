import java.util.function.Function;

/**
 * Created by zhanghanbin on 2017/5/4.
 */
public class FunctionTest {

    /**
     * 高阶函数：如果一个函数接收一个函数作为参数，或者返回一个函数作为返回值，那么该函数就叫做高阶函数
     * @param args
     */
    public static void main(String[] args) {
        FunctionTest test = new FunctionTest();
        System.out.println(test.compute(2,a->a*2));
        System.out.println(test.compute(3,a->a*a));
        Function<Integer,String> function = a->a+"zhanghanbin";
        System.out.println(test.conver(5,function));
    }

    public int compute(Integer a,Function<Integer,Integer> function) {
        return function.apply(a);
    }

    public String conver(Integer a,Function<Integer,String> function) {
        return function.apply(a);
    }
}
