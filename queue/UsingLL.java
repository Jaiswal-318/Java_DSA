package concept.queue;

public class UsingLL {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;}
    }
    public static class LLQueue{
        public Node rear;
        public Node front;
        public int size;

// EMPTY CHECKING
        public boolean isEmpty(){
            return rear == null && front == null;
        }
// ADDING ELEMENT
      public void enqueue(int data){
            Node newNode = new Node(data);
            size++;
            if(isEmpty()){
               front = rear = newNode;
               return;}
            rear.next = newNode;
            rear = newNode;
        }
// REMOVING ELEMENT
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            int head = front.data;
            if (front == rear){
                front = rear = null;
            }

            else{
                front = front.next;
            }
            size--;
            return head;
        }
// PEEK FRONT
        public int peek(){
            if (isEmpty()){
                System.out.println("Queue is empty!");
                return -1;}
            return front.data;
        }
// Display
        public void display(){
            if (isEmpty()){
                System.out.println("Queue is empty!");
                return;}
            Node temp = front;
                while (temp != null){
                    System.out.println(temp.data);
                    temp = temp.next;}
        }
    }

    public static void main(String[] args) {
        LLQueue llq = new LLQueue();

        System.out.println(llq.isEmpty());
        llq.enqueue(1);
        llq.enqueue(2);
        llq.enqueue(3);
        llq.enqueue(4);
        llq.enqueue(5);

        System.out.println(llq.isEmpty());

        llq.display();
        System.out.println("DEQUEUE: "+llq.dequeue());
        System.out.println("PEEK: "+llq.peek());
        llq.display();
        System.out.println("Size of Queue: "+llq.size);
    }

    }

