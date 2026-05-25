package Trie;
public class Basictrie {
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
        public boolean search(String word) {
            TrieNode current = root;
            for (char ch : word.toCharArray()) {
                int index = ch - 'a';
                if (current.children[index] == null) {
                    return false;
                }
                current = current.children[index];
            }
            return current.isEndOfWord;
        }
    }
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("hello");
        trie.insert("world");
        System.out.println(trie.search("hello")); // true
        System.out.println(trie.search("world")); // true
        System.out.println(trie.search("hi"));    // false
        // Additional test cases
        trie.insert("hi");
        System.out.println(trie.search("hi"));    // true
        System.out.println(trie.search("hell"));  // false
        // Edge case: searching for an empty string
        System.out.println(trie.search(""));      // false
        // Edge case: inserting and searching for an empty string
        trie.insert("");
        System.out.println(trie.search(""));      // true
        // Edge case: searching for a word that is a prefix of another word
        System.out.println(trie.search("hell"));  // false  
        // Edge case: inserting a word that is a prefix of another word
        trie.insert("hell");
        System.out.println(trie.search("hell"));  // true
        // Edge case: searching for a word that is not in the trie
        System.out.println(trie.search("worlds")); // false
        //Trie with only one word
        Trie singleWordTrie = new Trie();
        singleWordTrie.insert("single");
        System.out.println(singleWordTrie.search("single")); // true
        System.out.println(singleWordTrie.search("sing"));   // false
        //Default trie with no words
        Trie emptyTrie = new Trie();
        System.out.println(emptyTrie.search("anything")); // false
        //Defining a trie with multiple words that share common prefixes
        Trie prefixTrie = new Trie();  
        prefixTrie.insert("cat");
        prefixTrie.insert("car");
        prefixTrie.insert("cart");
        System.out.println(prefixTrie.search("cat"));   // true
        System.out.println(prefixTrie.search("car"));   // true
        System.out.println(prefixTrie.search("cart"));  // true
        System.out.println(prefixTrie.search("ca"));    // false
        System.out.println(prefixTrie.search("cars"));  // false
    }
}