public class _1 {
  public static   int r1,r2;
    public static class Node {
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static void swap(Node head,int m,int n){
        int i = 1;
      
     //   Node temp = head;
       while (head != null) {
        if(i == m ){
            r1 = head.data;}
            if(i == n ){
                r2 = head.data;
                head.data = r1;
            }
            i++;
           head = head.next;
       }
      
       for(int j=1; j<= m && head != null;j++){
        if(j==m){
            head.data = r2;
        }
        head = head.next;
       }
    }
    public static Node head;
    public static void main(String[] args) {
        int m = 2;
        int n = 4;
        Node head = new Node(1);
        head.next = new Node(20);
        head.next.next = new Node(3);
        head.next.next.next = new Node(40);
       
       
        swap(head, m, n);
        System.out.println(r1 +" "+r2);
        while (head != null) {
            System.out.print(head.data+ "->");
            head = head.next;
        }

    }
    }
   
