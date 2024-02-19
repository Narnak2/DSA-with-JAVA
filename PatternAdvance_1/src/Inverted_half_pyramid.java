package PatternAdvance_1.src;

import java.util.Scanner;

public class Inverted_half_pyramid {


    /*
    12345
    1234
    123
    12
    1
     */

    public static void Inverted_Half_pyramidwithNumber( int n)
    {
        for (int i=1;i<=n;i++)
        {
            for (int j=1;j<=(n-i+1);j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }



    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        Inverted_Half_pyramidwithNumber(n);
    }

}
