package concept.bst;

import java.util.ArrayList;

public class Merge2BST {
    public static class Node{
        int dta;
        Node left;
        Node right;

        Node(int val){
            this.dta = val; }
    }
    public static void mergeAL(ArrayList<Integer> al1, ArrayList<Integer> al2, ArrayList<Integer> al){
        int i = 0;
        int j = 0;

        while (i < al1.size() && j < al2.size()){
           if(al1.get(i) < al2.get(j)) {
               al.add(al1.get(i));
               i++;
           }else {
               al.add(al2.get(j));
               j++;
           }
        }
        while(i < al1.size()) {
            al.add(i);
            i++;
        }
        while (j < al2.size()) {
            al.add(al2.get(j));
            j++;
        }
    }
    public static void inOrder(Node root,ArrayList<Integer> al){
        if(root == null)
            return;
        inOrder(root.left,al);
        al.add(root.dta);
        inOrder(root.right,al);
    }
    public static Node create(ArrayList<Integer> al, int st, int end){
        if(st > end)
            return null;
        int mid = (st + end)/2;
        Node root = new Node(al.get(mid));
        root.left = create(al,st,mid-1);
        root.right = create(al,mid+1,end);

        return root;
    }
    public static Node mergeBst(Node root1, Node root2){

        ArrayList<Integer> al1 = new ArrayList<>();
        inOrder(root1,al1);

        ArrayList<Integer> al2 = new ArrayList<>();
        inOrder(root2,al2);

        ArrayList<Integer> al = new ArrayList<>();
        mergeAL(al1,al2,al);

        return create(al,0,al.size()-1);

    }
    // PREORDER TRAVERSE
    public static void preOrderTraverse(Node root){
        if(root == null)
            return;
        System.out.print(root.dta+" ");
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }
    public static void main(String[] args) {
        /*
                        2                    9
                       / \                  / \
                      1   4                3   12

                                 3
                               /   \
                              1      9
                               \    / \
                                2  4   12
         */

// BST 1:-
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);
// BST 2:-
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBst(root1,root2);

        preOrderTraverse(root);

    }


}
