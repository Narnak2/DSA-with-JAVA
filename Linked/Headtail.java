package Linked;

public class Headtail {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        head = new Node(1);
        head.next = new Node(2);

        // Now you can work with the linked list using 'head' and 'tail' references.
    }
}
