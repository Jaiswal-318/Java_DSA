package concept.graph;

import java.util.ArrayList;
import java.util.Arrays;

public class BellmanFord {
    static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int s,int d,int w){
            src = s;
            dest =d;
            wt = w;
        }
    }

    public static int[] bellmanFord(ArrayList<Edge>[] graph, int src){
        int[] dist = new int[graph.length];

        for (int i = 0; i< graph.length; i++)
            dist[i] = i == src ? 0:Integer.MAX_VALUE;

            for (int j = 0; j< graph.length; j++){
                for (int k = 0; k <graph[j].size(); k++){
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int w = e.wt;

                    if(dist[v] > dist[u]+w)
                        dist[v] = dist[u]+w;
                }
            }
        return dist;
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];

        for (int i = 0; i<v; i++)
            graph[i] = new ArrayList<>();

        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));

        graph[1].add(new Edge(1,2,-4));

        graph[2].add(new Edge(2,3,2));

        graph[3].add(new Edge(3,4,4));

        graph[4].add(new Edge(4,1,-1));

        int[] ans = bellmanFord(graph,0);
        System.out.println(Arrays.toString(ans));
    }
}
