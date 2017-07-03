package Generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by zhanghanbin on 2017/6/28.
 */
public class RandomList<T> {
    private List<T> storage = new ArrayList<>();
    Random random = new Random(50);
    public T select() {
        return  storage.get(random.nextInt(storage.size()));
    }
    public void add(T item) {
        storage.add(item);
    }
    public int size() {
        return storage.size();
    }

    public static void main(String[] args) {
        RandomList<String> list = new RandomList<>();
        for (String s : "aa bb cc dd ee zhang han bin is".split(" ")) {
            list.add(s);
        }

        for(int i =0;i<list.size();i++) {
            System.out.println(list.select());
        }
    }
}
