package Linked;

import java.util.LinkedList;
public class Zigzag{
    public static class Node{
        int data;
        adding.Node next;
        public Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    public static adding.Node head;
    public static adding.Node tail;

    public static int size;


    public void print() {
        if (head == null) {
            System.out.print(" link list is emty");
        }
        adding.Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Zigzag ll=new Zigzag();
            LinkedList<Integer> LL = new LinkedList<>();
            LL.addLast(1);
            LL.addLast(2);
            LL.addLast(3);
            LL.addLast(4);
            LL.addLast(5);




    }
}
