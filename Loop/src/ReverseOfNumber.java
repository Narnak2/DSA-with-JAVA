public class ReverseOfNumber {
    public static void main(String []args)
    {
        // reverse of number
        int n=1234;
        while (n>0)
        {
            int Lastdigit=n%10;
            System.out.print(Lastdigit);
            n=n/10;
        }
    }
}
