package concept.stack;

import java.util.Stack;

public class NextGreater {
    public static void nextGreater(int[] arr, int[] nextGreater){
        Stack<Integer> s = new Stack<>();
        for(int i = arr.length-1; i>=0; --i){
            while(!s.empty() && arr[i]>=arr[s.peek()])
                s.pop();
            if (s.empty())
                nextGreater[i] = -1;
            else
                nextGreater[i] = arr[s.peek()];
            s.push(i);
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        int[] arr = {6,8,0,1,3};
        int[] nextGreater = new int[arr.length];

        nextGreater(arr,nextGreater);
        for (int i: nextGreater)
            System.out.print(i+" ");


    }
}
