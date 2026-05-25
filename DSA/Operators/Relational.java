package Operators;
public class Relational {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // Relational Operators
        boolean isEqual = (a == b); // Equal to
        boolean isNotEqual = (a != b); // Not equal to
        boolean isGreater = (a > b); // Greater than
        boolean isLess = (a < b); // Less than
        boolean isGreaterOrEqual = (a >= b); // Greater than or equal to
        boolean isLessOrEqual = (a <= b); // Less than or equal to
        System.out.println("Is Equal: " + isEqual);
        System.out.println("Is Not Equal: " + isNotEqual);
        System.out.println("Is Greater: " + isGreater);
        System.out.println("Is Less: " + isLess);
        System.out.println("Is Greater or Equal: " + isGreaterOrEqual);
        System.out.println("Is Less or Equal: " + isLessOrEqual);
        // Comparing floating-point numbers
        double x = 0.1 + 0.2;
        double y = 0.3;
        boolean areDoublesEqual = (x == y); // This may be false due to
        // floating-point precision issues
        System.out.println("Are doubles equal: " + areDoublesEqual);
        // Comparing strings
        String str1 = "Hello";
        String str2 = "Hello";
        boolean areStringsEqual = str1.equals(str2); // Use equals() for string comparison
        System.out.println("Are strings equal: " + areStringsEqual);
        // Comparing characters
        char char1 = 'A';
        char char2 = 'B';
        boolean areCharsEqual = (char1 == char2); // Compare characters using ==
        System.out.println("Are characters equal: " + areCharsEqual);
        // Comparing boolean values
        boolean bool1 = true;
        boolean bool2 = false;
        boolean areBooleansEqual = (bool1 == bool2); // Compare boolean values
        System.out.println("Are booleans equal: " + areBooleansEqual);
        // Comparing objects (reference types)
        Object obj1 = new Object();
        Object obj2 = new Object();
        boolean areObjectsEqual = (obj1 == obj2); // This compares references, not
        // object content
        System.out.println("Are objects equal (reference comparison): " + areObjectsEqual);
        // To compare object content, you would typically override the equals() method in the class of the objects being compared.
    }
}