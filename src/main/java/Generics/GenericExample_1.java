package Generics;


/**
 * Created by zhanghanbin on 2017/6/27.
 * 元组可以存储不同类型的数据
 */
public class GenericExample_1 {

    static class TwoTuple<A,B> {
        public final A first;
        public final B second;

        public TwoTuple(A first, B second) {
            this.first = first;
            this.second = second;
        }
    }

    static class ThreeTuple<A,B, C> extends TwoTuple<A,B>{
        public final C three;

        public ThreeTuple(A first, B second, C three) {
            super(first,second);
            this.three = three;
        }
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> thw = new TwoTuple<>("zhang", 22);
        System.out.println(thw.first);

        ThreeTuple<String,String,Integer> thrw= new ThreeTuple<>("zhang","ren",33);
        System.out.println(thrw.three);
    }

}
