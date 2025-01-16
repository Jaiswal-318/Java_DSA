package concept.trie;

import java.util.Arrays;

public class Implementation {
     static class Node{
        Node[] child = new Node[26];
        boolean eow = false;

        Node(){
            Arrays.fill(child, null);
        }
    }
    public static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(char ch : word.toCharArray()){
            int idx = ch - 'a';
            if (curr.child[idx] == null)
                curr.child[idx] = new Node();
            curr = curr.child[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String word){
        Node curr = root;
        for(char ch : word.toCharArray()){
            int idx = ch - 'a';
            if (curr.child[idx] == null)
                return  false;
            curr = curr.child[idx];
        }
        return curr.eow;
    }


    public static void main(String[] args){
        String[] word = {"the","a","there","these"};

        for (String s : word)
            insert(s);

        System.out.println(search("the"));
    }
}
