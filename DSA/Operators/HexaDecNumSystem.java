package Operators;
public class HexaDecNumSystem {
    public static void main(String[] args) {
        int decimalNumber = 42;
        String hexString = Integer.toHexString(decimalNumber);
        System.out.println("Decimal: " + decimalNumber);
        System.out.println("Hexadecimal: " + hexString);
        // Converting hexadecimal string back to decimal
        int convertedDecimal = Integer.parseInt(hexString, 16);
        System.out.println("Converted back to Decimal: " + convertedDecimal);
        // Performing bitwise operations    
        int a = 5; // 5 in decimal is 5 in hexadecimal
        int b = 3; // 3 in decimal is 3 in hexadecimal
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
        // Bitwise operations with hexadecimal literals
        int hexA = 0x5; // Hexadecimal literal for 5
        int hexB = 0x3; // Hexadecimal literal for 3
        int hexAnd = hexA & hexB; // Bitwise AND with hexadecimal literals
        System.out.println("Bitwise AND with hexadecimal literals: " + hexAnd);
        // Note: In Java, hexadecimal literals are represented with a leading "0x". For example, 0x5 is a hexadecimal literal for 5 in decimal. Using hexadecimal literals can improve readability when working with values that are commonly represented in hexadecimal, such as color codes or memory addresses.
    }
}