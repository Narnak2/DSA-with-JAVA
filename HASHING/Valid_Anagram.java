package HASHING;
// given two string s and t return true, if t is anagaram of s and false otherwise
// eg , s = "care" t=race true;
// should have same character and same length of the char

import java.util.HashMap;

public class Valid_Anagram {
    public static boolean isAnangram(String s,String t)
    {
        if (s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Integer>str=new HashMap<>();
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            str.put(ch,str.getOrDefault(ch,0)+1);
        }
        for (int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
            if (str.get(ch)!=null)
            {
                if (str.get(ch)==1)
                {
                    str.remove(ch);
                }
                else str.put(ch,str.get(ch)-1);
            }
            else
                return false;
        }
return str.isEmpty();
    }
    public static void main(String[] args) {
        String t="rasce"; //0(n)
        String s="care";
        System.out.println(isAnangram(t,s));

    }
}
