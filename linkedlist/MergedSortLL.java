package concept.linkedlist;

import static concept.linkedlist.BasicsOperation.*;

public class MergedSortLL {

// Get Mid Node
    public static Node getMidNode(Node head){
        if(head == null){
            return null;}
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
// CONQUER
    public static Node merge2LL(Node headL,Node headR){
        Node dummy = new Node(-1);
        Node newNode = dummy;

        while (headL != null && headR != null){
            if(headL.data <= headR.data){
                newNode.next = headL;
                headL = headL.next;
            }else{
                newNode.next = headR;
                headR = headR.next;
            }
            newNode = newNode.next;
        }
        if(headL != null){
            newNode.next = headL;}

        if(headR != null){
            newNode.next = headR;}

        return dummy.next;}
// DIVIDE
    public static Node mergeSort(Node head){
        if(head == null || head.next == null){
            return head;}
        Node mid = getMidNode(head);
        Node right = mid.next;
        mid.next = null;

        Node leftHead = mergeSort(head);
        Node rightHead = mergeSort(right);

        return merge2LL(leftHead,rightHead);

    }
    public static void main(String[] args) {
        BasicsOperation mSLL = new BasicsOperation();
        mSLL.addFirstLL(1);
        mSLL.addFirstLL(2);
        mSLL.addFirstLL(8);
        mSLL.addFirstLL(4);
        mSLL.addFirstLL(5);
        mSLL.addFirstLL(3);
        mSLL.addFirstLL(6);
        mSLL.addFirstLL(0);
        mSLL.addFirstLL(9);



        mSLL.printLL();
       head =  mergeSort(head);
        mSLL.printLL();
    }
}
