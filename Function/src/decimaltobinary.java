package Function.src;

import java.util.Scanner;

public class decimaltobinary {
    //program to covert decimal to binary
    public static void dectobin(int n)
    {
        int mynumber=n;
        int pow=0;
        int rem;
        int binarynumber = 0;

        while(n>0)
        {
            rem=n%2;
            binarynumber=binarynumber+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;


        }
        System.out.println("binary form of "+mynumber+" = "+binarynumber);
    }

    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter decimal number ");
        int n=sc.nextInt();
        dectobin(n);

    }

}
