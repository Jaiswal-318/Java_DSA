package concept.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Bipartite {
    public static boolean isBipartite(ArrayList<Implementation.Edge>[] graph){
        int[] color = new int[graph.length];
        Arrays.fill(color,-1);

        Queue<Integer> Q = new LinkedList<>();

        for (int i = 0; i< graph.length; i++){
            if(color[i] == -1){
                color[i] = 0;   // BLUE
                Q.add(i);
            }
            while (!Q.isEmpty()){
                int curr = Q.remove();
                for(int j = 0; j<graph[curr].size(); j++){
                    Implementation.Edge e = graph[curr].get(j);
                    if(color[e.dest] == -1){
                        color[e.dest] = color[curr] == 0? 1:0;
                        Q.add(e.dest);
                    }else if(color[e.dest] == color[curr])
                        return false;
                }
            }
        }

        return true;
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
        graph[0].add(new Implementation.Edge(0,1,5));

        // 1 Vertex
        graph[1].add(new Implementation.Edge(1,0,5));
        graph[1].add(new Implementation.Edge(1,2,1));
        graph[1].add(new Implementation.Edge(1,3,3));

        // 2 Vertex
        graph[2].add(new Implementation.Edge(2,1,1));
        graph[2].add(new Implementation.Edge(2,3,1));
        graph[2].add(new Implementation.Edge(2,4,2));

        // 3 Vertex
        graph[3].add(new Implementation.Edge(3,1,3));
        graph[3].add(new Implementation.Edge(3,2,1));

        // 4 Vertex
        graph[4].add(new Implementation.Edge(4,2,2));

        System.out.println(isBipartite(graph));

    }
}
