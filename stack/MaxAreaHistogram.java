package concept.stack;

import java.util.Stack;

public class MaxAreaHistogram {

    public static int maxAreaHisto(int[] h) {
        Stack<Integer> stk = new Stack<>();
        int[] nsl = new int[h.length];
        int[] nsr = new int[h.length];
        int maxArea = 0;
 //Next Smaller Left: O(n)
        for (int i = 0; i < h.length; i++) {
            while (!stk.empty() && h[i] <= h[stk.peek()]) {
                stk.pop();
            }
            if (stk.empty()) {
                nsl[i] = -1;
            } else
                nsl[i] = stk.peek();
            stk.push(i);
        }
// Next Smaller Right: O(n)
        stk = new Stack<>();
        for (int j = h.length - 1; j >= 0; j--) {
            while (!stk.empty() && h[j] <= h[stk.peek()]) {
                stk.pop();
            }
            if (stk.empty()) {
                nsr[j] = h.length;
            } else {
                nsr[j] = stk.peek();
            }
            stk.push(j);
        }
// Getting Max Area: O(n)
        for(int k = 0; k<h.length;k++){
            int currArea = h[k]*(nsr[k]-nsl[k]-1);
            maxArea = Math.max(currArea,maxArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] h = {2,1,5,6,2,3};

        System.out.println("The max area of given histogram is: "+maxAreaHisto(h));
    }
}
