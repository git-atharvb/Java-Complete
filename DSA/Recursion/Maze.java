package Recursion;
import java.util.Scanner;
public class Maze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the maze (n x n): ");
        int n = sc.nextInt();
        System.out.println("All paths from top-left to bottom-right in a " + n + "x" + n + " maze:");
        findPaths(0, 0, n, "");
        sc.close();
    }
    public static void findPaths(int row, int col, int n, String path) {
        // Base case: if we have reached the bottom-right corner
        if (row == n - 1 && col == n - 1) {
            System.out.println(path);
            return;
        }
        // Move down
        if (row < n - 1) {
            findPaths(row + 1, col, n, path + "D"); // D for Down
        }
        // Move right
        if (col < n - 1) {
            findPaths(row, col + 1, n, path + "R"); // R for Right
        }
    }
}