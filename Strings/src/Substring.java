package Strings.src;

public class Substring {
    public static String substring(String str, int si, int ei)
    {
        String substr="";
        for (int i=si;i<ei;i++)
        {
            substr+=str.charAt(i);
        }


        return substr;

    }

    public static void main(String  args[])
    {

        String str="helloworld";
        System.out.println(substring( str,0,5));
        /*
        java inbuild function
        String n=str.substring(0,4);
        System.out.println(n);*/


    }
}
