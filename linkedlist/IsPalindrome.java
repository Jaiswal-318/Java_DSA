package concept.linkedlist;

import static concept.linkedlist.BasicsOperation.*;
public class IsPalindrome {

    // Slow-Fast Approach;
    public static Node findMid(){
        Node slow = head;
        Node fast = head;
           while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;}
        return slow;
    }

    public static void isPalindrome(){
        if(head == null || head.next == null){
            System.out.println("LL is palindrome");
        }
     // Find Mid;
        Node midNode = findMid();

     // Reverse 2nd half;
        Node pre = null;
        Node curr = midNode;
        Node post;
        while (curr != null){
            post = curr.next;
            curr.next = pre;
            pre = curr;
            curr = post;
        }
        Node right = pre;
        Node left = head;

    // Check Left and Right Half
        while (right != null){
            if(right.data != left.data){
                System.out.println("LL is not palindrome");
                return;}

                right = right.next;
                left = left.next;
        }
        System.out.println("LL is palindrome");

    }

    public static void main(String[] args) {
        BasicsOperation  pll = new BasicsOperation();
        pll.addFirstLL(1);
        pll.addFirstLL(2);
        pll.addFirstLL(3);
        pll.addFirstLL(2);
        pll.addFirstLL(1);

        pll.printLL();
        isPalindrome();

    }
}
