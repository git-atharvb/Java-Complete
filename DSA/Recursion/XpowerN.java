package Recursion;
import java.util.Scanner;
public class XpowerN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int x = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int n = sc.nextInt();
        long result = power(x, n);
        System.out.println(x + " raised to the power of " + n + " is: " + result);
        sc.close();
    }
    public static long power(int x, int n) {
        if (n == 0) {
            return 1; // Base case: any number raised to the power of 0 is 1
        }
        return x * power(x, n - 1); // Recursive call: x times x raised to the power of (n-1)
    }
}
