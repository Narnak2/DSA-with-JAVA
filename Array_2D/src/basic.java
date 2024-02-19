package Array_2D.src;

import java.util.Scanner;

public class basic {
    public static boolean findkey (int array[][],int key)
    {

        for (int i=0;i<array.length;i++)
        {
            for (int j=0;j<array[0].length;j++)
            {
                if (array[i][j]==key){
                    System.out.println("found at cell ( " +i+" ,"+ j+" )");

                    return true;
                }
            }
        }
    System.out.println("key not found");
     return false;
    }
    public static void main(String arg[]) {
        int key=5;

        // 2d arrays
        Scanner scan = new Scanner(System.in);
        System.out.println("enter  rows of the arrays");
        int n = scan.nextInt();
        System.out.println("enter columns of the arrays");
        int m = scan.nextInt();


        int array[][] = new int[n][m];

        for (int i = 0; i < array.length; i++) {
            //array[o].length is columns size
            for (int j = 0; j < array[0].length; j++) {
                System.out.println("enter arrays elements");
                array[i][j] = scan.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        findkey(array, key);

    }
}
