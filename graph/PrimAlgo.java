package concept.graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimAlgo {
    static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int s,int d, int w){
            src = s;
            dest = d;
            wt = w;
        }
        @Override
        public String toString() {
            return src + " - " + dest + " @ " + wt;
        }
    }
    static class Pair implements Comparable<Pair>{
        int path;
        int vertx;

        Pair( int v,int p){
            vertx = v;
            path = p;

        }
        @Override
        public int compareTo(Pair p2){
            return this.path- p2.path;
        }
    }

    public static void primAlgo(ArrayList<Edge>[] graph) {
        boolean[] vis = new boolean[graph.length];
        ArrayList<Edge> mst = new ArrayList<>();

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int finalCost = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.vertx]) {
                vis[curr.vertx] = true;
                finalCost += curr.path;

                for (int i = 0; i < graph[curr.vertx].size(); i++) {
                    Edge e = graph[curr.vertx].get(i);
                    if (!vis[e.dest]) {
                        pq.add(new Pair(e.dest, e.wt));
                        mst.add(new Edge(e.src, e.dest, e.wt));
                    }
                }
            }
        }
        System.out.println("final cost " + finalCost);
        System.out.println("Minimum Spanning Tree:");
        for (Edge edge : mst) {
            System.out.print(edge+"  ");
        }
    }

    public static void main(String[] args) {
        int v = 4;

        ArrayList<Edge>[] graph = new ArrayList[v];

        for (int i = 0; i<v; i++)
            graph[i] = new ArrayList<>();

        graph[0].add(new Edge(0,1,10));
        graph[0].add(new Edge(0,2,15));
        graph[0].add(new Edge(0,3,30));

        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,2,40));

        graph[2].add(new Edge(2,0,15));
        graph[2].add(new Edge(2,3,50));

        graph[3].add(new Edge(3,0,30));
        graph[3].add(new Edge(3,1,40));
        graph[3].add(new Edge(3,2,50));

        primAlgo(graph);


    }
}
