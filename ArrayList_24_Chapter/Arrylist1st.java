package ArrayList_24_Chapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arrylist1st {
    public static void main(String args[])
    {
        ArrayList<Integer>List=new ArrayList<>();
        ArrayList<String>List2=new ArrayList<>();
        ArrayList<Boolean>List3=new ArrayList<>();
        ArrayList<Integer>List4=new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        System.out.println(List);
//        //get element
//        int elemet= List.get(3);
//        System.out.println(elemet);
//        //delete
//        List.remove(2);
//        System.out.println(List);
//        //set element
//        List.set(2,30);
//        System.out.println(List);
        //List contains = either the element exit in the arraylist or not
//        List.contains(1);
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter a number that you want to check either the number exit in the arraylist or not");
//        int n=sc.nextInt();
//        System.out.println(List.contains(n));
        //Adding the element between two array
        List.add(1,30);
        List.add(2,4);
        System.out.println(List);






    }


}
