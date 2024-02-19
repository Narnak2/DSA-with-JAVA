package BackTrakingDsa;

import java.util.Scanner;

public class find_subset {
    /*Find the subset of the String */
    public static void findSusSets(String str,String ans,int i)
    {
        //base case
        if (i==str.length()) {
            if (ans.length()==0) {
                System.out.println("null");
            }
            else {
                System.out.println(ans);

                return;
            }

        }

        //Yes choice
        findSusSets(str,ans+str.charAt(i),i+1);
        //no choice
        findSusSets(str,ans,i+1);



    }
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a stirng: ");
        String str=scanner.nextLine();
        //String str="abcdfdfs";
        findSusSets(str,"",0);
        scanner.close();
    }
}
