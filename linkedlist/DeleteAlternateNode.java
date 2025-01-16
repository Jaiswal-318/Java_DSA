package concept.linkedlist;

public class DeleteAlternateNode {
    static class Node {
        int data;
      Node next;
        Node(int data){
            this.data = data;
            this.next = null;}
    }

    public static void toPrint(Node head, int m, int n){
        while (head != null) {
            for(int i = m; i>0 && head != null; i--){
                System.out.print(head.data +"->");
                head = head.next;
            }
            for(int i = n; i>0 && head != null; i--){
                head = head.next;
            }
        }
    }
    //    public static Node head;
    public static void main(String[] args) {
        int m = 1;
        int n = 1;
         Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        toPrint(head, m, n);

    }
}
