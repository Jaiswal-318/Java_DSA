package concept.graph;

import java.util.ArrayList;
import java.util.Stack;

public class TopologicalSorting {
    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }
    public static Stack<Integer> topoSorting(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i< graph.length; i++){
            if(!vis[i])
                topoSortingUtil(graph,i,vis,stk);
        }
        return stk;
    }

    public static void topoSortingUtil(ArrayList<Edge>[] graph, int curr,boolean[] vis, Stack<Integer> stk){
        vis[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
               topoSortingUtil(graph,e.dest,vis,stk);
            }
        }
        stk.push(curr);
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge>[] graph = new ArrayList[V];

        for (int i = 0; i<V; i++)
            graph[i] = new ArrayList<>();

        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));

        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));

        graph[5].add(new Edge(5,0));
        graph[5].add(new Edge(5,1));

        Stack<Integer> stk = new Stack<>();
        stk = topoSorting(graph);

        while (!stk.isEmpty())
            System.out.print(stk.pop()+"  ");
    }
}
