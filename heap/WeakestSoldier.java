package concept.heap;

import java.util.PriorityQueue;

public class WeakestSoldier {
    static class Troops implements Comparable<Troops>{
        int idx;
        int soldiers;
        Troops(int idx,int soldiers){
            this.idx = idx;
            this.soldiers = soldiers;
        }

        @Override
        public int compareTo(Troops t1) {
            if(this.soldiers == t1.soldiers)
                return this.idx - t1.idx;
            else
                return this.soldiers - t1.soldiers;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Troops> pq = new PriorityQueue<>();
        int[][] arr = {{1,0,0,0},
                       {1,1,1,1},
                       {1,0,0,0},
                       {1,0,0,0}};

        int k =2;
        for (int i = 0; i< arr.length;i++){
            int count = 0;
           for(int j = 0;j<arr[i].length;j++){
               if(arr[i][j] == 1)
                   count++;
           }
           pq.add(new Troops(i,count));
        }
        for(Troops t : pq)
            System.out.println(t.soldiers);

        for (int i = 0; i<k;i++)
            System.out.println("Row_"+pq.remove().idx);
    }
}
