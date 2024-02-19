package STACKDSA;

import java.util.Stack;

public class maxAreainHistogram {
    public static void MaxArea(int arr[])
    {
        int maxAreas=0;
        int nsr[]=new int[arr.length];
        int nsl[]=new int[arr.length];
        //next smaller right
        Stack<Integer>s=new Stack<>();
        for (int i =arr.length-1;i>0;i--)
        {
            while (!s.isEmpty()&&arr[s.peek()]>=arr[i])
            {
                s.pop();

            }
            if (s.isEmpty())
            {
                nsr[i]=arr.length;
            }
            else {
                nsr[i]=s.peek();
            }
            s.push(i);
        }

        // next smaller left
        s=new Stack<>();
        for (int i =0;i<arr.length;i++)
        {
            while (!s.isEmpty()&&arr[s.peek()]>=arr[i])
            {
                s.pop();

            }
            if (s.isEmpty())
            {
                nsl[i]=-1;
            }
            else {
                nsl[i]=s.peek();

            }
            s.push(i);
        }

        //current area: width =j-i-1 =nsr[i]-nsl[i]-1
        for (int i=0;i<arr.length;i++)
        {
            int height =arr[i];
            int width=nsr[i]-nsl[i]-1;
            int currAraa=height*width;
            maxAreas=Math.max(currAraa,maxAreas);

        }
        System.out.println("maximum area in histogram   "+maxAreas);





    }

    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        MaxArea(arr);

    }
}
