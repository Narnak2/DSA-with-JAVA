package Linked;

public class Reverselinkedlist {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public Node head;
    public Node tail;
    public int size;

    public void addFirst(int data) {
        // Create a new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Connect the new node to the current head
        newNode.next = head;
        // Update the head to the new node
        head = newNode;
    }
    public void print(){
        if (head==null)
        {
            System.out.print(" link list is empty");
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println();


    }
    public void reverse(){
        Node pre=null;
        Node curr=tail=head;
        Node next;
        while (curr!=null)//0(n) time complexity
        {
            next=curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;

        }
        head=pre;

    }


    public static void main(String[] args) {
        Reverselinkedlist ll = new Reverselinkedlist();
        ll.addFirst(4);
        // ll.print();
        ll.addFirst(3);

        ll.addFirst(2);

        ll.addFirst(1);
        ll.print();
        ll.reverse();
        ll.print();

        // You can now use ll to add elements to the linked list using addFirst method.
    }
}
