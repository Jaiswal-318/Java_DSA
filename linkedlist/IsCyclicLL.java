package concept.linkedlist;

import static concept.linkedlist.BasicsOperation.*;
public class IsCyclicLL {

    public static boolean isCyclicLL(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;}
        }
        return false;
    }

    public static void main(String[] args) {
       head = new Node(1);
       head.next = new Node(2);
       head.next.next = new Node(3);
       head.next.next.next = new Node(4);
       head.next.next.next.next = head;

       System.out.println(isCyclicLL());
    }
}
