package Function.src;

import java.util.Scanner;

public class biocoffe {
        public static int factoria(int n )
        {
            int f=1;
            for(int i=1;i<=n;i++)
            {
                f=f*i;
            }

            return f;

        }
        public static int bincoeff(int n, int r)
        {
            int fact_n=factoria(n);
            int fact_r=factoria(r);
            int fact_nmr=factoria(n-r);
            int bincoeff= fact_n/(fact_r*fact_nmr);
            return bincoeff;
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int r=sc.nextInt();
            System.out.println(bincoeff(n,r));


        }


}
