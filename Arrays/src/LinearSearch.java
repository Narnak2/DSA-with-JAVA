package Arrays.src;

import java.util.*;
public class LinearSearch {

    // find the index of element in a given array
    public static int LINEARSEARCH(int number[] , int key)
    {
        for (int i = 0;i<number.length;i++ )
        {
            if(number[i]==key)
            {
                return i;
            }
            
        }

        return -1;
    }

    public static void main(String args[])
    {
        int number[]={ 2,4,6,8,10,12,14,16,18};
        int key=10;
        int index=LINEARSEARCH(number,key);
        if (index==-1){
            System.out.println("KEY NOT FOUND");

        }
        else
        {
            System.out.println("key is "+ index);
        }

    }

}
