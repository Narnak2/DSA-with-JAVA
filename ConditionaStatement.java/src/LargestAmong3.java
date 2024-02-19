package ConditionaStatement.java.src;

import java.util.Scanner;

public class LargestAmong3
{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
       // int a=12,b=34,c=39;

        System.out.println("enter  number");
        int a=sc.nextInt();

        System.out.println("enter b number");
        int b=sc.nextInt();

        System.out.println("enter c number");
        int c=sc.nextInt();


        // find a greatest number among three number

        if (a>=b&&a>=c)
        {
            System.out.println(a+"::is largest number");
        }
        else if(b>=c)
        {
            System.out.println(b+" ::is largest number");

        }
        else {
            System.out.println(c+"::is largest number");
        }

    }
}
