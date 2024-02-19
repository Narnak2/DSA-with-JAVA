package GraphsDSA.part2;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class Connected_Components {
    public static class Edges {
        int sou, dest, wt;

        public Edges(int s, int d, int w) {
            this.sou = s;
            this.dest = d;
            this.wt = w;
        }
    }

    static void createGraphs(ArrayList<Edges>[] graphs) {
        for (int i = 0; i < graphs.length; i++) {
            graphs[i] = new ArrayList<>();
        }
        graphs[0].add(new Edges(0, 1, 1));
        graphs[0].add(new Edges(0,2,1));

        graphs[1].add(new Edges(1,0,1));
        graphs[1].add(new Edges(1,3,1));

        graphs[2].add(new Edges(2,0,1));
        graphs[2].add(new Edges(2,4,1));

        graphs[3].add(new Edges(3,1,1));
        graphs[3].add(new Edges(3,4,1));
        graphs[3].add(new Edges(3,5,1));

        graphs[4].add(new Edges(4,2,1));
        graphs[4].add(new Edges(4,3,1));
        graphs[4].add(new Edges(4,5,1));

        graphs[5].add(new Edges(5,3,1));
        graphs[5].add(new Edges(5,5, 1));
        graphs[5].add(new Edges(5,6,1));


        graphs[6].add(new Edges(6,5,1));




    }
    public static void bfs(ArrayList<Edges>[]graph)
    {
        boolean visited[]=new boolean[graph.length];
        for (int i=0;i<graph.length;i++)
        {
            if (!visited[i])
            {
                bfsUtil(graph,visited);
            }
        }

    }

    public static void bfsUtil(ArrayList<Edges>[]graph,boolean visited[])// 0(V+E)
    {
        Queue<Integer> q=new ArrayDeque<>();
      //  boolean visited[]=new boolean[graph.length];
        q.add(0);//source =0
        while (!q.isEmpty())
        {
            int curr=q.remove();
            if (!visited[curr])
            {
                System.out.print(curr+" ");
                visited[curr]=true;
                for (int i=0;i<graph[curr].size();i++)
                {
                    Edges e=graph[curr].get(i);// neighbors

                    q.add(e.dest);

                }
            }
        }

    }
    public static void dfs(ArrayList<Edges>[]graph)
    {
        boolean vis[]=new boolean[graph.length];
        for (int i=0;i<graph.length;i++)
        {
            dfsUtil(graph,i,vis);
        }
    }

    public static void dfsUtil(ArrayList<Edges>[]graphs, int curr, boolean visited[])
    {
        System.out.print(curr+" ");
        visited[curr]=true;
        for (int i=0;i<graphs[curr].size();i++)
        {
            Edges e=graphs[curr].get(i);
            if (!visited[e.dest])
            {
                dfsUtil(graphs,e.dest,visited);
            }
        }

    }

    public static void main(String[] args) {


    }
}



