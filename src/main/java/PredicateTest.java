import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by zhanghanbin on 2017/5/6.
 */
public class PredicateTest {
    public static void main(String[] args) {
//        Predicate<String> predicate = p->p.length()>5;
//        System.out.println(predicate.test("hello"));
//        System.out.println(predicate.test("hello world"));

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        PredicateTest test= new PredicateTest();
        test.conditionFilter(list,item-> item%5==0 );
        System.out.println("--------");
        test.conditionFilter1(list,item->item>5 ,item->item%2==0);
        System.out.println(test.isEqual("string").test("string"));
    }


    public void conditionFilter(List<Integer> lists,Predicate<Integer> predicate) {
        lists.forEach(item->{
            if (predicate.test(item)) {
                System.out.println(item);
            }
        });
    }


    public void conditionFilter1(List<Integer> list, Predicate<Integer> predicate1, Predicate<Integer> predicate2) {
        list.forEach(item->{
            if(predicate1.and(predicate2).test(item)) {
                System.out.println(item);
            }
        });
    }


    public Predicate<String> isEqual(Object obj) {
        return Predicate.isEqual(obj);
    }

}
