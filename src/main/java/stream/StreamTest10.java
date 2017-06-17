package stream;

import stream.entity.Student;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by zhanghanbin on 2017/5/21.
 */
public class StreamTest10 {
    public static void main(String[] args) {



        Student student1 = new Student("zhangsan", 20, 90);
        Student student2 = new Student("lisi", 21, 90);
        Student student3 = new Student("zhangsan", 20, 84);
        Student student4 = new Student("wangwu", 24, 77);

        List<Student> list = Arrays.asList(student1, student2, student3, student4);

        Map<String, List<Student>> map = new HashMap<>();
        //传统的分组写法
        for (int i = 0; i < list.size(); i++) {
            List<Student> students = new ArrayList<>();
            if (!map.containsKey(list.get(i).getName())) {
                students.add(list.get(i));
                map.put(list.get(i).getName(), students);
            } else {
                map.get(list.get(i).getName()).add(list.get(i));
            }
        }
        // System.out.println(map);


        //Lambda表达式写法
        Map<String, List<Student>> map1 = list.stream().collect(Collectors.groupingBy(item -> item.getName()));
//        map1.forEach((k,v)-> v.forEach(item-> System.out.println(item.getName())));
        System.out.println(map1);


        Map<Double, List<Student>> map2 = list.stream().collect(Collectors.groupingBy(Student::getScore));
        System.out.println(map2);


        Map<String,Long> map3 = list.stream().collect(Collectors.groupingBy(Student::getName, Collectors.counting()));

        System.out.println(map3);

        Map<String,Double> map4 = list.stream().collect(Collectors.groupingBy(Student::getName, Collectors.averagingDouble(Student::getScore)));
        System.out.println(map4);

        Map<Boolean,List<Student>> map5 = list.stream().collect(Collectors.partitioningBy(item->item.getScore()>=90));
        System.out.println(map5);
    }


}
