package concept.bst;

import java.util.ArrayList;
import static concept.bst.BST.*;

public class ValidateBST {
    public static void inOrderTraverse(Node root, ArrayList<Integer> bstChecker){
        if(root == null)
            return;
        inOrderTraverse(root.left,bstChecker);
        bstChecker.add(root.data);
        inOrderTraverse(root.right,bstChecker);
    }

    public static void main(String[] args) {
    //    BST.Node root = null;
        ArrayList<Integer> bstChecker = new ArrayList<>();
//                    1
//                  /   \
//                 2     3
//                / \   / \
//               4   5 6   7

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        InOrderTraverse(root);

        inOrderTraverse(root,bstChecker);
        boolean ans = true;

       for (int i = 0; i < bstChecker.size()-1; i++){
           if(bstChecker.get(i) > bstChecker.get(i+1)){
               ans = false;
               break;
           }
       }
        System.out.println("\n"+ans);
    }
}
