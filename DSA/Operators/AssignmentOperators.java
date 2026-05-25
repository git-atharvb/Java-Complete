package Operators;
import java.util.Scanner;
public class AssignmentOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A number: ");
        int a = sc.nextInt();
        System.out.println("Initial value of a: " + a);
        a += 5; // Addition assignment (a = a + 5)
        System.out.println("After addition assignment (a += 5): " + a);
        a -= 3; // Subtraction assignment (a = a - 3)
        System.out.println("After subtraction assignment (a -= 3): " + a);
        a *= 2; // Multiplication assignment (a = a * 2)
        System.out.println("After multiplication assignment (a *= 2): " + a);
        a /= 4; // Division assignment (a = a / 4)
        System.out.println("After division assignment (a /= 4): " + a);
        a %= 3; // Modulus assignment (a = a % 3)
        System.out.println("After modulus assignment (a %= 3): " + a);
        System.out.print("Enter B number: ");
        int b =sc.nextInt();
        System.out.println("Initial value of b: " + b);
        b <<= 1; // Left shift assignment (b = b << 1)
        System.out.println("After left shift assignment (b <<= 1): " + b);
        b >>= 1; // Right shift assignment (b = b >> 1)
        System.out.println("After right shift assignment (b >>= 1): " + b);
        b &= 3; // Bitwise AND assignment (b = b & 3)
        System.out.println("After bitwise AND assignment (b &= 3): " + b);
        b |= 2; // Bitwise OR assignment (b = b | 2)
        System.out.println("After bitwise OR assignment (b |= 2): " + b);
        b ^= 1; // Bitwise XOR assignment (b = b ^ 1)
        System.out.println("After bitwise XOR assignment (b ^= 1): " + b);
        // Note: Assignment operators in Java provide a shorthand way to perform an operation and assign the result back to the variable. They can make code more concise and easier to read when performing common operations on variables. However, it's important to use them judiciously to maintain code clarity, especially when multiple operations are combined in a single statement.
        sc.close();
    }
}