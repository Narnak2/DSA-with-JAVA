package Function.src;

import java.util.Scanner;

public class Binarytodecimal {
    public static void binum(int n)
    {
        int mynumber=n;
        int pow=0;
        int dec=0;
        while(n>0)
        {
            int lastdigit=n%10;
            dec=dec+(lastdigit*(int) Math.pow(2,pow));
            pow++;
            n=n/10;
            //System.out.println("decimal of "+ mynumber+"="+dec);
        }
        System.out.println("decimal of  "+ mynumber+" = "+dec);

    }
    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter binary number 0 and 1");

        int n=sc.nextInt();
        binum(n);
    }
}

