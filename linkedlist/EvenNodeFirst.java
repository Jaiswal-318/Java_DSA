package concept.linkedlist;

public class EvenNodeFirst {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node evenFirst(Node head) {
        Node evenH = null, evenT = null;
        Node oddH = null, oddT = null;
        Node curr = head;
        while (curr != null) {
            if (curr.data % 2 == 0) {
                if (evenH == null) {
                    evenH = evenT =curr;
                    }else {
                    evenT.next = curr;
                    evenT = evenT.next;}
            }else {
                if(oddH == null){
                    oddH = oddT = curr;
                }else {
                    oddT.next = curr;
                    oddT = oddT.next;}
            }
          curr = curr.next;
        }
        if(evenH == null)
            return oddH;
        if (oddH == null)
            return evenH;

        evenT.next = oddH;
        oddT.next = null;

        return evenH;

    }

        public static void main (String[] args){
            Node head = new Node(8);
            head.next = new Node(12);
            head.next.next = new Node(10);
            head.next.next.next = new Node(5);
            head.next.next.next.next = new Node(4);
            head.next.next.next.next.next = new Node(1);
            head.next.next.next.next.next.next = new Node(6);

            Node newH  = evenFirst(head);
            while (newH != null){
                System.out.print(newH.data+"->");
                newH = newH.next;
            }
            System.out.println("null");
        }
}

