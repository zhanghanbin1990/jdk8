import entity.Company;
import entity.Employee;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

/**
 * Created by zhanghanbin on 2017/5/8.
 * <p>
 * 用于处理空指针异常
 */
public class OptionalTest {
    public static void main(String[] args) {
//        Optional<String> optional = Optional.of("hello");
//        optional.ifPresent(item-> System.out.println(item));

//        Optional<String> optional = Optional.empty();
//        System.out.println(optional.orElse("world"));//optional为空时的备选
//        System.out.println(optional.orElseGet(()->"ll"));//supplier作为参数


        Employee employee = new Employee();
        employee.setName("zhangsan");

        Employee employee1 = new Employee();
        employee1.setName("lisi");

        Company company = new Company();
        company.setName("company");

        List<Employee> employees = Arrays.asList(employee, employee1);
        company.setEmployeeList(employees);//如果list为空则会输出空集合


        Optional<Company> optional = Optional.ofNullable(company);

        System.out.println(optional.map(theCom -> theCom.getEmployeeList()).orElse(Collections.emptyList()));

    }


}
