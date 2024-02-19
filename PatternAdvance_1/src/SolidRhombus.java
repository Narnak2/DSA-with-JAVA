package PatternAdvance_1.src;

public class SolidRhombus {
    //print this pattern

    /*
    *****
   *****
  *****
*****

     */

    public static void SOLID_RHOMBUS(int n )
    {
      //  Outer loops
        for (int i=1;i<=n;i++)
        {
            //inner loop for space
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();

        }

    }

    public static void main(String args[])
    {
        SOLID_RHOMBUS(5);
    }
}
