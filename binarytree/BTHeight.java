package concept.binarytree;

import static concept.binarytree.BTBuildPreOrder.*;
public class BTHeight {

// Height of Tree
        public static int btHeight(Node root){
            if(root == null)
                return 0;

            int leftSubTree = btHeight(root.left);
            int rightSubTree = btHeight(root.right);

            return Math.max(leftSubTree , rightSubTree) +1;
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

        System.out.println(btHeight(root));

    }
}
