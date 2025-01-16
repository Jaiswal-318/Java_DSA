package concept.queue;

import java.util.PriorityQueue;

public class ConnectTwoRopes {
        public static int minCostTwoRopes(int[] arr){
                PriorityQueue<Integer> pq = new PriorityQueue<>();
                for (int i : arr)
                        pq.add(i);
                int totalCost = 0;
                while (pq.size() >1){
                    int first = pq.poll();
                    int second = pq.poll();

                    int minCost = first + second;
                    totalCost +=minCost;
                    pq.add(minCost);
                }
            return totalCost;
        }

     public static void main(String[] args) {
          int[] arr = {4,2,3,6};
         System.out.println(minCostTwoRopes(arr));
     }
}
