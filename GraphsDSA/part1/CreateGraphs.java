package GraphsDSA.part1;

import java.util.ArrayList;

public class CreateGraphs {
    static class  Edges{

        int source ,dest,wt;
        public Edges(int s,int d,int w)
        {
            this.source=s;
            this.dest=d;
            this.wt=w;
        }

    }
    public static void main(String[] args) {
        int V=5;
        // int arr[]=new arr[V]; normal value
       ArrayList<Edges>[] graphs=new ArrayList[V] ;// null stored  -> empty arraylist
        //creating  empty arraylist
        for ( int i=0;i<V;i++)
        {
            graphs[i]=new ArrayList<>();
        }
        // 0 vertex
        graphs[0].add(new Edges(0,1,5));
        //1 vertex
        graphs[1].add(new Edges(1,0,5));
        graphs[1].add(new Edges(1,2,1));
        graphs[1].add(new Edges(1,3,3));

        // 2 vertex
        graphs[2].add(new Edges(2,1,1));
        graphs[2].add(new Edges(2,3,1));
        graphs[2].add(new Edges(2,4,2));

        // 3 vertex
        graphs[3].add(new Edges(3,1,3));
        graphs[3].add(new Edges(3,2,1));
        // 4 vertex
        graphs[4].add(new Edges(4,2,2));

        // 2's neighbors
        for (int i=0;i<graphs[2].size();i++)
        {
            Edges e=graphs[2].get(i);
            // 2's neighbors is the  destination
            System.out.println(e.dest);
        }





    }
}
