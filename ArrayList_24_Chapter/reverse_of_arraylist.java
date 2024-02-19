package ArrayList_24_Chapter;

import java.util.ArrayList;

public class reverse_of_arraylist {
    public static void main(String args[])
    {
        ArrayList<Integer>List=new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        //print reverse
        for (int i=List.size()-1;i>=0;i--)
        {
            System.out.print(i+" ");
        }
        System.out.println();



    }


}
