package Recursion;
import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to compute its factorial: ");
        int n = sc.nextInt(); // Change this value to compute the factorial of a different number
        long result = factorial(n);
        System.out.println("The factorial of " + n + " is: " + result);
        sc.close();
    }
    public static long factorial(int n) {
        if (n == 0) {
            return 1; // Base case: the factorial of 0 is 1
        }
        return n * factorial(n - 1); // Recursive call: n times the factorial of (n-1)
    }
}