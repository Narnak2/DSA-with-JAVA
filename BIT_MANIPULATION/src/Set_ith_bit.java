package BIT_MANIPULATION.src;

import java.util.Set;

public class Set_ith_bit {
    public static int Setithbit(int n, int i)
    {
        int bitmask=1<<i;
        return n|bitmask;

    }

    public static void main(String args[])
    {
        System.out.println(Setithbit(10,2));

    }
}
