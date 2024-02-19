package GraphsDSA.part2;
import java.util.*;


import java.lang.reflect.Array;
import java.util.ArrayList;

public class TologicalSorting {
    static class Edge{
        int sour,dest;
        public Edge(int s,int d){
            this.dest=d;
            this.sour=s;
        }

    }
    public static void createGraphs(ArrayList<Edge>[]graph)
    {
        for (int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));

    }

    public static void topSort(ArrayList<Edge>[]graph)
    {
        boolean vis[]=new boolean[graph.length];
        Stack<Integer>s=new Stack<>();
        for (int i=0;i<graph.length;i++)
        {
            if (!vis[i])
            {
                topSortUtil(graph,i,vis,s);//modified dsa
            }
        }
        while (!s.isEmpty())
        {
            System.out.print(s.pop()+" ");
        }
    }
    public static void topSortUtil(ArrayList<Edge>[]graph,int curr,boolean vis[],Stack<Integer>s)
    {
        vis[curr]=true;
        for (int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if (!vis[e.dest]) {
                topSortUtil(graph,e.dest,vis,s);

            }
        }
        s.push(curr);
    }
    //Topological sorting is used only for DAGS (Nor for non-DAGS)
    public static void main(String[] args) {
        int v=6;
        ArrayList<Edge>graph[]= new ArrayList[v];
        createGraphs(graph);
        topSort(graph);


    }


}
