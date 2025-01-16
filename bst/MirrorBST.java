package concept.bst;

import static concept.bst.BST.*;

public class MirrorBST {
    public static Node mirror(Node root){
        if (root == null)
            return null;
        Node lf = mirror(root.left);
        Node rt = mirror(root.right);

        root.right = lf;
        root.left = rt;

        return root;
    }
    public static void main(String[] args) {
        BST.Node root = null;
        int[] arr = {8,5,3,6,1,4,10,11,14};
//
//                                 8
//                                / \
//                               5   10
//                              / \    \
//                             3   6    11
//                            / \         \
//                           1   4         14
//
        for (int i : arr)
            root = insert(root,i);

        preOrderTraverse(root);

        System.out.println();
       root = mirror(root);
        preOrderTraverse(root);
    }
}
