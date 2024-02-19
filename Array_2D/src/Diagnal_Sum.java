package Array_2D.src;

public class Diagnal_Sum {
    public static int dignal_sum(int array[][])
    {
       int sum=0;
       /* this is not optimised code , the time complexity  is 0(n^2)
        for (int i=0;i<array.length;i++)
        {
            for (int j=0;j<array[0].length;j++)
            {
                if (i==j) {
                    sum += array[i][j];
                }
                else if ( i+j==array.length-1)
                {
                    sum+=array[i][j];
                }


            }
        }
*/
        // optimised code is following

for (int i=0; i<array.length;i++)
{
    //primary
    sum+=array[i][i];
    //secondary
    if (i!=array.length-1-i) {
        sum += array[i][array.length - i - 1];// j+i=array.length-1 (n-1)
    }                      // j=array.length-1-i;
}

return sum;


    }
    public static void main(String args[])
    {
        int array[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
       System.out.print(dignal_sum(array));
        
    }



}
