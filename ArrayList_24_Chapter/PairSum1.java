package ArrayList_24_Chapter;

import java.util.ArrayList;

public class PairSum1 {
    public static boolean pairSum(ArrayList<Integer>List,int target) {

        for (int i = 0; i < List.size(); i++) {
            for (int j = i + 1; j < List.size(); j++) {
                if (List.get(i) + List.get(j) == target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main (String args[])
    {
        ArrayList<Integer>List=new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        int target=50;
System.out.println(pairSum(List,target));
    }
}
