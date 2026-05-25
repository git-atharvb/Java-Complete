package Trie;
public class startsWithProbelm {
    static class TrieNode {
        TrieNode[] children;
        boolean isEndOfWord;
        public TrieNode() {
            children = new TrieNode[26]; // Assuming only lowercase letters
            isEndOfWord = false;
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
            }
            current.isEndOfWord = true;
        }
        public boolean startsWith(String prefix) {
            TrieNode current = root;
            for (char ch : prefix.toCharArray()) {
                int index = ch - 'a';
                if (current.children[index] == null) {
                    return false;
                }
                current = current.children[index];
            }
            return true; // If we can traverse the prefix, it exists
        }
    }
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("hello");
        trie.insert("world");
        System.out.println(trie.startsWith("he")); // true
        System.out.println(trie.startsWith("wo")); // true
        System.out.println(trie.startsWith("hi")); // false
    }
}
