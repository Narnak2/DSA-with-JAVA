package Arrays.src;

import java.util.*;
public class maxsubarrays_kadanes {
    public static void kadanes(int numbers[])
    {
        int maxsubarray=Integer.MIN_VALUE;
        int currentsum=0;
        for (int i=0;i<numbers.length;i++)
        {
            currentsum=currentsum+numbers[i];
            if (currentsum<0)
            {
                currentsum=0;

            }
            maxsubarray=Math.max(currentsum, maxsubarray);

        }

        System.out.println("out max subarrays sum is "+maxsubarray);
    }



    public static void main(String args[])
    {
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        kadanes(numbers);
    }
}
