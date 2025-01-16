package concept.stack;

import java.util.Iterator;
import java.util.Stack;
public class ReverseStack {
    public static void reverseStack(Stack<Integer> stk){
        if(stk.empty())
            return;
        int top = stk.pop();
        reverseStack(stk);
        PushBottom.pushBottom(stk,top);
    }
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);

        System.out.println("Initial Stack...");
        Iterator itr = stk.iterator();
        while (itr.hasNext())
            System.out.print(itr.next()+" ");

        System.out.println("\nStack After Reversing...");
        reverseStack(stk);
        while(!stk.empty())
            System.out.println(stk.pop());
        System.out.println();


    }
}
