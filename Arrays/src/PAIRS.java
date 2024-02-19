package Arrays.src;

public class PAIRS {
    public static void Pairsprint(int numbers[])
    {
        int total_pairs=0;
        for (int i=0;i<numbers.length;i++)
        {
            int curr=numbers[i];//2,4,6,8,10
            for (int j=i+1;j<numbers.length;j++)
            {
                System.out.print("("+curr+","+numbers[j]+")");
                total_pairs++;
            }
            System.out.println();

        }
        System.out.println(total_pairs);

    }
    public static void main(String args[])
    {
        int numbers[]={2,4,6,8,10};
        Pairsprint(numbers);

    }
}
