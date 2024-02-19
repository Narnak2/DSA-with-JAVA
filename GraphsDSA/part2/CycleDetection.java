package GraphsDSA.part2;

import java.util.ArrayList;

public class CycleDetection {
    public static class Edge {
        int sou, dest;

        public Edge(int s, int d) {
            this.sou = s;
            this.dest = d;
        }
    }

    public static boolean detectCycle(ArrayList<Edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i] && detectCycleUtil(graph, vis, i, -1)) {
                return true;
            }
        }
        return false;
    }

    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean vis[], int curr, int par) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                if (detectCycleUtil(graph, vis, e.dest, curr)) {
                    return true;
                }
            }
            // case 1
            else if (vis[e.dest] && e.dest != par) {
                return true;
            }
            // case 2 -> continues;
        }

        return false;
    }

    static void createGraph(ArrayList<Edge> graphs[]) {
        for (int i = 0; i < graphs.length; i++) {
            graphs[i] = new ArrayList<>();
        }
        graphs[0].add(new Edge(0, 1));
         graphs[0].add(new Edge(0,2));
        graphs[0].add(new Edge(0, 3));

        graphs[1].add(new Edge(1, 0));
        graphs[1].add(new Edge(1, 2));

        graphs[2].add(new Edge(2,0));
        graphs[2].add(new Edge(2, 1));
        graphs[3].add(new Edge(3, 0));
        graphs[3].add(new Edge(3, 4));

        graphs[4].add(new Edge(4, 3));
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        System.out.println(detectCycle(graph));
    }
}
