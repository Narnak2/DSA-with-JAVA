package GraphsDSA.part1;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class BFS_graphs {
    //using adjacency List
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
    public static void bfs(ArrayList<Edges>[]graph)// 0(V+E)
    {
        Queue<Integer>q=new ArrayDeque<>();
        boolean visited[]=new boolean[graph.length];
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


    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edges>[] graphs = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graphs[i] = new ArrayList<>();
        }

        createGraphs(graphs);
        bfs(graphs);

        // Now you can perform BFS or any other graph-related operations.
    }
}
