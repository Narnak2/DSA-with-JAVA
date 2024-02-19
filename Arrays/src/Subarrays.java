package Arrays.src;

public class Subarrays {
    public static void SUBARRAYS(int numbers[])
    {
        int ts=0;
        for (int i=0;i<numbers.length;i++)
        {
            //int i=start
            for (int j=i;j<numbers.length;j++){
                //int j=end;

                for (int k=i;k<=j;k++)
                {
                    System.out.print(numbers[k]+" ");//subarrays
                }
                ts++;
                System.out.println();
            }
            System.out.println();



        }
        System.out.println(ts);
    }
    public static void main(String args[])
    {
        int numbers[]={2,4,6,8,10};
SUBARRAYS(numbers);
    }

}
