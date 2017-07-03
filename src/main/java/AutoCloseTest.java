/**
 * Created by zhanghanbin on 2017/6/30.
 */
public class AutoCloseTest implements AutoCloseable {

    public void dosomething() {
        System.out.println("dosomething");
    }

    @Override
    public void close() throws Exception {
        System.out.println("close");
    }

    public static void main(String[] args) throws Exception {
        try(AutoCloseTest auto = new AutoCloseTest()){
            auto.dosomething();
        }
    }
}
