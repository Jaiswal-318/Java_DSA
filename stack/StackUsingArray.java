package concept.stack;


public class StackUsingArray {
    static class Stack {
        static int top=-1;
        static int maxsize = 10;
        static int[] arr = new int[maxsize];

        public boolean isEmpty() {
            return (top < 0);
        }

        public void push(int data) {
            if(top == maxsize-1) {
                System.out.println("Overflow !!");
            }
            else {
              //  System.out.println("Enter Value:");
                top++;
                arr[top]=data;
                //    System.out.println("Item pushed");
            }
        }
        public void peek(){
            int td = arr[top];
            System.out.println(td);
        }

        public void pop() {
            if (top == -1) {
                System.out.println("Underflow !!");
            }
            else {
                top --;
                //   System.out.println("Item popped");
            }
        }

        public void display() {
            System.out.println("Printing stack elements .....");
            for(int i = top; i>=0;i--) {
                System.out.println(arr[i]);}
        }
    }
    public static void main(String[] args) {
        Stack stk = new Stack();

        System.out.println(stk.isEmpty());

        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);

        stk.peek();

        stk.display();
        System.out.println(stk.isEmpty());

        stk.pop();
        stk.display();
    }
}
