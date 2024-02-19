package PATTERNPRINTING;

public class Pattern {
    public static void main(String[] args) {
        int n = 5;
        Pattern1(n);
        Pattern2(n);
        Pattern3(n);

    }

    static void Pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


        static void Pattern2 ( int n)
        {
            /*
             * * * * *
             * * * *
             * * *
             * *
             *
             */
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        static void Pattern3 ( int n)
        {

            for (int i=1;i<=n;i++)
            {
                for (int j=1;j<=i;j++)
                {
                    System.out.printf("%d",j);
                }
                System.out.println();
            }

        }


}
