package concept.bst;

import static concept.bst.BST.*;
public class SortedArrToBalBST {
    public static Node arrToBalancedBST(int[] arr,int start, int end){
        if (start > end)
            return null;
        int mid =(start+end)/2;
        Node root = new Node(arr[mid]);
        root.left = arrToBalancedBST(arr,start,mid-1);
        root.right = arrToBalancedBST(arr,mid+1,end);

        return root;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,6,8,10,11,12};
        Node root;

        root = arrToBalancedBST(arr,0,arr.length-1);

        InOrderTraverse(root);

    }
}
