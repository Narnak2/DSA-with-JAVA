package Greedy;

import java.util.Arrays;
import java.util.Comparator;

public class MaxlengthChainOfPair_activities_selection {
    public static void main(String[] args) {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs, Comparator.comparingDouble(o->o[1]));
        int chainlen=1;
        int pairEnd=pairs[0][1];//last selected pair end // chain end
        for (int i=1;i<pairs.length;i++)
        {
            if (pairs[i][0]>pairEnd)
            {
                chainlen++;
                pairEnd=pairs[i][1];
            }
        }
        System.out.println("max length is "+chainlen);



    }
}
