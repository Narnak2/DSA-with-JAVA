package Arrays.src;

import java.util.*;
public class TRAPPED_WATER_22_MIDDLE_LEVEL_QS {
    //given n non -negative intergers representing an height(elevation) map where the width of each bar is 1 , compute how much water it can trap after rainging.

    public static int trappedwater(int height[])
    {
        int n=height.length;
        //calculate left max boundary _array
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for ( int i=1; i<n;i++)
        {
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        //calculate right max boundary _ array
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for (int i=n-2;i>=0;i--)
        {
            rightmax[i]=Math.max(height[i],rightmax[i+1]);

        }
        int trappdWater=0;
        //loop
        for (int i=0;i<n;i++)
        {
            //waterlevel=min(leftmax boundary , rightmax boundary );
            int waterlevel=Math.min(leftmax[i],rightmax[i]);

            //trapped water += water level-height[i]
            trappdWater+=waterlevel-height[i];

        }
        return trappdWater;
    }
    public static void main(String args[])
    {
        int height[]={4,2,0,6,3,2,5};
        trappedwater(height);
        System.out.println(trappedwater(height));
    }

}
