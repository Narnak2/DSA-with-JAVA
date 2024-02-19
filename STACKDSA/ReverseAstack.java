package STACKDSA;

import java.util.Stack;
public class ReverseAstack {
    public static String reverseString(String str)
    {
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length())
        {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result=new StringBuilder("");
        while(!s.isEmpty())
        {
            char curr=s.pop();
            result.append(curr);
        }
        str=result.toString();
        return str;

    }

    public static void main(String[] args) {
      //  Stack<Character> s=new Stack<>();
        String str="ABC";
        String result=reverseString(str);
        System.out.println(result);



    }
}
