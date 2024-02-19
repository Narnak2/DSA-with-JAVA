package GraphsDSA.part3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class TopologicalSortingUsing_BFS {
    //kanhn's Algorithm
    // in-degree,out-degree
    //we use the in degree
    static class Edge{
        int sour,dest;
        public Edge(int s,int d)
        {
            this.sour=s;
            this.dest=d;
        }

    }
    public static void createGraphs(ArrayList<Edge>[]graph)
    {
        for (int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        graph[5].add(new Edge(5,2));
        graph[5].add(new Edge(5,0));

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,1));
        graph[4].add(new Edge(4,0));
    }
    public static void calIndeg(ArrayList<Edge>[]graph,int ideg[])
    {
        for (int i=0;i<graph.length;i++)
        {
            int v=i;
            for (int j=0;j<graph[v].size();j++)
            {
                Edge e=graph[v].get(j);
                ideg[e.dest]++;
            }
        }
    }
    public static void topSort(ArrayList<Edge>[]graph)
    {
        int indeg[]=new int[graph.length];
        calIndeg(graph,indeg);
        Queue<Integer>q=new ArrayDeque<>();
        for (int i=0;i<indeg.length;i++)
        {
            if (indeg[i]==0){
                q.add(i);
            }
        }//bfs
        while (!q.isEmpty())
        {
            int curr=q.remove();
            System.out.print(curr+" ");
            for (int i=0;i<graph[curr].size();i++)
            {
                Edge e=graph[curr].get(i);
                indeg[e.dest]--;
                if (indeg[e.dest]==0)
                {
                    q.add(e.dest);
                }
            }

        }
        System.out.println();

    }
    public static void main(String[] args) {
        int V=6;
        ArrayList<Edge>graph[]=new ArrayList[V];
        createGraphs(graph);
        topSort(graph);


    }
}
