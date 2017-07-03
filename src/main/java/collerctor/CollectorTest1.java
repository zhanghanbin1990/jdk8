package collerctor;

import collerctor.entity.Student;

import java.util.*;
import java.util.stream.Collectors;

/**
 * A <a href="package-summary.html#Reduction">mutable reduction operation</a> that
 * accumulates input elements into a mutable result container, optionally transforming
 * the accumulated result into a final representation after all input elements
 * have been processed.  Reduction operations can be performed either sequentially
 * or in parallel.
 */
public class CollectorTest1 {
    public static void main(String[] args) {
        Student student1 = new Student("zhangsan", 70.5,"1");
        Student student2 = new Student("lisi", 90.9,"1");
        Student student3 = new Student("wangwu", 100.0,"2");
        Student student4 = new Student("zhangsan", 90.9,"2");

        List<Student> students = Arrays.asList(student1, student2, student3, student4);

        List<Student> students1 = students.stream().collect(Collectors.toList());

        System.out.println("------------");

        System.out.println("Count " + students.stream().collect(Collectors.counting()));
        System.out.println("Count " + students.stream().count());


        students.stream().collect(Collectors.minBy(Comparator.comparingDouble(Student::getScore))).ifPresent(student -> System.out.println(student.getName()));
        students.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Student::getScore))).ifPresent(System.out::println);
        System.out.println(students.stream().collect(Collectors.averagingDouble(Student::getScore)));
        System.out.println(students.stream().collect(Collectors.summingDouble(Student::getScore)));
        System.out.println(students.stream().collect(Collectors.summarizingDouble(Student::getScore)));

        System.out.println(students.stream().map(Student::getName).collect(Collectors.joining(",")));
        System.out.println(students.stream().map(Student::getName).collect(Collectors.joining(",", "<begin>", "<end>")));
        System.out.println("=====================");


        Map<Double, Map<String, List<Student>>> map = students.stream().collect(Collectors.groupingBy(Student::getScore, Collectors.groupingBy(Student::getName)));
        System.out.println(map);

        Map<Boolean, List<Student>> map1 = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() > 80));
        System.out.println(map1);

        Map<Boolean, Map<Boolean, List<Student>>> map2 = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() > 80, Collectors.partitioningBy(student -> student.getScore() > 90)));
        System.out.println(map2);
        System.out.println("=====================");

        Map<Boolean, Long> map4 = students.stream().collect(Collectors.partitioningBy(student -> student.getScore() > 80, Collectors.counting()));
        System.out.println(map4);
        System.out.println("=====================");

        Map<String,Student> map5 = students.stream().collect(Collectors.groupingBy(Student::getName, Collectors.collectingAndThen(Collectors.minBy(Comparator.comparingDouble(Student::getScore)), Optional::get)));
        System.out.println(map5);

    }

}
