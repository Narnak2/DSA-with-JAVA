package BackTrakingDsa;

import java.util.Scanner;

public class gridways {
    //Find numbers of ways to reach from (0,0) to (n-1),(m-1) in N*M Grid allowed moves right or down
    public static int gridWays(int i,int j, int n, int m)
    {
        // base case
        if (i==n-1&&j==m-1)//boundary for last cell
        {
            return 1;

        }
        else if(i==n||j==m)// boundary cross condition
        {
            return 0;
        }

        int ways1=gridWays(i+1,j,n,m);
        int ways2=gridWays(i,j+1,n,m);
        return ways1+ways2;

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n numbers");
        int n=sc.nextInt();
        System.out.println("enter m numbers");
        int m=sc.nextInt();
        //int n=3,m=3;
        System.out.println(gridWays(0,0,n,m));

    }
}
