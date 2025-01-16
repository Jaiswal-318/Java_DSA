package concept.graph;

import java.util.*;

public class Flights {
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
    static class Pair{
        int vertx;
        int cost;
        int stops;

        Pair( int v,int c,int s){
            vertx = v;
            cost = c;
            stops = s;
        }
    }
        public static int cheapest(ArrayList<Edge>[] graph, int src, int dest, int k){
        int[] dist = new int[graph.length];

        for (int i = 0; i< graph.length;i++){
            dist[i] = i == src ? 0:Integer.MAX_VALUE;
        }
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src,0,0));

            while(!q.isEmpty()){
                Pair curr = q.remove();
                if (curr.stops > k) {
                    break;
                }

                for (int i = 0; i<graph[curr.vertx].size(); i++){
                        Edge e = graph[curr.vertx].get(i);
                        int u = e.src;
                        int v = e.dest;
                        int w = e.wt;

                        if((dist[u] + curr.stops)< dist[v]){
                            dist[v] = dist[u]+ w;
                            q.add(new Pair(v,dist[v],curr.stops+1 ));
                        }
                }
            }
            if (dist[dest] == Integer.MAX_VALUE){
                return -1;
            }else{
                return dist[dest];
            }
    }


    public static void main(String[] args) {
        int v = 3;
        ArrayList<Edge>[] graph = new ArrayList[v];
        for (int i = 0; i<v; i++)
            graph[i] = new ArrayList<>();

        graph[0].add(new Edge(0,1,100));
        graph[0].add(new Edge(0,2,200));

        graph[1].add(new Edge(1,2,100));

        int src = 0;
        int dest = 2;
        int k = 1;

        System.out.println(cheapest(graph,src,dest,k));

    }

}
