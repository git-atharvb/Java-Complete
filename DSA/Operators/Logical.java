package Operators;
public class Logical {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        // Logical Operators
        boolean andResult = a && b; // Logical AND
        boolean orResult = a || b; // Logical OR
        boolean notA = !a; // Logical NOT
        boolean notB = !b; // Logical NOT
        System.out.println("Logical AND (a && b): " + andResult);
        System.out.println("Logical OR (a || b): " + orResult);
        System.out.println("Logical NOT (!a): " + notA);
        System.out.println("Logical NOT (!b): " + notB);
        // Short-circuit evaluation
        boolean shortCircuitAnd = (a || b) && (b || a); // This will short-circuit
        boolean shortCircuitOr = (a && b) || (b && a); // This will short-circuit
        System.out.println("Short-circuit AND: " + shortCircuitAnd);
        System.out.println("Short-circuit OR: " + shortCircuitOr);
        // Combining logical operators
        boolean combinedResult = (a && !b) || (b && !a); // This combines multiple logical operators
        System.out.println("Combined Logical Result: " + combinedResult);
        // Logical operators with relational expressions
        int x = 10;
        int y = 20;
        boolean relationalAndLogical = (x < y) && (y > x); // Combining relational and logical operators
        System.out.println("Relational and Logical Combined Result: " + relationalAndLogical);
        boolean relationalOrLogical = (x > y) || (y > x); // Combining relational and logical operators
        System.out.println("Relational or Logical Combined Result: " + relationalOrLogical);
        // Logical operators with boolean variables
        boolean isAdult = true;
        boolean hasPermission = false;
        boolean canAccess = isAdult && hasPermission; // Access control using logical operators
        System.out.println("Can Access: " + canAccess);
        // Logical operators with method calls
        boolean methodLogical = isEven(x) && isEven(y); // Using logical operators with method calls
        System.out.println("Both x and y are even: " + methodLogical);
        boolean methodLogicalOr = isEven(x) || isEven(y); // Using logical operators with method calls
        System.out.println("At least one of x or y is even: " + methodLogicalOr);
    }
    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}