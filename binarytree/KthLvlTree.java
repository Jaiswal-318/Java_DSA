package concept.binarytree;

public class KthLvlTree {

    public static void kthLvlNodePrint(BTBuildPreOrder.Node root, int k, int lvl){
       if(root == null)
           return;
        if(k == lvl)
            System.out.print(root.data+" ");

        kthLvlNodePrint(root.left,k,lvl+1);
        kthLvlNodePrint(root.right,k,lvl+1);
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

        kthLvlNodePrint(root,3,1);
    }

}
