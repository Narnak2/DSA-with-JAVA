package BIT_MANIPULATION.src;

public class EvenOrOdd {
    public static void evenorodd(int n)
    {
        // if least significant  bit is 1 then the number is odd
        //if least significant bit is 0 then the number is even
        //example 001 the number 001 has lsb 1 therefore the number is odd
        int bitmask=1;
        if ((n&bitmask)==0)
        {
            System.out.println("even number");

        }
        else{
            System.out.println("odd number");
        }


    }
    public static void main(String args[])
    {
        evenorodd(3);
evenorodd(4);
evenorodd(14);


    }
}
