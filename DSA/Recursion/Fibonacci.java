package Recursion;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        int n = sc.nextInt(); // Change this value to compute Fibonacci for a different number
        System.out.println("The first " + n + " numbers in the Fibonacci sequence are:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        sc.close();
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Base cases: F(0) = 0, F(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive call: F(n) = F(n-1) + F(n-2)
    }
}
