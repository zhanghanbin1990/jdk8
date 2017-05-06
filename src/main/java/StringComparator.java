import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by zhanghanbin on 2017/5/4.
 */
public class StringComparator {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("zhangsan", "lisi", "wangwu", "zhaoliu");

        /*
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        */
        //Collections.sort(names,(String o1,String o2) ->o1.compareTo(o2));

        Collections.sort(names,Comparator.naturalOrder());

        /*
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        */

        names.forEach(item -> System.out.println(item));
    }
}
