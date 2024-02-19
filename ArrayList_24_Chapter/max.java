package ArrayList_24_Chapter;

import java.util.ArrayList;

public class max {
    public static void main(String args[])
    {
        ArrayList<Integer>List=new ArrayList<>();
        List.add(5);
        List.add(50);
        List.add(1);
        List.add(3);
        List.add(26);
        int max=Integer.MIN_VALUE;
        for (int i=0;i<List.size();i++)
        {
//            if (max<List.get(i))
//            {
//                max=List.get(i);
            max=Math.max(max,List.get(i));

        }
        System.out.println("max element ="+max);


    }
}
