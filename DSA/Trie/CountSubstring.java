package Trie;
public class CountSubstring {
    static class TrieNode {
        TrieNode[] children;
        int count; // To count the number of times a substring appears
        public TrieNode() {
            children = new TrieNode[26]; // Assuming only lowercase letters
            count = 0;
        }
    }
    static class Trie {
        private TrieNode root;
        public Trie() {
            root = new TrieNode();
        }
        public void insert(String word) {
            TrieNode current = root;
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';
                if (current.children[index] == null) {
                    current.children[index] = new TrieNode();
                }
                current = current.children[index];
                current.count++; // Increment count for each node in the path
            }
        }
        public int countSubstring(String substring) {
            TrieNode current = root;
            for (char ch : substring.toCharArray()) {
                int index = ch - 'a';
                if (current.children[index] == null) {
                    return 0; // Substring not found
                }
                current = current.children[index];
            }
            return current.count; // Return the count of the substring
        }
    }
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("hello");
        trie.insert("hell");
        trie.insert("he");
        
        System.out.println(trie.countSubstring("he")); // Output: 3
        System.out.println(trie.countSubstring("hell")); // Output: 2
        System.out.println(trie.countSubstring("hello")); // Output: 1
        System.out.println(trie.countSubstring("hi")); // Output: 0
    }
}