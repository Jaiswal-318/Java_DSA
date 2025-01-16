package concept.heap;


import java.util.PriorityQueue;

public class SlidingWindow {
    static class Window implements Comparable<Window>{
        int val;
        int idx;
        Window(int val,int idx){
            this.val = val;
            this.idx = idx;
        }
        @Override
        public int compareTo(Window w1){
            return w1.val-this.val;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int k = 3;
        PriorityQueue<Window> pq = new PriorityQueue<>();
        int[] ans = new int[arr.length-k+1];

        for(int i = 0; i<k; i++)
            pq.add(new Window(arr[i], i));
        ans[0] = pq.peek().val;

        for (int i = k; i<n; i++) {
            while (!pq.isEmpty() && pq.peek().idx <= (i - k)) {
                pq.remove();
            }
            pq.add(new Window(arr[i],i));
            ans[i-k+1] = pq.peek().val;
        }
        for (int i : ans)
            System.out.print(i+" ");
        }
    }

