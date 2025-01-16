package concept.trie;

public class Prefix {
    static class TrieNode{
        TrieNode[] child = new TrieNode[26];
        boolean eow = false;
        int count = 0;
    }

    public static TrieNode root = new TrieNode();

    public static void insert(String word){
        TrieNode curr = root;
        for(int i = 0; i<word.length(); i++){
            char ch = word.charAt(i);
            int idx = ch -'a';
            if(curr.child[idx] == null){
                curr.child[idx] = new TrieNode();
                curr.child[idx].count = 1;
            }else{
                curr.child[idx].count++;
            }
            curr = curr.child[idx];
        }
        curr.eow = true;
    }
    public static String prefix(String word){
        TrieNode curr = root;
        StringBuilder sb = new StringBuilder();
        for (char ch : word.toCharArray()){
            int idx = ch -'a';
            sb.append(ch);
            if(curr.child[idx] != null && curr.child[idx].count == 1) {
                return sb.toString();
            }else {
                curr = curr.child[idx];
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] arr = {"zebra","zen","dog","duck","dove"};

        for (String s: arr)
            insert(s);

        for (String i : arr){
            System.out.print(prefix(i)+" ");
        }
    }
}
