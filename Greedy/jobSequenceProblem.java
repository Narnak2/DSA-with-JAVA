package Greedy;

import java.sql.SQLOutput;
import java.util.*;
public class jobSequenceProblem {

        static class Job{
            int deadline;
            int profit;
            int id;//0(A),1(B),2(C),3(D)
            public Job(int i,int d,int p)
            {
                id=i;
                deadline=d;
                profit=p;
            }
        }

    public static void main(String[] args) {
        int jobsInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job>jobs=new ArrayList<>();
        for (int i=0;i<jobsInfo.length;i++)
        {
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }
        Collections.sort(jobs,(Obej1,Obje2)-> Obje2.profit);//decending order
        ArrayList<Integer>seq=new ArrayList<>();
        int time=0;
        for (int i=0;i<jobs.size();i++)
        {
            Job curr=jobs.get(i);
            if (curr.deadline>time)
            {
                seq.add(curr.id);
                time++;
            }

        }
        System.out.println("max job ="+ seq.size());
        for (int i=0;i<seq.size();i++)
        {
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();




    }
}
