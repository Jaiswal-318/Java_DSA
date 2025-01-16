package concept.stack;

import java.util.ArrayList;

public class StackUsingArrayList {
    public static class StackArrayList{
      public static ArrayList<Integer> alStack = new ArrayList<>();

        public boolean isEmpty(){
            return alStack.isEmpty();
        }

        public void push(int data){
          alStack.add(data);
        }

        public void peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return;}
            System.out.println("Peeking StackArrayList....");
            int ld = alStack.getLast();
            System.out.println(ld);
        }

        public void pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return;}
            alStack.removeLast();
        }

        public void display(){
            System.out.println("Printing StackArrayList Element....");
            for (int i = alStack.size()-1;i>=0;i--){
               int p = alStack.get(i);
                System.out.println(p);}
        }
    }

    public static void main(String[] args) {
        StackArrayList sal = new StackArrayList();

        sal.push(1);
        sal.push(2);
        sal.push(3);
        sal.push(4);
        sal.push(5);

        sal.display();

        sal.peek();

        sal.pop();
        sal.display();


    }
}

