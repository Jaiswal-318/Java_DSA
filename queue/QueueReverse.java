package concept.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class QueueReverse {

    public static void reverseQ(Queue<Integer> q){
        Stack<Integer> stk = new Stack<>();
        while (!q.isEmpty())
            stk.push(q.remove());
        while (!stk.empty())
            q.add(stk.pop());
    }
    public static void main(String[] args) {
        Queue<Integer> q = new PriorityQueue<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Original Queue");
        for (int i: q)
            System.out.println(i+" ");

        reverseQ(q);

        System.out.println("Reverse Queue");
        for (int i: q)
            System.out.println(i+" ");
    }
}
