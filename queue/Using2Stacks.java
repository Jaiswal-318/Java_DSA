package concept.queue;

import java.util.Stack;

public class Using2Stacks {
    public static class TwoStackQueue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.isEmpty() && s2.isEmpty();
        }

        public void add(int data) {
            while (!s1.empty())
                s2.push(s1.pop());

            s1.push(data);

            while (!s2.empty())
                s1.push(s2.pop());
        }

        public int remove() {
            if (s1.empty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.pop();
        }

        public int peek() {
            if (s1.empty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return s1.peek();
        }

        public void display() {
            if (s1.empty()) {
                System.out.println("Queue is Empty");
                return;
            }
            while (!s1.isEmpty()) {
                int data = s1.pop();
                System.out.println(data);
                s2.push(data);
            }
            while (!s2.isEmpty()) {
                int data = s2.pop();
                s1.push(data);
            }

        }

        public static void main(String[] args) {
            TwoStackQueue stkQ = new TwoStackQueue();

            System.out.println(stkQ.isEmpty());
            stkQ.add(1);
            stkQ.add(2);
            stkQ.add(3);
            stkQ.add(4);
            stkQ.add(5);
            System.out.println(stkQ.isEmpty());

            stkQ.display();

            System.out.println("Peek: " + stkQ.peek());


            System.out.println("Remove: " + stkQ.remove());
            stkQ.display();
        }
    }
}
