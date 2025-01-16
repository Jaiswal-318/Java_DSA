package concept.stack;

import java.util.Stack;

public class validParentheses {
    public static int count = 0;
    public static boolean validBracs(String s){
        Stack<Character> stk = new Stack<>();
        for (int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch =='{' || ch == '[')
                stk.push(ch);
            else{
                if(!stk.empty() && isMatching(stk.peek(), ch)){
                    stk.pop();
                    count++;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isMatching(char open, char close){
        return (open == '(' && close == ')')
                || (open == '[' && close == ']')
                || (open == '{' && close == '}');
    }


    public static void main(String[] args) {
        String s = "({})[]";
        System.out.println(validBracs(s));
        System.out.println(count);
    }

}
