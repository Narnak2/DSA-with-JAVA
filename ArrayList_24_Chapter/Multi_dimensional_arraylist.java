package ArrayList_24_Chapter;

import java.util.ArrayList;
public class Multi_dimensional_arraylist {
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>>mainList=new ArrayList<>();
        ArrayList<Integer>List=new ArrayList<>();
        List.add(1); List.add(2);
        mainList.add(List);
        ArrayList<Integer>List2=new ArrayList<>();
        List2.add(3);List2.add(4);
        mainList.add(List2);
        ArrayList<Integer>List3=new ArrayList<>();
        List3.add(12);
        List3.add(34);
        mainList.add(List3);
        for (int i=0;i<mainList.size();i++)
        {
            ArrayList<Integer>currentList=mainList.get(i);
            for (int j=0;j<currentList.size();j++)
            {
                System.out.print(currentList.get(j)+" ");
            }
            System.out.println();
        }
System.out.println(mainList);

    }
}
