package PatternAdvance_1.src;

public class ButterflyPattern {
    public static  void Butterfly(int n)
    {
        //outer loops
        //1st half
        for (int i=1;i<=n;i++)
        {
            //stars __ * (i)
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //space__ 2(n-i)
            for (int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");

            }
            //stars __ *
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();


        }
        //2nd half

        for (int i=n-1;i>=1;i--)
        {

            //stars __ * (i)
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            //space__ 2(n-i)
            for (int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");

            }
            //stars __ *
            for (int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String args[])

    {
                Butterfly(4);
    }
}
