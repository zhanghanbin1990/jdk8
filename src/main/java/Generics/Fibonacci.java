package Generics;

import net.mindview.util.Generator;

/**
 * Created by zhanghanbin on 2017/7/3.
 *
 */
public class Fibonacci implements Generator<Integer> {
    int count = 0;
    @Override
    public Integer next() {
        return fib(count++);
    }

    private int fib(int n) {
        if(n<2) return 1;
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        for(int i =0;i<18;i++) {
            System.out.println(fibonacci.next());
        }
    }
}
