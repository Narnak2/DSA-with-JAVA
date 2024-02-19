package ConditionaStatement.java.src;

import java.util.*;

public class EvenOdd
{
    //check if given number is odd or even
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int number=sc.nextInt();
        if (number%2==0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }



    }

}
