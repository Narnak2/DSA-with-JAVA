package Linked;

import java.util.Scanner;

public class Search {
    public static class Number{
        int data;
        Number next;
        public Number(int data){
            this.data= data;
            this.next=null;
        }
    }
    public static Number head;
    public static Number tail;

    public static int size;
    public void addFirst(int data){
        //create a new node or obj
        Number newObj=new Number(data);
        size++;
        if (head==null)
        {
            head=tail=null;
            return;
        }
        newObj.next=head;
        head=newObj;

    }
    public int serKey (int key)
    {
      //  key=10;
        Number temp=head;
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Search ll=new Search();
        ll.addFirst(1);
        ll.addFirst(3);
        ll.addFirst(5);
        System.out.println(ll.serKey(1));
        System.out.println(ll.serKey(4));;


    }
}
