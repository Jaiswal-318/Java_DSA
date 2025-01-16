package concept.trie;

import java.util.Arrays;

public class WordBreak {
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
    public static boolean wordBreak(String key) {
        if (key.isEmpty())
            return true;
        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0, i)) && wordBreak(key.substring(i)))
                return true;
        }
        return false;
    }


    public static void main(String[] args){
        String[] words = {"i", "like", "sam", "samsung", "mobile"};
        String key = "ilikesams";

        for (String word : words) {
            insert(word);
        }

        System.out.println(wordBreak(key)); // Expected output: false
    }
    }

