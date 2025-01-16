package concept.linkedlist;
// TO find nth node and remove from end;

import static concept.linkedlist.BasicsOperation.*;

public class RemoveNthNode {
    static int sz = 0;
    static int val;
    public static void removeNthN(int n){
       Node temp = head;
       if(temp == null){
           System.out.println("LL is empty");
           return;
       }

        int preNCount;
       while (temp != null){
           temp = temp.next;
           sz++;}
       preNCount = (sz-n);
       int i = 1;
       Node preN = head;
       while (i!=preNCount){
           preN = preN.next;
           i++;
       }
          val = preN.next.data;
       preN.next = preN.next.next;
       sz--;

    }
    public static void main(String[] args) {
          BasicsOperation rNN = new BasicsOperation();
          rNN.addFirstLL(1);
          rNN.addFirstLL(2);
          rNN.addFirstLL(3);
          rNN.addFirstLL(4);
          rNN.addFirstLL(5);
          rNN.addFirstLL(6);

          rNN.printLL();
          removeNthN(3);
          rNN.printLL();
        System.out.println(sz);
        System.out.printf("Removed element: %d",val);

    }
}
