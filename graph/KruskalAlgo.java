package concept.graph;

import java.util.ArrayList;
import java.util.Collections;

public class KruskalAlgo {
    static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int wt;

        Edge(int s,int d, int w){
            src = s;
            dest = d;
            wt = w;
        }
        public int compareTo(Edge e2){
            return this.wt - e2.wt;
        }
    }
    static int n = 4;
    static int[] par = new int[n];
    static int[] rank = new int[n];

    public static void init(){
        for (int i = 0; i<n; i++ )
            par[i] = i;
    }
    public static int find(int x){
        if(x == par[x])
            return x;

        return par[x] = find(par[x]);
    }
    public static void union(int a,int b){
        int parA = find(a);
        int parB = find(b);
        if(parA == parB)
            return;

        if(rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        }else if(rank[parA]>rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        }else{
            par[parA] = parB;
            rank[parB]++;
        }
    }
    public static int  kruskal(ArrayList<Edge> edges){
        init();
        Collections.sort(edges);
        int mstCost = 0;

        for (Edge e : edges) {
            int parS = find(e.src);
            int parD = find(e.dest);

            if (parD != parS) {
                union(parD, parS);
                mstCost += e.wt;
            }
        }
        return mstCost;
    }

    public static void main(String[] args) {
        ArrayList<Edge> edges = new ArrayList<>();

        edges.add(new Edge(0,1,10));
        edges.add(new Edge(0,2,15));
        edges.add(new Edge(0,3,30));

        edges.add(new Edge(2,0,15));
        edges.add(new Edge(2,3,50));

        edges.add(new Edge(1,0,10));
        edges.add(new Edge(1,3,40));

        edges.add(new Edge(3,0,30));
        edges.add(new Edge(3,1,40));
        edges.add(new Edge(3,2,50));

        System.out.println(kruskal(edges));

    }
}
