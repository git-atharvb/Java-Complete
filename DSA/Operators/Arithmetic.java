package Operators;
import java.util.Scanner;
public class Arithmetic {
    public static void main(String[] args) {
        //Binary Operators
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = a + b; // Addition
        int difference = a - b; // Subtraction
        int product = a * b; // Multiplication
        int quotient = a / b; // Division
        int remainder = a % b; // Modulus
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        //Unary Operators
        int c = 10;
        c++; // Post-increment
        System.out.println("Post-increment: " + c);
        ++c; // Pre-increment
        System.out.println("Pre-increment: " + c);
        c--; // Post-decrement
        System.out.println("Post-decrement: " + c);
        --c; // Pre-decrement
        System.out.println("Pre-decrement: " + c);  
        int d = -5;
        int negation = -d; // Unary minus
        System.out.println("Negation: " + negation);
        boolean isPositive = (a > 0); // Logical NOT    
        boolean notPositive = !isPositive; // Logical NOT
        System.out.println("Is Positive: " + isPositive);
        System.out.println("Not Positive: " + notPositive);
        sc.close();
    }
}