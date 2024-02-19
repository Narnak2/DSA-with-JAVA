package Linked;

public class adding {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;

    public static int size;
    public void addFirst(int data) {
        // creat new node
        Node ns = new Node(data);
        size++;
        if (head == null) {
            head = tail = ns;
            return;
        }

            //creating new node next
            ns.next = head;
            //head = new node
            head = ns;

    }
        public void addLast ( int data){

            //create a new node
            Node newnode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newnode;
                return;
            }
            //create new node to next
            tail.next = newnode;
            //tail=next node
            tail = newnode;
        }
        public void print(){
            if (head==null)
            {
                System.out.print(" link list is emty");
            }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
            System.out.println();


        }

        public void add(int idx,int data)
        {
            if (idx==0)
            {
                addFirst(data);
                return;
            }
            Node newNode=new Node(data);
            size++;
            int i=0;
            Node temp=head;

            while (i<idx-1)
            {
                temp=temp.next;
                i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;



        }
        public int removeFirst(){
        if (size==0)
        {
            System.out.println("the linked list is emty");
            return Integer.MIN_VALUE;

        }
        else if (size==1)
        {
            int val=head.data;
            head=tail=null;
            size=0;
            return val;

        }
        int val=head.data;
         head=head.next;
         size--;
         return val;

        }
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty :::");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node previous = head;
        for (int i = 0; i < size - 2; i++) {
            previous = previous.next;
        }

        int val = tail.data;
        previous.next = null;
        tail = previous;
        size--;
        return val;
    }
    public int serKey (int key)
    {
        //  key=10;
        Node temp=head;
        int i=0;
        while(temp!=null)
        {
            if (temp.data==key)
            {
                return i;

            }
            temp=temp.next;
            i++;
        }
        return -1;

    }
    public int helper(Node head,int key) {
        if (head == null)
            return -1;
        {
            if (head.data == key) {
                return 0;
            }
            int idx = helper(head.next, key);
            if (idx==-1)
            {
                return -1;
            }
            return idx+1;

        }
    }

        public int recSerach ( int key)
        {
            return helper(head, key);
        }


    public static void main (String[]args){
            adding ll = new adding();
           // ll.print();
            ll.addFirst(2);
           // ll.print();
            ll.addFirst(1);
          //  ll.print();
            ll.addLast(4);
          //  ll.print();
            ll.addLast(5);
           // ll.print();
            ll.add(2,3);
            System.out.println("before remove");
            ll.print();
           System.out.println("After remove ");
            ll.removeFirst();
            ll.print();
            System.out.println("after remove the last ");
            ll.removeLast();
            ll.print();
        System.out.println(ll.recSerach(3));




        }
    }
