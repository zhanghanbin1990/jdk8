import java.util.Comparator;
import java.util.function.BinaryOperator;

/**
 * Created by zhanghanbin on 2017/5/8.
 * 测试BinaryOperator
 */
public class BinaryOperatorTest {

    public static void main(String[] args) {
        //加减乘除，两个参数和操作本身，返回一个结果
        BinaryOperatorTest test= new BinaryOperatorTest();
        System.out.println(test.compute(3,4,(a,b)->a+b));
        System.out.println(test.compute(5,6,(a,b)->a-b));

        System.out.println("---------");
        System.out.println(test.getShort("hello33","world",(a,b)->a.length() - b.length()));
        System.out.println(test.getShort("hello333","world",(a,b)->a.charAt(0) - b.charAt(0)));
        System.out.println(test.getShort("hello333","world", Comparator.comparingInt(a -> a.charAt(0))));
        System.out.println(test.getShort("hello33","world", Comparator.comparingInt(String::length)));


    }

    //传递操作的数和操作本身
    public int compute(int a,int b,BinaryOperator<Integer> binaryOperator) {
        return binaryOperator.apply(a, b);
    }

    public String getShort(String a, String b, Comparator<String> comparator) {
        return BinaryOperator.minBy(comparator).apply(a, b);
    }

}
