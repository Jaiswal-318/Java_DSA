package concept.graph;

import java.util.ArrayList;

public class IsCycleDirected {
    public static boolean cycleDetect(ArrayList<Implementation.Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];
        for (int i = 0; i< graph.length; i++){
            if(!vis[i] && isCycle(graph,i,vis,stack))
                return true;
        }
        return false;
    }

    public static boolean isCycle(ArrayList<Implementation.Edge>[] graph,int curr,boolean[] vis,boolean[] stack){
        vis[curr] = true;
        stack[curr] = true;
        for(int i = 0; i<graph[curr].size(); i++){
            Implementation.Edge e = graph[curr].get(i);

            if( vis[e.dest] && stack[e.dest])
                return true;
            else if(!vis[e.dest])
               return isCycle(graph,e.dest,vis,stack);
        }
        stack[curr] = false;

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



        // 1 Vertex
        graph[1].add(new Implementation.Edge(1,2,1));
        graph[1].add(new Implementation.Edge(1,0,5));

        // 2 Vertex
        graph[2].add(new Implementation.Edge(2,3,1));
        graph[2].add(new Implementation.Edge(2,4,2));

        // 3 Vertex
        graph[3].add(new Implementation.Edge(3,1,3));

        System.out.println(cycleDetect(graph));


    }
}
