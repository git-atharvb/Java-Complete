package Operators;
public class Bitwise {
    public static void main(String[] args) {
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
        // Bitwise operations with literals
        int literalAnd = 0b0101 & 0b0011; // Bitwise AND with binary literals
        System.out.println("Bitwise AND with binary literals: " + literalAnd);
        int literalOr = 0b0101 | 0b0011; // Bitwise OR with binary literals
        System.out.println("Bitwise OR with binary literals: " + literalOr);
        int literalXor = 0b0101 ^ 0b0011; // Bitwise XOR with binary literals
        System.out.println("Bitwise XOR with binary literals: " + literalXor);
        int literalNot = ~0b0101; // Bitwise NOT with binary literals
        System.out.println("Bitwise NOT with binary literals: " + literalNot);
        // Note: In Java, bitwise operators work on the binary representation of integers. The results of bitwise operations can be useful for tasks such as setting, clearing, or toggling specific bits in a number, as well as for performing low-level data manipulation and optimization.
    }
}