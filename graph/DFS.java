package concept.graph;

import java.util.ArrayList;

public class DFS {
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
        public static ArrayList<Edge>[] graph = new ArrayList[V];
        public static boolean[] visited = new boolean[V];

    static {
        for (int i = 0; i <V; i++)
            graph[i] = new ArrayList<>();
    }

        public static void dfs(int vertex){
            int curr = vertex;
            System.out.print(curr + " ");
            visited[curr] = true;
            for (int i = 0; i<graph[curr].size(); i++){
                Edge e = graph[curr].get(i);
                if(!visited[e.dest])
                    dfs(e.dest);
            }
        }
        public static void main(String[] args) {
            // 0 Vertex
            graph[0].add(new Edge(0, 1, 1));
            graph[0].add(new Edge(0, 2, 1));

            // 1 Vertex
            graph[1].add(new Edge(1, 0, 1));
            graph[1].add(new Edge(1, 3, 1));

            // 2 Vertex
            graph[2].add(new Edge(2, 0, 1));
            graph[2].add(new Edge(2, 4, 1));

            // 3 Vertex
            graph[3].add(new Edge(3, 1, 1));
            graph[3].add(new Edge(3, 4, 1));
            graph[3].add(new Edge(3, 5, 1));

            // 4 Vertex
            graph[4].add(new Edge(4, 2, 1));
            graph[4].add(new Edge(4, 3, 1));
            graph[4].add(new Edge(4, 5, 1));

            // 5 Vertex
            graph[5].add(new Edge(5, 3, 1));
            graph[5].add(new Edge(5, 4, 1));
            graph[5].add(new Edge(5,6,1));

            // 6 Vertex
            graph[6].add(new Edge(6, 5, 1));

            dfs(0);

        }
    }
