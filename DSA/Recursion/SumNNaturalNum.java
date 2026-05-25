package Recursion;
import java.util.Scanner;
public class SumNNaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int result = sumOfNNaturalNumbers(n);
        System.out.println("The sum of the first " + n + " natural numbers is: " + result);
    sc.close();
    }
    public static int sumOfNNaturalNumbers(int n) {
        if (n == 1) {
            return 1; // Base case: the sum of the first 1 natural number is 1
        }
        return n + sumOfNNaturalNumbers(n - 1); // Recursive call: n plus the sum of the first (n-1) natural numbers
    }
}