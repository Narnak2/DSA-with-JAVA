package Arrays.src;

/*public class maxsubarrays{
    public static void Maxsubarrays(int numbers[])
    {
        int currentsum=0;
        int maxsum=Integer.MIN_VALUE;

        for (int i=0;i<numbers.length;i++)
        {
            //int i=start
            for (int j=i;j<numbers.length;j++){
                //int j=end;
                currentsum=0;



                for (int k=i;k<=j;k++)
                {
                    currentsum+=numbers[k];
                  //  System.out.print(numbers[k]+" ");//subarrays
                }
                System.out.println(currentsum);
                if (maxsum<currentsum)
                {
                    maxsum=currentsum;
                }
            }
        }
        System.out.println("max sum=" +maxsum);
    }
    public static void main(String args[])
    {
        int numbers[]={1,-2,6,-1,3};
        Maxsubarrays(numbers);
    }

}
*/
public class maxsubarrays {
    public static int maxSubArray(int[] nums) {
        int maxEndingHere = nums[0];
        int maxSoFar = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(nums[i], maxEndingHere + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
}


