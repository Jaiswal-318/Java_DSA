package concept.queue;

public class UsingArray {

    public static class AQueue{

        public static int[] arr;
        public static int size;
        public static int rear;

        AQueue(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
// IS EMPTY
        public boolean isEmpty(){
            return rear == -1;
        }
// ADD
        public void enqueue(int data){
            if(rear == size-1){
                System.out.println("Queue is Full!");
                return;
            }
            ++rear;
            arr[rear] = data;
         }
//REMOVE
         public int dequeue(){
            if (isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = arr[0];
              for (int i =0; i<rear;i++)
                  arr[i] = arr[i+1];
              rear--;
              return front;
         }
// PEEK FRONT;
        public int peek(){
            if (isEmpty())
                return -1;
            return arr[0];
        }
// DISPLAY
        public void display(){
            if (isEmpty()){
                System.out.println("Queue is empty!");
                return;
            }
            for (int i = 0; i<=rear;i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        AQueue aq = new AQueue(5);

        System.out.println(aq.isEmpty());
        aq.enqueue(1);
        aq.enqueue(2);
        aq.enqueue(3);
        System.out.println(aq.isEmpty());
        aq.display();
        System.out.println(aq.peek());
        System.out.println(aq.dequeue());
        aq.display();
    }
}
