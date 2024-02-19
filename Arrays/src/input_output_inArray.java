package Arrays.src;

import java.util.Scanner;

public class input_output_inArray {

    public static void main(String args[])
    {
        int marks[]=new int[30];

        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println("Marks[0]= "+marks[0]);
        System.out.println("Marks[1]= "+marks[1]);
        System.out.println("Marks[2]= "+marks[2]);
        System.out.println(marks.length);




    }

}
