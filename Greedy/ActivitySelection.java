package Greedy;

import java.util.*;
public class ActivitySelection {
    public static void main(String[] args) { // 0(n)
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        // sorting
        int activities[][]=new int[start.length][3];
        for(int i=0;i<start.length;i++)
        {
            activities[i][0]=i;
            activities[i][1]=start[i];
            activities[i][2]=end[i];
        }
        // Lambda function -> Short form of function
        // sorting the 2D array using the inbuilded function
        Arrays.sort(activities,Comparator.comparingDouble(o->o[2]));


        // end time basic sorted
        int maxAct=0;
        ArrayList<Integer>ans=new ArrayList<>();
        maxAct=1;
        //1st activity
       // ans.add(0);
        ans.add(activities[0][0]);
        //int lastend=end[0];
        int lastend=activities[0][2];
        for (int i=1;i<end.length;i++)
        {
            //if (start[i]>=lastend)
            if (activities[i][1]>=lastend)
            {
                //activity select
                maxAct++;
                //ans.add(i);
                ans.add(activities[i][0]);
                //lastend=end[i];
                lastend=activities[i][2];
            }

        }
        System.out.println("max activity ="+maxAct);
        for (int i=0;i<ans.size();i++)
        {
            System.out.print("A"+ans.get(i)+" ");

        }


    }
}
