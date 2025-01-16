package concept.binarytree;

public class SubTreeMatching {
    public static class Node{
        int dta;
        Node lN;
        Node rN;
        public Node(int data){
            dta = data;
        }
    }
    public static boolean subTreeMatching(BTBuildPreOrder.Node root, Node rt) {
        if (root == null || rt == null)
            return false;
        if(root.data == rt.dta)
         return isIdentical(root,rt);

       return subTreeMatching(root.left,rt) || subTreeMatching(root.right, rt);

    }

    private static boolean isIdentical(BTBuildPreOrder.Node root, Node rt) {
        if(root == null && rt == null)
            return true;
        else if (root == null || rt == null || root.data != rt.dta)
            return false;

        if(!isIdentical(root.left, rt.lN))
        return false;

        if(!isIdentical(root.right,rt.rN))
            return false;

        return true;
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

//                            2
//                           / \
//                          4   5
        Node rt = new Node(2);
             rt.lN = new Node(4);
             rt.rN = new Node(5);

        System.out.println(subTreeMatching(root,rt));
     }
}
