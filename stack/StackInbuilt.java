package concept.stack;

import java.util.Stack;

public class StackInbuilt {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        System.out.println(stk.empty());
    //    System.out.println(stk.pop());
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);

        System.out.println(stk.empty());
        System.out.println(stk);

        System.out.println(stk.peek());
        stk.pop();
        System.out.println(stk);

        System.out.println(stk.search(6));
        System.out.println(stk.search(2));

        System.out.println(stk.pop());

        System.out.println(stk.set(1,100));
        System.out.println(stk);
    }
}
