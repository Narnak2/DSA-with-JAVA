package HASHING;

import java.util.HashSet;

public class CountDistinctElements {
    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
        HashSet<Integer>count=new HashSet<>();
        for (int i=0;i<arr.length;i++)
        {
            count.add(arr[i]);
        }
        System.out.println("ans="+count.size());
    }
}
