package PatternAdvance_1.src;

import java.awt.*;
import java.util.Scanner;

public class Zero_One_triangle {
    //print the following line
    /*
    1
    01
    101
    0101
    10101
     */
    public static void zeroonetriangle( int n)
    {
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }

            }
            System.out.println();
        }


    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n number");
        int n=sc.nextInt();
        zeroonetriangle(n);



    }

}
