package concept.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TopoSortBFS {

    public static void calcInDeg(ArrayList<TopologicalSorting.Edge>[] graph,int[] inDeg){
        for (ArrayList<TopologicalSorting.Edge> edges : graph) {
            for (TopologicalSorting.Edge e : edges) {
                inDeg[e.dest]++;
            }
        }
    }
    public static void topoBFS(ArrayList<TopologicalSorting.Edge>[] graph){
        int[] inDeg = new int[graph.length];
        calcInDeg(graph,inDeg);

        Queue<Integer> Q = new LinkedList<>();

        for(int i = 0; i < inDeg.length; i++){
            if(inDeg[i] == 0)
                Q.add(i);
        }
        while (!Q.isEmpty()){
            int curr = Q.remove();
            System.out.print(curr+"  ");
             for(int j = 0; j<graph[curr].size(); j++){
                 TopologicalSorting.Edge e = graph[curr].get(j);
                 inDeg[e.dest]--;

                 if(inDeg[e.dest] ==0)
                     Q.add(e.dest);
             }
        }

    }
    public static void main(String[] args) {
        int V = 6;
        ArrayList<TopologicalSorting.Edge>[] graph = new ArrayList[V];

        for (int i = 0; i<V; i++)
            graph[i] = new ArrayList<>();

        graph[2].add(new TopologicalSorting.Edge(2,3));

        graph[3].add(new TopologicalSorting.Edge(3,1));

        graph[4].add(new TopologicalSorting.Edge(4,0));
        graph[4].add(new TopologicalSorting.Edge(4,1));

        graph[5].add(new TopologicalSorting.Edge(5,0));
        graph[5].add(new TopologicalSorting.Edge(5,2));

        topoBFS(graph);
    }
}
