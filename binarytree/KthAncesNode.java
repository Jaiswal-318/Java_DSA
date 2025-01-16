package concept.binarytree;

import concept.binarytree.BTBuildPreOrder.*;
public class KthAncesNode {
    public static int kthAncestorNode(Node root,int n,int k){
        if(root == null)
            return -1;

        if(n == root.data)
            return 0;

        int lKth = kthAncestorNode(root.left,n,k);
        int rKth = kthAncestorNode(root.right,n,k);

        if(lKth ==-1 && rKth ==-1)
            return -1;
        int max = Math.max(lKth,rKth);
        if(max+1 == k)
            System.out.println(root.data);

        return max+1;
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

        int k = 2;
        kthAncestorNode(root,5,2);
    }
}
