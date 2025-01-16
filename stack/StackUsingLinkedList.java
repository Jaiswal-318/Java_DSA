package concept.stack;

public class StackUsingLinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;}
    }
        public static class StackLinkedList{
            public static Node top;
            public static int size = 0;

            public boolean isEmpty(){
                return top == null;
            }

            public void push(int data){
                Node newNode = new Node(data);
                size++;
                if(isEmpty()){
                    top = newNode;
                    return;}
                newNode.next = top;
                top = newNode;
            }

            public void peek(){
                if (isEmpty()){
                    System.out.println("StackLL is void");
                    return;}
                System.out.println("peeked: "+top.data);
            }

            public void pop(){
                if (isEmpty()){
                    System.out.println("StackLL is void");
                    return;}
                top = top.next;
                size--;
            }

            public void display(){
                Node temp = top;
                System.out.println("Printing StackLL.... ");
                while (temp !=null){
                    System.out.println(temp.data);
                    temp = temp.next;}
            }
        }

    public static void main(String[] args) {
        StackLinkedList sll = new StackLinkedList();

        System.out.println(sll.isEmpty());

        sll.push(1);
        sll.push(2);
        sll.push(3);
        sll.push(4);
        sll.push(5);

        System.out.println(sll.isEmpty());
        sll.display();

        sll.peek();

        sll.pop();
        sll.display();

    }
    }

