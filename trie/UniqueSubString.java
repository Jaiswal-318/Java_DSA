package concept.trie;

public class UniqueSubString {
    static class  Node{
        Node[] child = new Node[26];
        boolean eow = false;
    }
    public static Node root = new Node();
    public static  int count = 0;

    public static void insert(String word){
        Node curr = root;
        for(char ch : word.toCharArray()){
            int idx = ch - 'a';
            if (curr.child[idx] == null) {
                curr.child[idx] = new Node();
                count++;
            }
            curr = curr.child[idx];
        }
        curr.eow = true;
    }

    public static void main(String[] args) {
        String str = "ababa";
        for (int i = 0; i< str.length(); i++)
                insert(str.substring(i));
        System.out.println(count+1);
    }
}
