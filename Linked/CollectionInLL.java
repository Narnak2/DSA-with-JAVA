package Linked;

import java.util.LinkedList;
public class CollectionInLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll =new LinkedList<>();
        //add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);
        System.out.println(ll);
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);

    }
}
