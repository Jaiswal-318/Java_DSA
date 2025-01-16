package concept.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieHashMap {

    static class TrieNode {
        Map<Character, TrieNode> children = new HashMap<>();
        boolean isEndOfWord;

        public TrieNode() {
            isEndOfWord = false;
        }
    }
        public static TrieNode root = new TrieNode();

        // Method to insert a word into the Trie
        public void insert(String word) {
            TrieNode current = root;

            for (char c : word.toCharArray()) {
                current = current.children.computeIfAbsent(c, k -> new TrieNode());
            }
            current.isEndOfWord = true;
        }

        // Method to search for a word in the Trie
        public boolean search(String word) {
            TrieNode current = root;

            for (char c : word.toCharArray()) {
                current = current.children.get(c);
                if (current == null) {
                    return false;
                }
            }
            return current.isEndOfWord;
        }

        // Method to check if there is any word in the Trie that starts with the given prefix
        public boolean startsWith(String prefix) {
            TrieNode current = root;

            for (char c : prefix.toCharArray()) {
                current = current.children.get(c);
                if (current == null) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Trie trie = new Trie();

            trie.insert("apple");
            System.out.println(trie.search("apple"));   // Output: true
            System.out.println(trie.search("app"));     // Output: false
            System.out.println(trie.startsWith("app")); // Output: true

            trie.insert("app");
            System.out.println(trie.search("app"));     // Output: true
        }
    }


