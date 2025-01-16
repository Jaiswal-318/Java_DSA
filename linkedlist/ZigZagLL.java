package concept.linkedlist;

import static concept.linkedlist.BasicsOperation.*;
public class ZigZagLL {
    public static void zigZagLL(){
// Get Mid
    Node slow = head;
    Node fast = head.next;
    while (fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
    }

    Node mid = slow;

// Reversing Right Half
    Node curr = mid.next;
    mid.next = null;  // breaking left half
    Node pre = null;
    Node post;
       while (curr != null){
           post = curr.next;
           curr.next = pre;
           pre = curr;
           curr = post;
       }
       Node leftH = head;
       Node rightH = pre;
       Node nextL, nextR;

// Alternate Merge ZIGZAG
        while (leftH != null && rightH != null){
            nextL = leftH.next;
            leftH. next = rightH;
            nextR = rightH.next;
            rightH.next = nextL;

            leftH = nextL;
            rightH = nextR;
        }
    }
    public static void main(String[] args) {
        BasicsOperation zLL = new BasicsOperation();

        zLL.addFirstLL(1);
        zLL.addFirstLL(2);
        zLL.addFirstLL(3);
        zLL.addFirstLL(4);
        zLL.addFirstLL(5);

        zLL.printLL();
        zigZagLL();
        zLL.printLL();

    }
}
