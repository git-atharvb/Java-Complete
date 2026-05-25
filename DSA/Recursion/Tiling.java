package Recursion;
import java.util.Scanner;
public class Tiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the board (2 x n): ");
        int n = sc.nextInt();
        int result = countTilingWays(n);
        System.out.println("The number of ways to tile a 2 x " + n + " board is: " + result);
        sc.close();
    }
    public static int countTilingWays(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base cases: there is one way to tile a 2 x 0 or 2 x 1 board
        }
        return countTilingWays(n - 1) + countTilingWays(n - 2); // Recursive call: sum of ways to tile (n-1) and (n-2) boards
    }
}