package Operators;
public class BinaryNumSystem {
    //base 2
    public static void main(String[] args) {
        int decimalNumber = 42;
        String binaryString = Integer.toBinaryString(decimalNumber);
        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Binary: " + binaryString);
        // Converting binary string back to decimal
        int convertedDecimal = Integer.parseInt(binaryString, 2);
        System.out.println("Converted back to Decimal: " + convertedDecimal);
        // Performing bitwise operations    
        int a = 5; // 0101 in binary
        int b = 3; // 0011 in binary
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
        // Bitwise operations with binary literals
        int binaryA = 0b0101; // Binary literal for 5
        int binaryB = 0b0011; // Binary literal for 3
        int binaryAnd = binaryA & binaryB; // Bitwise AND with binary literals
        System.out.println("Bitwise AND with binary literals: " + binaryAnd);
    }
}
