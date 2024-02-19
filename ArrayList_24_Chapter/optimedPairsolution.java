package ArrayList_24_Chapter;

import java.util.ArrayList;

public class optimedPairsolution {
    public static boolean pairSum(ArrayList<Integer>List,int target)
    {
        int lp=0;
        int rp=List.size()-1;

        while (lp!=rp)
        {
            //case 1
            if (List.get(lp)+List.get(rp)==target)
            {
                return true;
            }
            //case2
            if (List.get(lp)+List.get(rp)<target)
            {
                lp++;
            }
            //case 3
            else {
                rp--;
            }
        }
        return false;
    }
    public static void main(String args[])
    {
        ArrayList<Integer> List=new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        int target=50;
        boolean result=pairSum(List,target);
        System.out.println("Pair with sum " + target + " exists: " + result);

    }
}
