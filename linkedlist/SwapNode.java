package concept.linkedlist;

public class SwapNode {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void swapNode(Node head, int x, int y) {
        Node temp = head;
        Node currX = null;
        Node currY = null;
        int valX = 0;
        int valY = 0;
        if (x == y)
            return;
        int idx = 1;
        while (temp != null) {
            if (idx == x) {
                valX = temp.data;
                currX = temp;

            }
            if (idx == y){
                valY = temp.data;
                currY = temp;
            }
            temp = temp.next;
            idx++;
        }if(currY != null && currX != null){
            currX.data = valY;
            currY.data = valX;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
        int x = 2, y = 4;
        swapNode(head,x, y);
        temp = head;
        while (temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");

    }
}
