package concept.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestNo {
    static int k = 3;
    static PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

    public static void processStream(int[] arr){
        for(int val: arr) {
            add(val);
            System.out.print(KthLargeNo() + " ");
        }
    }

    public static void add(int val){
        if(pq.size()<k) {
            pq.add(val);
        } else if (pq.peek()<val){
                pq.remove();
                pq.add(val);
            }
    }

    public static int KthLargeNo(){
       return pq.size()<k ?  -1: pq.peek();
    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,100,100,50};
        processStream(arr);
    }
}
