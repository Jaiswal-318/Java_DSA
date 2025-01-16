package concept.linkedlist;

public class GetMergingPointOF2LL {

    public static class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node getIntersection(Node head1,Node head2){

        while(head1 != null){
            Node temp = head1;
            while (temp != null) {
                if(temp == head2){
                    return temp;
                }
                temp = temp.next;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Node head1,head2;
        head1 = new Node(1);
        head2 = new Node(4);

        head2.next = new Node(5);


        Node newNode = new Node(2);
        head1.next = newNode;

        newNode = new Node(3);
        head1.next.next = newNode;

        newNode = new Node(6);
        head2.next.next = newNode;
        head1.next.next.next = newNode;

        newNode = new Node(7);
        head1.next.next.next.next = newNode;

        System.out.println(getIntersection(head1, head2).data);

        while (head2 != null) {
            System.out.print(head2.data + "->");
            head2 = head2.next;
        }
        System.out.println("null");


    }
}
