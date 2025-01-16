package concept.graph;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class BFS {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    public static int V = 7;

    /*
     public static void bfs(ArrayList<Edge>[] graph) {
       // Initialize a queue for BFS
        Queue<Integer> q = new LinkedList<>();
        // Visited array to keep track of visited vertices
        boolean vis[] = new boolean[graph.length];

        // Add the source node (0) to the queue and start BFS
        q.add(0);

        // Loop until the queue is empty
        while (!q.isEmpty()) {
            // Remove the front element of the queue
            int curr = q.remove();

            // If the current node is not visited
            if (!vis[curr]) {
                // Visit the current node
                System.out.print(curr + " ");
                vis[curr] = true; // Mark it as visited

                // Traverse through all edges of the current node
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    // Add the destination node of the edge to the queue if not visited
                    if (!vis[e.dest]) {
                        q.add(e.dest);
                    }
                }
            }
        }
    }
     */

    public static void main(String[] args) {

        ArrayList<Edge>[] graph = new ArrayList[V];
        LinkedHashSet<Integer> bfs = new LinkedHashSet<>();

        for (int i = 0; i < V; i++)
            graph[i] = new ArrayList<>();

        // 0 Vertex
        graph[0].add(new Edge(0,1,1));
        graph[0].add(new Edge(0,2,1));

        // 1 Vertex
        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        // 2 Vertex
        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        // 3 Vertex
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));
        graph[3].add(new Edge(3,5,1));

        // 4 Vertex
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));
        graph[4].add(new Edge(4,5,1));

        // 5 Vertex
        graph[5].add(new Edge(5,3,1));
        graph[5].add(new Edge(5,4,1));

        // 6 Vertex
        graph[6].add(new Edge(6,5,1));


        for (ArrayList<Edge> edges : graph) {
            int t1 = 0;
            while (t1 < edges.size()) {
                Edge e = edges.get(t1);
                bfs.add(e.src);
                System.out.println(e.src);
                t1++;
            }
        }
        System.out.println(bfs);
    }
}
