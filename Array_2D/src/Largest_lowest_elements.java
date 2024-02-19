package Array_2D.src;

import java.util.Scanner;
import java.util.*;

public class Largest_lowest_elements {
    public static  void largest_smallest(int array[][])
    {
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++)
            {
                if (array[i][j]>largest)
                {
                    largest=array[i][j];
                }
            }
            for (int j=0;j<array[0].length;j++)
            {
                if (array[i][j]<smallest)
                {
                    smallest=array[i][j];
                }
            }

        }

        System.out.println("your largest elements in given array is "+largest);
        System.out.println("your largest elements in given array is "+smallest);

    }

    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter rows of arrays");
        int n=scan.nextInt();
        System.out.println("enter columns of arrays");
        int m=scan.nextInt();
        int array[][]=new int[n][m];
        for (int i=0;i<array.length;i++)
        {
            for (int j=0;j<array[0].length;j++)
            {
                System.out.println("enter arrays elements");
                array[i][j]=scan.nextInt();
            }
        }
        largest_smallest(array);

    }

}
