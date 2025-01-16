package concept.bst;

import static concept.bst.BST.*;
public class PrintInRange {
    public static void printInRange(Node root, int k1, int k2){
        if(root == null)
            return;

        printInRange(root.left,k1,k2);
        if (root.data >= k1 && root.data <= k2 )
            System.out.print(root.data+" ");
        printInRange(root.right, k1,k2);
    }
    public static void main(String[] args) {
        int k1 = 5;
        int k2 = 12;
        Node root = null;
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
        printInRange(root,k1,k2);

    }
}

