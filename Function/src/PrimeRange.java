package Function.src;

import java.util.Scanner;

public class PrimeRange {
    //program to print all prime number from 2 to n number
    public static boolean isPrime(int n)
    {
        if(n==2)
        {
            return true;

        }
        for (int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;

    }
    public static void Primerange(int n){
        for (int i=2;i<=n;i++)
        {
            if ((isPrime(i))){
                System.out.print(i+" ");
            }

        }
        System.out.println();



    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner( System.in);
        System.out.println("Enter the number you want to see up to that number prime");
        int n=sc.nextInt();

Primerange(n);


    }

}
