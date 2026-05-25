package Trie;
public class LongWordPrefix {
    static class Node {
        Node[] children = new Node[26];
        boolean isEndOfWord = false;
    }
    public static Node root = new Node();
    public static String result = "";
    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.isEndOfWord = true;
    }
    /**
     * DFS traversal to find the longest word where every node in the path 
     * has isEndOfWord = true.
     */
    public static void findLongestWord(Node root, StringBuilder temp) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < 26; i++) {
            // Check lexicographically (a-z) and ensure the prefix exists
            if (root.children[i] != null && root.children[i].isEndOfWord) {
                char ch = (char) (i + 'a');
                temp.append(ch);
                if (temp.length() > result.length()) {
                    result = temp.toString();
                }
                findLongestWord(root.children[i], temp);
                
                // Backtrack
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }
    public static void main(String[] args) {
        String[] words = {"a", "banana", "app", "appl", "ap", "apply", "apple"};
        for (String word : words) {
            insert(word);
        }
        findLongestWord(root, new StringBuilder(""));
        // Expected output: apple (because 'apply' and 'apple' are same length, 
        // but 'apple' comes first lexicographically)
        System.out.println("Longest word with all prefixes: " + result);
    }
}