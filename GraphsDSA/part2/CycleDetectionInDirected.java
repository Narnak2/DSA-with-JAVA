package GraphsDSA.part2;

import java.util.ArrayList;

public class CycleDetectionInDirected {
    static class Edge{
        int sour;
        int dest;
        public Edge(int s,int d)
        {
            this.sour=s;
            this.dest=d;
        }
    }

    static void createGraph(ArrayList<Edge> graph[])
    {
        for (int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,2));
        graph[1].add(new Edge(1,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,0));

    }
    public static boolean isCyle(ArrayList<Edge>[]graph)
    {
        boolean vis[]=new boolean[graph.length];
        boolean stack[]=new boolean[graph.length];

        for (int i=0;i<graph.length;i++)
        {
            if (!vis[i])
            {
                if (isCyleUtil(graph,i,vis,stack))
                {
                    return true;
                }
            }
        }
        return false;

    }
    public static boolean isCyleUtil(ArrayList<Edge>[]graph,int curr,boolean vis[],boolean stack[])
    {
        vis[curr]= true;
        stack[curr]=true;
        for (int i=0;i<graph[curr].size();i++)
        {
            Edge e=graph[curr].get(i);
            if (stack[e.dest])
            {
                return true;
            }
            if (!vis[e.dest]&&isCyleUtil(graph,e.dest,vis,stack))
            {
                return true;
            }
        }
        stack[curr]=false;
        return false;


    }
    public static void main(String[] args) {
        int V=5;
        ArrayList<Edge>graph[]=new ArrayList[V];
        createGraph(graph);
        System.out.println(isCyle(graph));


    }
}
