package stream;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util .List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamTest3 {
    public static void main(String[] args) {
//        Stream<String> stream = Stream.of("hello", "world", "hello world");
//      String [] strings = stream.toArray(length->new String[length]);
//        String[] strings = stream.toArray(String[]::new);
//        Arrays.stream(strings).forEach(System.out::println);

//        List<String> lists = stream.collect(Collectors.toList());
//        lists.forEach(System.out::println);

//        List<String> lists = stream.collect(() -> new ArrayList<>(), (thisList, item) -> thisList.add(item), (thisList1, thisList2) -> thisList1.addAll(thisList2));

//        List<String> lists = stream.collect(ArrayList::new,ArrayList::add,ArrayList::addAll);

//        List<String> lists = stream.collect(LinkedList::new, LinkedList::add, LinkedList::addAll);

//        lists.forEach(System.out::println);

        //String str = stream.collect(StringBuilder::new, StringBuilder::append, StringBuilder::append);


        Stream<String> stream = Stream.of("hello", "world", "helloworld");

//        List<String> list = stream.collect(Collectors.toCollection(ArrayList::new));
//        list.forEach(System.out::println);


        String str = stream.collect(Collectors.joining()).toString();
        System.out.println(str);
    }
}
