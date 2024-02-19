package Array_2D.src;

import java.util.Scanner;

public class Spriral_matrix {
    public static void spriralmatrix(int matrix[][])
    {

        int startrow=0;
        int endrow=matrix.length-1;
        int startcol=0;
        int endcol=matrix[0].length-1;
        while (startrow<=endrow&&startcol<=endcol)
        {
            //top

            for (int j=startcol;j<=endcol;j++)
            {
                System.out.print(matrix[startrow][j]+" ");

            }
            for (int i=startrow+1;i<=endrow;i++)
            {
                System.out.print(matrix[i][endcol]+" ");

            }

            for (int j=endcol-1;j>=startcol;j--)
            {
                if (startrow==endrow)
                {
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");

            }
            for (int i=endrow-1;i>=startrow+1;i--)
            {
                if (startcol==endcol)
                {
                    break;
                }
                System.out.print(matrix[i][startcol]+" ");

            }
            startcol++;
            startrow++;
            endrow--;
            endcol--;

        }
        System.out.println();


    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of rows ");
        int n = sc.nextInt();
        System.out.println("enter the size of columns");
        int m = sc.nextInt();
        int matrix[][] = new int[n][m];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println("enter arrays elements");
                matrix[i][j] = sc.nextInt();
            }

            spriralmatrix(matrix);


        }

    }
}
