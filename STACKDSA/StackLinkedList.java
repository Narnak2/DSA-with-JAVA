package STACKDSA;

public class StackLinkedList {
    static class Stack {
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        static class StackB {
            static Node head = null;

            public static boolean isEmpty() {
                return head == null;
            }

            // Push
            public static void push(int data) {
                Node newNode = new Node(data);
                if (isEmpty()) {
                    head = newNode;
                    return;
                }
                newNode.next = head;
                head = newNode;
            }

            // Pop
            public static int pop() {
                if (isEmpty()) {
                    return -1;
                }
                int top = head.data;
                head = head.next;
                return top;
            }

            public static int peek() {
                if (isEmpty()) {
                    return -1;
                }
                return head.data;
            }
        }
    }

    public static void main(String[] args) {
        Stack.StackB s = new Stack.StackB();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            //int top = s.pop();
            System.out.println("Popped: " + s.pop());
        }
    }
}
