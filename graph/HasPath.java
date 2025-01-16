package concept.graph;

import java.util.*;

public class HasPath {
    static class Edge {
        int src;
        int dest;
        int wt;

        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            wt = w;
        }
    }
    public static boolean hasPath(ArrayList<Edge>[] graph,int src,int dest,boolean[] visited){
        if (src == dest)
            return true;

        visited[src] = true;
        for(int i = 0; i< graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if(!visited[e.dest] && hasPath(graph,e.dest,dest,visited))
                return true;
        }
        return false;
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
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < V; i++)
            graph[i] = new ArrayList<>();

        // 0 Vertex
        graph[0].add(new Edge(0, 1, 5));

        // 1 Vertex
        graph[1].add(new Edge(1, 0, 5));
        graph[1].add(new Edge(1, 2, 1));
        graph[1].add(new Edge(1, 3, 3));

        // 2 Vertex
        graph[2].add(new Edge(2, 1, 1));
        graph[2].add(new Edge(2, 3, 1));
        graph[2].add(new Edge(2, 4, 2));

        // 3 Vertex
        graph[3].add(new Edge(3, 1, 3));
        graph[3].add(new Edge(3, 2, 1));

        // 4 Vertex
        graph[4].add(new Edge(4, 2, 2));

        System.out.println(hasPath(graph,0,4,visited));
    }
}
