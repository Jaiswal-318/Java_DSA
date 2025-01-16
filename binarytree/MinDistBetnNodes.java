package concept.binarytree;

import static concept.binarytree.BTLCA.*;

public class MinDistBetnNodes {

//    public static class Node{
//        int data;
//        Node left;
//        Node right;
//        public Node(int dta){
//            data = dta;
//        }
//    }

    public static int distNodes( BTLCA.Node root, int n1, int n2){
        BTLCA.Node lca = LCA(root, n1,n2);

        int distn1 = lcaDist(lca, n1);
        int distn2 = lcaDist(lca,n2);

        return distn1 + distn2;
    }

    private static int lcaDist(Node root, int n) {
        if(root == null)
          return -1;

        if(root.data == n)
            return 0;

        int ldist = lcaDist(root.left,n);
        int rdist = lcaDist(root.right,n);

        if(ldist == -1 && rdist == -1)
            return -1;
        else if (ldist == -1) {
            return rdist+1;
        }else
            return ldist+1;
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

        int n1 = 4;
        int n2 = 6;

        System.out.println(distNodes(root,n1,n2));

    }
}
