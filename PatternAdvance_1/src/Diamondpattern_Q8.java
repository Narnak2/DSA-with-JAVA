package PatternAdvance_1.src;

public class Diamondpattern_Q8 {

    // refer to page num 50 in java copy and pattern advance question num //
    public static void DIAMONDPATTERN(int n)
    { // 1st half
        for (int i=1;i<=n;i++)
        {
            //for the space
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");

            }
            //for the star
            for (int j=1;j<=((2*i)-1);j++){
                System.out.print("*");
            }

            System.out.println();

        }

        for (int i=n;i>=1;i--)
        {

            //for the space
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");

            }
            //for the star
            for (int j=1;j<=((2*i)-1);j++){
                System.out.print("*");
            }

            System.out.println();


        }
    }

    public static void main(String args[])
    {
       DIAMONDPATTERN(5);
    }





}


