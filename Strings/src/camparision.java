package Strings.src;

public class camparision {
    // camparision of two string
    public static void main(String args[])
    {
        String s1= "Naran khadka";
        String s2=new String("Naran khadka");
       /* if (s1==s2) this is not workig to string in java so
        {
            System.out.println("ok");
        }
        else
        {
            System.out.println("not ok");
        }*/
// the following code will give the correct answer in java

        if (s1.equals(s2))
        {
            System.out.println("ok ");
        }
        else {
            System.out.println("not ok");
        }

    }
}
