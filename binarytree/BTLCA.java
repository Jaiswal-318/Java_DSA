package concept.binarytree;

public class BTLCA {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int dta){
            data = dta;
        }
    }

    public static Node LCA(Node root, int n1, int n2){
        if(root == null)
            return null;

        if(root.data == n1 || root.data ==n2)
            return root;

        Node leftLCA = LCA(root.left,n1,n2);
        Node rightLCA = LCA(root.right,n1,n2);

        if(leftLCA == null)
            return rightLCA;
        if (rightLCA == null)
            return leftLCA;

        return root;
    }
    public static void main(String[] args) {
//                    1
//                  /   \
//                 2     3
//                / \   / \
//               4   5 6   7

        Node root =  new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(LCA(root,4,5).data);

    }
}
