package ArrayList_24_Chapter;

import java.util.ArrayList;

public class swap {
    public static void Swapp(ArrayList<Integer>List,int idx1,int idx2)
    {
        int temp= List.get(idx1);
        List.set(idx1,List.get(idx2));
        List.set(idx2,temp);
    }
    public static void main(String args[])
    {
        ArrayList<Integer>List=new ArrayList<>();
        List.add(5);
        List.add(50);
        List.add(1);
        List.add(3);
        List.add(26);
        System.out.println(List);
        int idx1=1,idx2=3;

        Swapp(List,idx1,idx2);
        System.out.println(List);


    }


}
