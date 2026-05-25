package Operators;
public class OctalNumSystem {
    public static void main(String[] args) {
        int decimalNumber = 42;
        String octalString = Integer.toOctalString(decimalNumber);
        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Octal: " + octalString);
        // Converting octal string back to decimal
        int convertedDecimal = Integer.parseInt(octalString, 8);
        System.out.println("Converted back to Decimal: " + convertedDecimal);
        // Performing bitwise operations    
        int a = 5; // 5 in decimal is 5 in octal
        int b = 3; // 3 in decimal is 3 in octal
        int andResult = a & b; // Bitwise AND
        int orResult = a | b; // Bitwise OR
        int xorResult = a ^ b; // Bitwise XOR
        int notA = ~a; // Bitwise NOT
        System.out.println("Bitwise AND (a & b): " + andResult);
        System.out.println("Bitwise OR (a | b): " + orResult);
        System.out.println("Bitwise XOR (a ^ b): " + xorResult);
        System.out.println("Bitwise NOT (~a): " + notA);
        // Bitwise shift operations
        int leftShift = a << 1; // Left shift
        int rightShift = a >> 1; // Right shift
        System.out.println("Left Shift (a << 1): " + leftShift);
        System.out.println("Right Shift (a >> 1): " + rightShift);
        // Bitwise operations with octal literals
        int octalA = 05; // Octal literal for 5
        int octalB = 03; // Octal literal for 3
        int octalAnd = octalA & octalB; // Bitwise AND with octal literals
        System.out.println("Bitwise AND with octal literals: " + octalAnd);
        // Note: In Java, octal literals are represented with a leading zero (0). For example, 05 is an octal literal for 5 in decimal. However, using octal literals is less common in modern Java programming, and it's generally recommended to use binary or hexadecimal literals for better readability and clarity.
    }
}
