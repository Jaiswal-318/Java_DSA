package concept.graph;

import java.util.ArrayList;

public class AllPathTrack {
    static class Edge{
        int src;
        int dest;

        Edge(int s,int d){
           src = s;
           dest = d;
        }
    }

    public static void path(ArrayList<Edge>[] graph,int src,int dest,StringBuilder sb){
        if(src == dest){
            sb.append(dest);
            System.out.println(sb);
            int i = sb.length();
            sb.delete(0,i);
            return;
        }


        for (int i = 0; i<graph[src].size(); i++){
            sb.append(src);
            Edge e = graph[src].get(i);
            path(graph, e.dest, dest, sb);
        }
    }
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int V = 6;
        int src =5;
        int dest =1;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i<V; i++)
            graph[i] = new ArrayList<>();

        graph[0].add(new Edge(0,3));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,2));

        path(graph,src,dest,sb);
    }
}
