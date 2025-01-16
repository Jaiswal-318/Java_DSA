package concept.binarytree;

public class BTSumNode {
    public static int sumNode(BTBuildPreOrder.Node root) {
        if (root == null)
            return 0;

        int lSum = sumNode(root.left);
        int rSum = sumNode(root.right);

        return lSum + rSum + root.data;
    }

    public static void main(String[] args) {
//                    1
//                  /   \
//                 2     3
//                / \   / \
//               4   5 6   7

        BTBuildPreOrder.Node root = new BTBuildPreOrder.Node(1);
        root.left = new BTBuildPreOrder.Node(2);
        root.right = new BTBuildPreOrder.Node(3);
        root.left.left = new BTBuildPreOrder.Node(4);
        root.left.right = new BTBuildPreOrder.Node(5);
        root.right.left = new BTBuildPreOrder.Node(6);
        root.right.right = new BTBuildPreOrder.Node(7);

        System.out.println(sumNode(root));

    }
}
