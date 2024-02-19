package ArrayList_24_Chapter;

public class pair_In_Array {
    public static void pairArray(int[] arr)
    {
        //loop for pair
        for(int i=0;i<arr.length;i++)
        {
          //  int curr=arr[i];
            for (int j=i+1;j<arr.length;j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+")");
            }
              System.out.println();
        }

    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,8};
        pairArray(arr);
    }
}
