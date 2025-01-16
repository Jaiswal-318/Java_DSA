package concept.bst;

public class BST_in_BT {
    public static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;}
    }

    public static class Info{
        boolean isBST;
        int size;
        int min;
        int max;

        Info(boolean isBST, int size, int max, int min){
            this.isBST = isBST;
            this.size = size;
            this. max = max;
            this.min = min;}
    }
     static int maxSize = 0;

    public static Info largeBST(Node root){
        if(root == null)
            return new Info(true,0,Integer.MIN_VALUE,Integer.MAX_VALUE);

        Info LINFO = largeBST(root.left);
        Info RINFO = largeBST(root.right);

        int size = LINFO.size + RINFO.size +1;
        int min = Math.min(root.data,Math.min(LINFO.min, RINFO.min));
        int max = Math.max(root.data,Math.max(LINFO.max, RINFO.max));

        if (root.data <= LINFO.max || root.data >= RINFO.min)
            return new Info(false,size,max,min);

        if (LINFO.isBST && RINFO.isBST) {
            maxSize = Math.max(maxSize, size);
            return new Info(true, size, max, min);
        }

        return new Info(false,size,max,min);
    }

    public static void main(String[] args) {
/*                     50
                     /    \
                   30      60
                  /  \    /  \
                 5   20  45  70
                            /  \
                          65    80
*/

        Node root = new Node(50);

        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20)  ;

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        largeBST(root);

        System.out.println(maxSize);
    }
}
