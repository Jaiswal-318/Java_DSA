package concept.trie;

public class StartsWith {
    static class TrieNode{
        TrieNode[] child = new TrieNode[26];
        boolean eow = false;
    }
    public static TrieNode root = new TrieNode();

    public static void insert(String word){
        TrieNode curr = root;

        for (char ch: word.toCharArray()){
            int idx = ch - 'a';
            if (curr.child[idx] == null)
                curr.child[idx] = new TrieNode();

            curr = curr.child[idx];
        }
        curr.eow =true;
    }
    public static boolean startsWith(String word){
        TrieNode curr = root;

        for (char ch : word.toCharArray()){
            int idx = ch - 'a';
            if(curr.child[idx] == null)
                return false;
            else
                curr = curr.child[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        String[] arr = {"apple","app","mango","man","woman"};

        for (String s : arr)
            insert(s);

        System.out.println(startsWith("app"));
        System.out.println(startsWith("man"));
        System.out.println(startsWith("moon"));
    }
}
