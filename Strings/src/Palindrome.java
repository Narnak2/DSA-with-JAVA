package Strings.src;

import java.util.Scanner;
// check ifa String is a palindrome
// palindrome is a word that is like "naran" which we can read from both side and the pronounce and meaning is same from both side

public class Palindrome {
    public static boolean IsPalindrome(String str)
    {
        for (int i=0;i<str.length()/2;i++)
        {
            if (str.charAt(i)!=str.charAt(str.length()-1-i))
            {
                return false;
            }
        }

      return true;
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a word");
        String str= sc.nextLine();
       // String str="racecar";
        System.out.println(IsPalindrome(str));
    }
}
