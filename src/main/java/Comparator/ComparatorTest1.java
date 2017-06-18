package Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by zhanghanbin on 2017/6/16.
 */
public class ComparatorTest1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("nihao", "hello", "world", "welcome");
//        Collections.sort(list, Comparator.comparingInt(String::length));
//        System.out.println(list);
//        Collections.sort(list,Comparator.comparingInt(String::length).reversed());
//        System.out.println(list);
//        System.out.println("============");
//        //Collections.sort(list,Comparator.comparingInt(item->item.length()).reversed());//编译器无法推断出item的类型
//        Collections.sort(list,Comparator.comparingInt((String item)->item.length()).reversed());
//        System.out.println(list);
//
//        System.out.println("============");
//        Collections.sort(list,Comparator.comparingInt(String::length).thenComparing(String.CASE_INSENSITIVE_ORDER));
//        System.out.println(list);
//        Collections.sort(list,Comparator.comparingInt(String::length).thenComparing((item1,item2)->item1.compareToIgnoreCase(item2)));
//        System.out.println(list);
//
//        System.out.println("============");
//
//        Collections.sort(list,Comparator.comparingInt(String::length).thenComparing(String::toLowerCase,Comparator.reverseOrder()));
//        System.out.println(list);
//
//
//        System.out.println("============");

//

        Collections.sort(list,Comparator.comparingInt(String::length).thenComparing(String::toLowerCase,Comparator.reverseOrder()));
        System.out.println(list);
    }
}
