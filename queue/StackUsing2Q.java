package concept.queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Q {
    public static class StackBy2Q{
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        public boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public void add(int data){
            while (!q1.isEmpty())
               q2.add(q1.remove());
            q1.add(data);
            while (!q2.isEmpty())
                q1.add(q2.remove());
        }
        public int remove(){
            if (q1.isEmpty())
                return -1;
            return q1.remove();
        }
        public int peek(){
            if (q1.isEmpty())
                return -1;
            return q1.peek();
        }
       public void display(){
            while (!q1.isEmpty()){
                int data = q1.remove();
                System.out.println(data);
                q2.add(data);
            }
           while (!q2.isEmpty()){
               int data = q2.remove();
               q1.add(data);
           }
       }

        public static void main(String[] args) {
            StackBy2Q s2q = new StackBy2Q();

            System.out.println(s2q.isEmpty());
            s2q.add(1);
            s2q.add(2);
            s2q.add(3);
            s2q.add(4);
            s2q.add(5);
            System.out.println(s2q.isEmpty());
            s2q.display();

            System.out.println("peek: "+ s2q.peek());
            System.out.println("Remove: "+ s2q.remove());
            s2q.display();

        }
    }
}
