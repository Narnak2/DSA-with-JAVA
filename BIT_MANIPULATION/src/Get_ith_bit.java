package BIT_MANIPULATION.src;

public class Get_ith_bit {
    public static int getithbit(int n , int i)
    {
        int bitmask=1<<i;
        if ((n&bitmask)==0)
        {
            return 0;

        }
        else
        {
            return 1;
        }


    }
    public static void main(String args[])
    {

        int n;
        int i;
        System.out.println(getithbit(10,2));
    }
}
