package concept.graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstraAlgo {

    public static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w){
            src = s;
            dest = d;
            wt = w;
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

    public static void dijkstra(ArrayList<Edge>[] graph, int src){
        int[] dist = new int[graph.length];

        for(int i = 0; i< graph.length; i++){
            if(i != src)
            dist[i] = Integer.MAX_VALUE;
        }
        boolean[] vis = new boolean[graph.length];

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src,0));

        while (!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.vertx]){
                vis[curr.vertx] = true;

                for (int i = 0; i<graph[curr.vertx].size(); i++){
                    Edge e = graph[curr.vertx].get(i);
                    int u = e.src;
                    int v = e.dest;
                    int w = e.wt;

                    if((dist[u] + w)< dist[v] ){
                        dist[v] = dist[u]+ w;
                    pq.add(new Pair(v,dist[v]));}
                }
            }
        }
        for (int i: dist)
            System.out.print(i+"  ");
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];

        for (int i = 0; i<v; i++)
            graph[i] = new ArrayList<>();

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,7));

        graph[2].add(new Edge(2,4,3));

        graph[3].add(new Edge(3,5,1));

        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));

        dijkstra(graph,0);
    }
}
