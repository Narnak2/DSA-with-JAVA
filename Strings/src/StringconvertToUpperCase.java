package Strings.src;

import java.util.Scanner;

public class StringconvertToUpperCase {
    public static String toUpperCase(String str)
    {
        StringBuilder sb=new StringBuilder(" ");
        char ch= Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i =1; i<str.length();i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1)
            {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));

            }
            else
            {
                sb.append(str.charAt(i));

            }

        }

return sb.toString();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.println("enter you message or sentence");
        str=sc.nextLine();

       // String str="hi, i am naran khadka";
        System.out.println(toUpperCase(str));

    }

}
