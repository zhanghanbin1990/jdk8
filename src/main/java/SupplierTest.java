import entity.Student;

import java.util.function.Supplier;

/**
 * Created by zhanghanbin on 2017/5/7.
 */
public class SupplierTest {
    public static void main(String[] args) {
        Supplier<Student> supplier = () ->new Student();
        System.out.println(supplier.get().getName());

        System.out.println("-------------");
        Supplier<Student> supplier1 = Student::new;
        System.out.println(supplier1.get().getName());


    }



}
