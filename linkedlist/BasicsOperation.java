package concept.linkedlist;

    public class BasicsOperation {

        // Declaring LinkedList
        public static class Node{
            int data;
            Node next;

            public Node(int data){
                this.data = data;
                this.next = null;}
        }
        public static Node head;
        public static Node tail;
        public static int size = 0;
        // ADD FIRST
        public void addFirstLL(int data){
            Node newNode = new Node(data);
            size++;
            if(head == null){
                head = tail = newNode;
                return; }

           newNode.next = head;
            head = newNode;
        }
        // ADD LAST
        public void addLastLL(int data){
            Node newNode = new Node(data);
                size++;
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        // ADD MIDDLE
        public void addMiddleLL(int idx, int data){
            if (idx==0) {
                addFirstLL(data);
                return;
            }
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i = 0;

            while (i<idx-1) {
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }

        // REMOVE FIRST
            public void removeFirstLL(){
            if(head == null){
                System.out.println("LL is empty");}
            head = head.next;
            size--;
            }

        // REMOVE LAST
            public  void removeLastLL(){
            if(head == null){
                System.out.println("LL is empty");}
            Node pre = head;
           while(pre.next != tail){
               pre = pre.next;
           }
           pre.next = null;
           tail = pre;
            size--;
            }

        // DISPLAY
        public void printLL(){
            if(head == null){
                System.out.print("LL is empty! ");
                return;
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data+ "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        //SEARCHING
            public int searchKeyLL(int key){
                        Node temp = head;
                        int i = 0;
                        while(temp != null){
                            if(temp.data == key){
                                return i;}
                            i++;
                            temp = temp.next;
                        }
                        return -1;
            }

        public static void main(String[] args){
            BasicsOperation ll = new BasicsOperation();

            ll.addMiddleLL(0,7);
            ll.addFirstLL(1);
            ll.addFirstLL(0);
            ll.addLastLL(9);
            ll.addMiddleLL(2,5);

            ll.printLL();
            System.out.println(size);
            ll.removeFirstLL();
            ll.printLL();
            System.out.println(size);
            ll.removeLastLL();
            ll.printLL();
            System.out.println(size);
            System.out.println(ll.searchKeyLL(5));
        }

    }

