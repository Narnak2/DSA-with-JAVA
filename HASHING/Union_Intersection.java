package HASHING;

import java.util.HashSet;

public class Union_Intersection {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        // using hashset
        HashSet<Integer>map=new HashSet<>();
        //Union
        for (int i=0;i<arr2.length;i++)
        {
                map.add(arr2[i]);
        }
        for (int i=0;i<arr1.length;i++)
        {
            map.add(arr1[i]);
        }
        System.out.println("Union is :="+map.size());

        // for intersection
        map.clear();
        for (int i=0;i<arr1.length;i++)
        {
            map.add(arr1[i]);
        }
        int count=0;
        for (int i=0;i<arr2.length;i++)
        {
            if (map.contains(arr2[i]))
            {
                count++;
                map.remove(arr2[i]);
            }

        }
        System.out.println("Intersection = " +count);


    }



}
