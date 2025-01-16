package concept.heap;

import java.util.Arrays;
import java.util.PriorityQueue;

public class NRopes {
    public static void main(String[] args) {
        Integer[] ropes = {3,2,4,6,3};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Arrays.asList(ropes));
        int cost = 0;

        while(pq.size() > 1){
            int sum = pq.poll() + pq.poll();
            cost += sum;
            pq.add(sum);
        }
        System.out.println("Min cost to connect the ropes: "+cost);
    }
}
