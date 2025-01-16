package concept.graph;

import java.util.ArrayList;

public class CycleDetection {
    public static boolean cycleDetect(ArrayList<Implementation.Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        for (int i = 0; i< graph.length; i++){
           if(!vis[i] && detectUtil(graph,-1,i,vis))
               return true;
        }
        return false;
    }

    public static boolean detectUtil(ArrayList<Implementation.Edge>[] graph, int par, int curr, boolean[] vis){
        vis[curr] = true;
        for(int i = 0; i<graph[curr].size();i++){
            Implementation.Edge e = graph[curr].get(i);

        // CASE-1:
            if(vis[e.dest] && e.dest != par)
                return true;
        // CASE-2
            else if(!vis[e.dest] && detectUtil(graph,curr,e.dest,vis))
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
        ArrayList<Implementation.Edge>[] graph = new ArrayList[V];

        for (int i = 0; i < V; i++)
            graph[i] = new ArrayList<>();

        // 0 Vertex
        graph[0].add(new Implementation.Edge(0, 1, 5));

        // 1 Vertex
        graph[1].add(new Implementation.Edge(1, 0, 5));
        graph[1].add(new Implementation.Edge(1, 2, 1));
        graph[1].add(new Implementation.Edge(1, 3, 3));

        // 2 Vertex
        graph[2].add(new Implementation.Edge(2, 1, 1));
        graph[2].add(new Implementation.Edge(2, 3, 1));
        graph[2].add(new Implementation.Edge(2, 4, 2));

        // 3 Vertex
        graph[3].add(new Implementation.Edge(3, 1, 3));
        graph[3].add(new Implementation.Edge(3, 2, 1));

        // 4 Vertex
        graph[4].add(new Implementation.Edge(4, 2, 2));

        System.out.println(cycleDetect(graph));
    }
}
