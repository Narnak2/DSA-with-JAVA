package OOPS_CONCEPTS;

public class oops {
    public static boolean isprime(int n)
    {
        if (n==2){
            return true;
        }
        //boolean is prime= true;
        for (int i=2; i<=n-1;i++)
        {
            if (n%i==0) {
                return false;
            }

        }
        return  true;
    }
    public static void main(String arg[]) {
        System.out.println(isprime(10));


    }
}


