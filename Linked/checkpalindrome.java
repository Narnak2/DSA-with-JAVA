package Linked;

public class checkpalindrome{
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
//    public void Find_removenth(int n){
//        //calculate size
//        int size=0;
//        Node temp=head;
//        while (temp!=null)
//        {
//            temp=temp.next;
//            size++;
//        }
//        System.out.println(size);
//
//        if (n==size)
//        {
//            head=head.next;//remove first
//            return;
//
//        }
//        //size-n
//        int i=1;
//        int iToFind=size-n;
//        Node prev=head;
//        while (i<iToFind)
//        {
//            prev= prev.next;
//            i++;
//
//        }
//        prev.next=prev.next.next;
//        return;
//
//
//
//    }
    //slow fast approach
    public Node findMid(Node head)
    {
        Node slow=head;
        Node fast=head;
        while (fast!=null&&fast.next!=null)
        {
            slow=slow.next;//+1
            fast=fast.next.next;//=2
        }
        return slow;

    }
    public boolean Checkpalindromeornot()
    {
        //base case
        if (head==null&&head.next==null)
        {
            return true;
        }
        //step 1 to find the mid
        Node midnode=findMid(head);
        // to reverse the  2nd half linked list
        Node prev=null;
        Node curr=midnode;
        Node next;
        while (curr!=null)
        {
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        Node right=prev;//right half head
        Node left=head;

        // check right = left
        while (right!=null)
        {
            if (left.data!=right.data)
            {
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;


    }


    public static void main(String[] args) {
        checkpalindrome ll=new checkpalindrome();
        ll.Addfirst(1);
        ll.Addfirst(2);
        ll.Addfirst(2);
     //   ll.Addfirst(1);
        ll.print();
        System.out.println(ll.Checkpalindromeornot());


        // System.out.println(ll.size);


    }
}
