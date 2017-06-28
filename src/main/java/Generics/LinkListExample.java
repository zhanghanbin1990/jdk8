package Generics;

/**
 * Created by zhanghanbin on 2017/6/28.
 * 泛型的堆栈实现
 */
public class LinkListExample<T>{
    public static class Node<U> {
        U item;
        Node<U> next;

        Node(){
            item = null;
            next = null;
        }
        Node(U item,Node<U> next) {
            this.item = item;
            this.next = next;
        }

        boolean end() {
            return item == null && next == null;
        }
    }

    private Node<T> top = new Node<>();
    public void push(T item) {
        top = new Node<>(item, top);
    }
    public T pop() {
        T result = top.item;
        if (!top.end()) {
            top = top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkListExample<String> lis = new LinkListExample<>();
        for (String s : "zhang han bin".split(" ")) {
            lis.push(s);
        }
        String s ;
        while ((s = lis.pop()) != null) {
            System.out.println(s);
        }
    }

}
