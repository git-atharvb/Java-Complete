package Recursion;
public class Subsequence {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("All subsequences of the string \"" + str + "\":");
        printSubsequences(str, "");
    }
    public static void printSubsequences(String str, String current) {
        if (str.isEmpty()) {
            System.out.println(current); // Base case: print the current subsequence
            return;
        }
        // Recursive call including the first character
        printSubsequences(str.substring(1), current + str.charAt(0));
        // Recursive call excluding the first character
        printSubsequences(str.substring(1), current);
    }
}