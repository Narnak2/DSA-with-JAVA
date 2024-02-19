package Strings.src;

import java.util.Scanner;

public class Q1 {
    public static int  countvowels(String str)
    {
        int count=0;
        for (int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if (c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                count++;
            }
        }

return count;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.println("enter a Strings");
        str=sc.nextLine();
        System.out.println(countvowels(str));



    }

}
