package concept.stack;

import java.util.Stack;

public class isPalindrome {

    public static boolean checkPalindrome(String str){
        Stack<Character> stk = new Stack<>();
        int n = str.length();
        for (int i = 0; i<n/2;i++){
            char ch = str.charAt(i);
            stk.push(str.charAt(n-i-1));
            if(ch != stk.peek())
                return false;
            else stk.pop();
        }
       return true;
    }

    public static void main(String[] args) {
        String str = "madam";
        System.out.println(checkPalindrome(str));
    }

}
