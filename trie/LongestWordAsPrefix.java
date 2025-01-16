package concept.trie;

import java.util.*;

public class LongestWordAsPrefix {
    static class TrieNode {
        TrieNode[] children;
        boolean isEndOfWord;

        public TrieNode() {
            children = new TrieNode[26];  // Each index represents a letter 'a' to 'z'
            isEndOfWord = false;
        }
    }
    public static TrieNode root = new TrieNode();

        // Insert a word into the trie
        public static void insert(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (node.children[index] == null) {
                    node.children[index] = new TrieNode();
                }
                node = node.children[index];
            }
            node.isEndOfWord = true;
        }

        // Check if a word exists in the Trie
        public static boolean search(String word) {
            TrieNode node = root;
            for (char c : word.toCharArray()) {
                int index = c - 'a';
                if (node.children[index] == null) {
                    return false;
                }
                node = node.children[index];
            }
            return node.isEndOfWord;
        }



        public static String longestWord(String[] words) {

            // Sort the words by length (longest first) and lexicographically
            Arrays.sort(words, (a, b) -> {
                if (a.length() == b.length()) {
                    return a.compareTo(b);  // Lexicographical order
                } else {
                    return b.length() - a.length();  // Longer words first
                }
            });

            // Find the longest word who's every prefix exists in the trie
            for (String word : words) {
                if (allPrefixesExist(word)) {
                    return word;
                }
            }

            return "";
        }

        // Check if all prefixes of the word exist in the Trie
        private static boolean allPrefixesExist(String word) {
            String prefix = "";
            for (int i = 0; i < word.length(); i++) {
                prefix += word.charAt(i);
                if (!search(prefix)) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
            for(String s: words)
                insert(s);
            System.out.println("Longest word with all prefixes: " + longestWord(words));
        }
    }


