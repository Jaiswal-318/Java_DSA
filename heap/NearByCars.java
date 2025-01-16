package concept.heap;

import java.util.*;
public class NearByCars {
    static class Points implements Comparable<Points>{
        int x;
        int y;
        int distSq;
        int idx;

        Points(int x,int y, int distSq,int idx){
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;
        }
        @Override
                public int compareTo(Points P2){
            return this.distSq-P2.distSq;
        }
    }

    public static void main(String[] args) {
        int[][] points = {{3,3},{5,-1},{-2,4}};
        int k = 2;
        PriorityQueue<Points> pq = new PriorityQueue<>();
        for (int i = 0; i<points.length; i++){
            int distsq = points[i][0]*points[i][0]+ points[i][1]*points[i][1];
            pq.add(new Points(points[i][0],points[i][1],distsq,i));
        }
        for (int i = 0; i<k;i++){
            System.out.println("C"+pq.remove().idx);
        }
    }
}
