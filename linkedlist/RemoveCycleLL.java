package concept.linkedlist;

import static concept.linkedlist.BasicsOperation.*;
import static concept.linkedlist.IsCyclicLL.*;

public class RemoveCycleLL {

    public static void removeCycleLL(){
// To detect a cyclic LL
        if(head == null){
            return;
        }
        Node slow = head;
        Node fast = head;
        boolean cycleLL = false;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                cycleLL = true;
                break;}
        }
        if(!cycleLL){
            return;
        }
// To find meeting point
        slow = head;
        Node pre = null;
        while (slow != fast){
            pre = fast;
            slow = slow.next;
            fast = fast.next;
        }
// Remove cyclic chain;
        assert pre != null;
        pre.next = null;

    }
    public static void main(String[] args) {
        BasicsOperation rCLL = new BasicsOperation();
        head = new Node(1);
        head.next = new Node(2);
        Node temp = new Node(3);
        head.next.next = temp;
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = temp;

        System.out.println(isCyclicLL());
        removeCycleLL();
        rCLL.printLL();

    }
}
