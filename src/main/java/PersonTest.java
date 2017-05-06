import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Created by zhanghanbin on 2017/5/6.
 * 行为传递的灵活性
 *
 * 真谛在于传递的是行为面不是数值
 *
 * */
public class PersonTest {

    public static void main(String[] args) {
        Person p1 = new Person("zhangsan",20);
        Person p2 = new Person("lisi", 40);
        Person p3 = new Person("wangwu", 50);
        List<Person> personList = Arrays.asList(p1, p2, p3);
        PersonTest test = new PersonTest();
//        test.getPersonByName( "zhangsan",personList).forEach(person-> System.out.println(person.getName()));

//        test.getPersonByAge(30,personList).forEach(person -> System.out.println(person.getName()));


        test.getPersonByAge2(30,personList,(age,persons)->
            persons.stream().filter(person -> person.getAge()>age).collect(Collectors.toList())
        ).forEach((Person person) ->
            System.out.println(person.getAge())
        );


    }

    //事先定义好的方法，灵活性差
    public List<Person> getPersonByName(String name, List<Person> personList) {
       return personList.stream().filter(person -> person.getName().equals(name)).collect(Collectors.toList());
    }

    //事先定义好的方法，灵活性差
    public List<Person> getPersonByAge(int age, List<Person> persons) {
        BiFunction<Integer,List<Person>,List<Person>> function = (ageOfPerson,personList) ->{
            return personList.stream().filter(person -> person.getAge()>ageOfPerson).collect(Collectors.toList());
        };
        return function.apply(age,persons);
    }


    public List<Person> getPersonByAge2(int a,List<Person> persons,BiFunction<Integer,List<Person>,List<Person>> function) {
        return function.apply(a,persons);
    }

}
