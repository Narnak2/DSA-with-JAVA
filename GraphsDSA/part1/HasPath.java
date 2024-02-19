package GraphsDSA.part1;

import java.util.ArrayList;

public class HasPath {
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
        graphs[5].add(new Edges(5,5,1));
        graphs[5].add(new Edges(5,6,1));


        graphs[6].add(new Edges(6,5,1));
    }

    public static boolean Has_path(ArrayList<Edges>[] graph, int src, int dest, boolean vis[]) {
        if (src == dest) {
            return true;
        }
        vis[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            Edges e = graph[src].get(i);
            if (!vis[e.dest] && Has_path(graph, e.dest, dest, vis)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edges>[] graphs = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            graphs[i] = new ArrayList<>();
        }
        createGraphs(graphs);

        System.out.println(Has_path(graphs, 0, 5, new boolean[V]));
    }
}
