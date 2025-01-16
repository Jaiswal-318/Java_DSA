package concept.bst;

public class BST {
    public static class Node{
        int data;
        Node right;
        Node left;

        Node(int data){
            this.data = data;
            this.right = null;
            this.left = null;}
    }
// INSERTION (log n)
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;}

        if(root.data > val)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right,val);

        return root;
    }
// SEARCHING (log n)
    public static boolean search(Node root, int key){
        if(root == null) {
            return false;
        }

        if (root.data == key) {
            return true;
        }
        if (root.data > key)
           return search(root.left,key);
        else
          return search(root.right, key);
    }
// DELETION (log n)
    public static Node delete(Node root, int val){
        if (root.data > val)
            root.left = delete(root.left,val);
        if(root.data < val)
            root.right = delete(root.right,val);
        else {
    // CASE 1:
            if (root.left == null && root.right == null)
                return null;
    // CASE 2:
            if (root.right == null)
                return root.left;
            if (root.left == null)
                return root.right;
    // CASE 3:
            Node IS = InorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right,IS.data);
        }
        return root;
    }
    public static Node InorderSuccessor(Node root){
        while (root != null)
            root = root.left;
        return root;
    }
// INORDER TRAVERSE
public static void InOrderTraverse(Node root){
    if(root == null)
        return;
    InOrderTraverse(root.left);
    System.out.print(root.data+" ");
    InOrderTraverse(root.right);
}
// PREORDER TRAVERSE
public static void preOrderTraverse(Node root){
    if(root == null)
        return;
    System.out.print(root.data+" ");
    preOrderTraverse(root.left);
    preOrderTraverse(root.right);
}
    public static void main(String[] args) {
        int[] values = {5,1,3,4,2,7};
        int key = 10;
        Node root = null;

        for (int value : values)
            root = insert(root, value);

        InOrderTraverse(root);
        System.out.println();
        System.out.println(search(root,key));

        delete(root,7);
        InOrderTraverse(root);
    }
}
