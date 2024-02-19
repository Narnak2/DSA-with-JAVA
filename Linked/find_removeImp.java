package Linked;

public class find_removeImp {
    public class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;

        }

    }
    public int  size;
    public Node head;
    public  Node tail;
    public void Addfirst(int data){
        //create a new object
        Node newnode=new Node(data);
        size++;
        if (head==null)
        {
            head=tail=newnode;
            return;

        }
        newnode.next=head;
        head=newnode;


    }
    public void Addlast(int data)
    {
        Node newnode=new Node(data);
        size++;
        if (head==null)
        {
            head=tail=newnode;
            return;
        }
        tail.next=newnode;
       tail=newnode;

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
    public void Find_removenth(int n){
        //calculate size
        int size=0;
        Node temp=head;
        while (temp!=null)
        {
            temp=temp.next;
            size++;
        }
        System.out.println(size);

        if (n==size)
        {
            head=head.next;//remove first
            return;

        }
        //size-n
        int i=1;
        int iToFind=size-n;
        Node prev=head;
        while (i<iToFind)
        {
            prev= prev.next;
            i++;

        }
        prev.next=prev.next.next;
        return;



    }


    public static void main(String[] args) {
        find_removeImp ll=new find_removeImp();
        ll.Addfirst(2);
        ll.Addfirst(1);
        ll.Addlast(3);
        ll.Addlast(4);
        ll.Addlast(5);
        ll.print();
     //   ll.Find_removenth();
        ll.Find_removenth(4);
        ll.print();

       // System.out.println(ll.size);


    }
}
