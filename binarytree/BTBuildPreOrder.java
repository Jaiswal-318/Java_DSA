package concept.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BTBuildPreOrder {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;}
    }

    public static class BinaryTree{
        static int idx = -1;
        public Node buildBT(int[] nodes){
            idx++;
            if(nodes[idx] == -1)
                return null;

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildBT(nodes);
            newNode.right = buildBT(nodes);

            return newNode;
        }
        public void preOrderTraverse(Node root){
            if(root == null)
                return;
            System.out.print(root.data+" ");
            preOrderTraverse(root.left);
            preOrderTraverse(root.right);
        }
        public void levelOrderTraverse(Node root){
            if(root == null)
                return;
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()){
                Node curr = q.remove();
                if(curr == null) {
                    System.out.println();
                    if (q.isEmpty())
                        break;
                    else
                        q.add(null);
                }else{
                    System.out.print(curr.data+ " ");
                    if(curr.left != null)
                        q.add(curr.left);
                    if(curr.right != null)
                        q.add(curr.right);
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree bt = new BinaryTree();

        Node root = bt.buildBT(nodes);
        System.out.println(root.data);

        bt.preOrderTraverse(root);

        System.out.println();
        bt.levelOrderTraverse(root);
    }
}
