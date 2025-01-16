package concept.linkedlist;

public class DLLBasicOperation {
    public static class DNode {
        int data;
        DNode dnext;
        DNode dpre;
        public DNode(int data){
            this.data = data;
            this.dpre = null;
            this.dnext = null;}
    }
    public static DNode dhead;
    public static DNode dtail;
    public static int dsize = 0;

// ADD FIRST
    public void addFirstDLL(int data){
        DNode newNode = new DNode(data);
        dsize++;
        if(dhead == null){
            dhead = dtail = newNode;
        return;}

        newNode.dnext = dhead;
        dhead.dpre = newNode;
        dhead = newNode;
    }
// ADD LAST
    public void addLastDLL(int data){
        DNode newNode = new DNode(data);
        dsize++;
        if(dhead == null){
            dhead = dtail = newNode;
            return;}

         dtail.dnext = newNode;
        newNode.dpre = dtail;
        dtail = newNode;
    }
// REMOVE FIRST
    public void removeFistDLL(){
        if(dsize == 0){
            System.out.println("DLL is empty");
        return;}
        if (dsize ==1){
            dhead = dtail = null;
        dsize--;
        return;}
        dhead = dhead.dnext;
        dhead.dpre = null;
        dsize--;
    }
// REMOVE LAST
    public void removeLastDLL() {
        if (dsize == 0) {
            System.out.println("DLL is empty");
        }
        if (dsize == 1) {
            dhead = dtail = null;
            dsize--;
        }
        dtail = dtail.dpre;
        dtail.dnext = null;
        dsize--;
    }
// DISPLAY
    public void printDLL(){
        DNode temp = dhead;
        System.out.print("null<->");
        while (temp != null){
            System.out.print(temp.data+"<->");
            temp =temp.dnext;}
        System.out.println("null");
    }
// REVERSE
    public void reverseDLL(){
        DNode curr = dhead;
        DNode pre = null;
        DNode post;
            while (curr != null){
                post = curr.dnext;
                curr.dnext = pre;
                curr.dpre = post;

                pre = curr;
                curr = post;
            }
            dhead = pre;
    }

    public static void main(String[] args) {
        DLLBasicOperation dll = new DLLBasicOperation();
        dll.addFirstDLL(1);
        dll.addLastDLL(4);
        dll.addLastDLL(5);

        dll.printDLL();
        System.out.println(dsize);

        dll.reverseDLL();
        dll.printDLL();


        dll.removeFistDLL();
        dll.printDLL();
        System.out.println(dsize);

        dll.removeLastDLL();
        dll.printDLL();
        System.out.println(dsize);
    }
}
