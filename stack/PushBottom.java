package concept.stack;

import java.util.*;
//import java.util.Stack;

public class PushBottom {
    public static void pushBottom(Stack<Integer> stk,int data){
        if(stk.empty()){
            stk.push(data);
            return;}
        int top = stk.pop();
        pushBottom(stk,data);
        stk.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);

        System.out.println("Initial Stack...");
        for (Integer integer : stk) {
            System.out.print(integer+" ");
        }

        pushBottom(stk,0);
        System.out.println("\nFinal Stack...");
        while(!stk.empty())
            System.out.println(stk.pop());
        System.out.println();
    }
}
