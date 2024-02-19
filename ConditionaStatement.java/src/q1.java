package ConditionaStatement.java.src;

import java.util.Scanner;

public class q1 {
    public static void main(String[]args){
        //java code for checking weather number is positive or negative

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your tem ");
        Double number =sc.nextDouble();

        if (number>100)
        {
            System.out.println("You have a fiver");
        }
        else {
            System.out.println("Don't worry ! You don't have a fiver");

        }
    }
}
