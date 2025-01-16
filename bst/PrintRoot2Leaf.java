package concept.bst;

import java.util.ArrayList;

import static concept.bst.BST.*;

public class PrintRoot2Leaf {
    public static void rootToleaf(Node root, ArrayList<Integer> path){
        if(root == null)
            return;
        path.add(root.data);

        if (root.left == null && root.right == null)
            System.out.println(path);

        rootToleaf(root.left,path);
        rootToleaf(root.right,path);
        path.removeLast();
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
        ArrayList<Integer> path = new ArrayList<>();

        for (int i : arr)
            root = insert(root,i);
        rootToleaf(root,path);
    }
}
