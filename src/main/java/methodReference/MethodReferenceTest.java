package methodReference;

import methodReference.entity.Student;
import methodReference.entity.StudentCompare;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Created by zhanghanbin on 2017/5/9.
 * 方法引用练习
 * <p>
 * 方法引用是lambda表达式的一种语法糖
 * <p>
 * 我们可以将方法引用看作是一个「函数指针」，function pointer
 * <p>
 * 方法引用共分为4类：
 * 1：类名::静态方法名
 * 2：引用名(对象名)::实例方法名
 * 3：类名::实例方法名
 * 4：构造方法引用：  类名::new
 */
public class MethodReferenceTest {

    public String getString(Supplier<String> supplier) {
        return supplier.get() + "test";
    }

    public String getString(String str, Function<String, String> function) {
        return function.apply(str);
    }

    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 67);
        Student student2 = new Student("lisi", 33);
        Student student3 = new Student("wangwu", 77);
        Student student4 = new Student("zhaoliu", 87);
        List<Student> students = Arrays.asList(student1, student2, student3, student4);

//        students.sort((param1,param2)->Student.compareStudentByScore(param1,param2));
//        students.sort(Student::compareStudentByScore);
//        students.forEach(item-> System.out.println(item.getScore()));
//
//        students.sort((param1,param2)->Student.compareStudentByName(param1,param2));
//        students.sort(Student::compareStudentByName);
//        students.forEach(item-> System.out.println(item.getName()));

//        StudentCompare studentCompare = new StudentCompare();

//        students.sort((param1, param2) -> studentCompare.compareStudentByScore(param1, param2));
//        students.sort(studentCompare::compareStudentByScore);
//        students.forEach(item-> System.out.println(item.getScore()));
//
////        students.sort((param1,param2)->studentCompare.compareStudentByName(param1,param2));
//        students.sort(studentCompare::compareStudentByName);
//        students.forEach(item-> System.out.println(item.getName()));


//        students.sort((param1,param2)->param1.compareName(param2));
//        students.sort(Student::compareName);
//        students.forEach(item-> System.out.println(item.getName()));


//        students.sort((param1,param2)->param1.compareScore(param2));
        students.sort(Student::compareScore);
        students.forEach(item -> System.out.println(item.getScore()));


//        List<String> cities = Arrays.asList("beijing", "shanghai", "guangzhou", "haikou");
//        cities.sort((item1,item2)->item1.compareToIgnoreCase(item2));
//        cities.forEach(item-> System.out.println(item));


//        cities.sort(String::compareToIgnoreCase);
//        cities.forEach(item -> System.out.println(item));


        MethodReferenceTest test = new MethodReferenceTest();
        System.out.println(test.getString(String::new));

        System.out.println(test.getString("hello", String::new));//类名::new

    }
}
