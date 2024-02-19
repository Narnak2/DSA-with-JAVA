package Arrays.src;

import java.util.*;
public class LargestNumber {

    //find the largest number in a given array
    public static int Smallest(int numbers[])
    {
        int smallest=Integer.MAX_VALUE;
        for (int i=0;i<numbers.length;i++)
        {
            if (smallest>numbers[i])
            {
                smallest=numbers[i];
            }
        }
        return smallest;
    }
    public static int Getlargest(int numbers[]){

     int largest= Integer.MIN_VALUE;
     //int smallest=Integer.MAX_VALUE;

     for (int i=0;i<numbers.length;i++)
     {
         if (largest<numbers[i])
         {
             largest=numbers[i];
         }
     }
//     for (int i=0;i<numbers.length;i++)
//     {
//         if (smallest>numbers[i])
//         {
//             smallest=numbers[i];
//         }
//     }
//     System.out.println("smallest value is "+ smallest);
//
 return largest;
    }
    public static void main(String args[])
    {
        int numbers[]={1,2,3,4,5,6,7,8,9};
        System.out.println("largest number in  given array is "+ Getlargest(numbers));
        System.out.println("Smallest number given array is "+Smallest(numbers));



    }

}
