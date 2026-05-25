package Recursion;
import java.util.Scanner;
public class SubsetNnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the set: ");
        int n = sc.nextInt();
        System.out.println("All subsets of the set {1, 2, ..., " + n + "}:");
        printSubsets(n, 1, "");
        sc.close();
    }
    public static void printSubsets(int n, int current, String subset) {
        if (current > n) {
            System.out.println(subset); // Base case: print the current subset
            return;
        }
        // Recursive call including the current number
        printSubsets(n, current + 1, subset + current + " ");
        // Recursive call excluding the current number
        printSubsets(n, current + 1, subset);
    }
}