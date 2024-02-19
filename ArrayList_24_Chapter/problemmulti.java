package ArrayList_24_Chapter;

import java.util.ArrayList;

public class problemmulti {
    public static void main(String args[])

    {
        ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
        ArrayList<Integer>List1=new ArrayList<>();
        ArrayList<Integer>List2=new ArrayList<>();
        ArrayList<Integer>List3=new ArrayList<>();
        mainList.add(List1);
        mainList.add(List2);
        mainList.add(List3);
        for (int i=1;i<=5;i++)
        {
            List1.add(i*1);
            List2.add(i*2);
            List3.add(i*3);
        }

        System.out.println(mainList);
        List2.remove(3);
        List2.remove(2);

        for (int i=0;i<mainList.size();i++)
        {
            ArrayList<Integer>currList=mainList.get(i);
            for (int j=0;j<currList.size();j++)
            {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();

        }
//        List2.remove(3);
//        List2.remove(2);






    }
}
