package Linked;

public class detectloop {
        public class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next=null;

            }
        }

        public int size;
        public Node head;
        public Node tail;

        public void Addfirst(int data) {
            // Create a new object
            Node newnode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        public void Addlast(int data) {
            Node newnode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newnode;
                return;
            }
            tail.next = newnode;
            tail = newnode;
        }

        public void print() {
            if (head == null) {
                System.out.print(" Link list is empty");
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println();
        }

        public boolean iscycle() {
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }
        public void removeCycle()
        { boolean cycle =false;
            //detect loop
            Node slow=head;
            Node fast=head;
            while (fast!=null&fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if (slow==fast)
                {
                    cycle=true;
                    break;
                }
            }
            if (cycle==false)
            {
                return;
            }
            //find meet point
            slow=head;
            Node prev=null;
            while (slow!=fast)
            {
                prev=fast;
                slow=slow.next;
                fast=fast.next;

            }
            //remove cycle
            prev.next=null;
        }

        public static void main(String[] args) {
            detectloop ll = new detectloop();
            ll.Addfirst(1);



           // ll.tail.next = ll.head; // Connect the tail to the head to create a cycle

            boolean hasCycle = ll.iscycle();
            if (hasCycle) {
                System.out.println("The linked list contains a cycle.");
            } else {
                System.out.println("The linked list does not contain a cycle.");
            }
            ll.removeCycle();
            hasCycle=ll.iscycle();
            if (hasCycle) {
                System.out.println("The linked list contains a cycle.");
            } else {
                System.out.println("The linked list does not contain a cycle.");
            }
        }
    }


