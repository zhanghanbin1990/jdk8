package collerctor.resouceCode;

import collerctor.entity.Student;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by zhanghanbin on 2017/7/3.
 */
public class Exp1 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 55.6,"1");
        Student student2 = new Student("lisi", 80.2,"1");
        Student student3 = new Student("wangwu", 40.5,"2");
        Student student4 = new Student("zhangsan", 90.9,"2");
        List<Student> students = Arrays.asList(student1, student2, student3,student4);
        //List<String> s = students.stream().map(Student::getName).collect(Collectors.toList());
        //System.out.println(s);

        //Set<String> s = students.stream().map(Student::getName).collect(Collectors.toCollection(TreeSet::new));
        //System.out.println(s);

        //String s = students.stream().map(item -> item.getScore().toString()).collect(Collectors.joining(","));
        //System.out.println(s);

        //Double s = students.stream().collect(Collectors.summingDouble(Student::getScore));
        //System.out.println(s);

        //Map<String,Double> map = students.stream().collect(Collectors.groupingBy(Student::getClasses, Collectors.summingDouble(Student::getScore)));
        //System.out.println(map);

        Map<Boolean,List<Student>> s = students.stream().collect(Collectors.partitioningBy(item->item.getScore()>=60));
        System.out.println(s);

    }

}
