package ConditionaStatement.java.src;

import java.util.Scanner;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a age");
        int age = sc.nextInt();

        //int age = 22;
        if (age > 18&&age<50) {
            System.out.println("Adult : Drive , vote");
        }
        else
        {
            System.out.println("bache ja ke dereamon dekho");
        }
    }
}