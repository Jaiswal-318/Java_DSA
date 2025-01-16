package concept.graph;

import java.util.ArrayList;

public class ConnectedGraph {
    static class Edge{
        int src;
        int dest;
        int wt;

        Edge(int s,int d,int w){
            src = s;
            dest = d;
            wt = w;
        }
    }

    public static void dfsUtil(ArrayList<Edge>[] graph,boolean[] vis){
        for (int i = 0; i<graph.length; i++){
            if(!vis[i])
                dfs(graph,i,vis);
            }
        }


    public static void dfs(ArrayList<Edge>[] graph,int src,boolean[] vis){
        System.out.println(src+"  ");
        vis[src] = true;
        for(int i = 0;i< graph[src].size(); i++){
            Edge e = graph[src].get(i);
           if(!vis[e.dest])
               dfs(graph,e.dest,vis);
        }
    }
    public static void main(String[] args) {
/*                4
                 /
           0    / (2)
           |   2
       (5) |  /  \ (1)
           | /(1) \
           1 ------3
               (3)
*/
        int V = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        boolean[] vis = new boolean[graph.length];

        for (int i = 0; i < V; i++)
            graph[i] = new ArrayList<>();

        // 0 Vertex
        graph[0].add(new Edge(0,1,5));

        // 1 Vertex
        graph[1].add(new Edge(1,0,5));
        graph[1].add(new Edge(1,2,1));
        graph[1].add(new Edge(1,3,3));

        // 2 Vertex
        graph[2].add(new Edge(2,1,1));
        graph[2].add(new Edge(2,3,1));

        // 3 Vertex
        graph[3].add(new Edge(3,1,3));
        graph[3].add(new Edge(3,2,1));

        // 4 Vertex
        graph[4].add(new Edge(4,4,0));

        dfsUtil(graph,vis);
    }

}
