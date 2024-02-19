package PatternAdvance_1.src;

import java.util.Scanner;

public class hollow_rectrangle {
    //printing the following
    /* *****
       *   *
       *   *
       *****
     */
    public static void Hollow_Rectrangle(int rows,int columns){
        //outer loops for rows
        for (int i=1;i<=rows;i++)
        {
            //inner loops for columns
          for (int j=1;j<=columns;j++)
          {
              if (i==1||i==rows||j==1||j==columns)
              {
                  System.out.print("*");
              }
              else
              {
                  System.out.print(" ");
              }

          }

          System.out.println();
        }

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rows number");
        int rows= sc.nextInt();
        System.out.println("Enter columns  number");
        int columns=sc.nextInt();
Hollow_Rectrangle(rows,columns);
    }

}
