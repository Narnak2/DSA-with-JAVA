package GraphsDSA.part2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class is_Biaprtitte {
    static class Edge{
        int src;
        int dest;
        public Edge(int s,int d)
        {
            this.src=s;
            this.dest=d;

        }
    }
    static void createGraph(ArrayList<Edge>graph[])
    {
        for (int i=0;i<graph.length;i++)
        {
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,4));

        graph[3].add(new Edge(3,1));
       // graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(4,2));
       // graph[4].add(new Edge(4,3));


    }
    public static boolean isBipartile(ArrayList<Edge>[]graph)
    {
        int col[]=new int[graph.length];
        for (int i=0;i<col.length;i++)
        {
            col[i]=-1;
        }
        Queue<Integer>q=new ArrayDeque<>();
        for (int i=0;i<graph.length;i++)
        {
            if (col[i]==-1)
            {
                q.add(i);
                col[i]=0;//yellow
                while (!q.isEmpty())
                {
                    int curr=q.remove();
                    for (int j=0;j<graph[curr].size();j++)
                    {
                        Edge e=graph[curr].get(j);//e.dest
                        if (col[e.dest]==-1)
                        {
                            int nextCol=col[curr]==0 ? 1 :0;
                            col[e.dest]=nextCol;
                            q.add(e.dest);
                        }
                        else if (col[e.dest]==col[curr])
                        {
                            return false;//not biapartile
                        }

                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //if graph doesn't have cycle , defult this is bipartile
        // Acyclic True
        // Even cycle true
        // Odd cycle false
        int V=5;
        ArrayList<Edge>graph[]=new ArrayList[V];
        createGraph(graph);
        System.out.println(isBipartile(graph));

    }
}
