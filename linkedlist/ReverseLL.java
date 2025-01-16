package concept.linkedlist;


import static concept.linkedlist.BasicsOperation.*;

public class ReverseLL {
    public static void reverseLL(){
      Node pre = null;
      Node curr = tail = head;
      Node post;

        while(curr !=null){
            post = curr.next;
            curr.next= pre;
            pre = curr;
            curr = post;
        }
        head = pre;
    }
    public static void main(String[] args) {
        BasicsOperation rl = new BasicsOperation();
        rl.addFirstLL(10);
        rl.addFirstLL(9);
        rl.addFirstLL(8);
        rl.addFirstLL(7);
        rl.addFirstLL(6);
        rl.printLL();
        reverseLL();
        rl.printLL();

    }

}
