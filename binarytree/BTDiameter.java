package concept.binarytree;

public class BTDiameter {
    static int ld = 0;
    static int rd = 0;

    public static int diameter(BTBuildPreOrder.Node root){   // O(N^2)
        if(root == null)
            return 0;

        int ldia = diameter(root.left);
        int rdia = diameter(root.right);
        int lh = BTHeight.btHeight(root.left);
        int rh = BTHeight.btHeight(root.right);

        ld = ldia;
        rd = rdia;
        int rtDia = lh +rh + 1;

        return Math.max(rtDia, Math.max(rdia,ldia));
    }
    public static void main(String[] args) {
//                    1
//                  /   \
//                 2     3
//                / \   / \
//               4   5 6   7

        BTBuildPreOrder.Node root =  new BTBuildPreOrder.Node(1);
        root.left = new BTBuildPreOrder.Node(2);
        root.right = new BTBuildPreOrder.Node(3);
        root.left.left = new BTBuildPreOrder.Node(4);
        root.left.right = new BTBuildPreOrder.Node(5);
        root.right.left = new BTBuildPreOrder.Node(6);
        root.right.right = new BTBuildPreOrder.Node(7);

        System.out.println(diameter(root));
        System.out.println(ld);
        System.out.println(rd);

    }
}
