package Recursion;
public class MovingX {
    public static void main(String[] args) {
        String str = "axbcxxd";
        String result = moveXToEnd(str);
        System.out.println("String after moving 'x' to the end: " + result);
    }
    public static String moveXToEnd(String str) {
        if (str.isEmpty()) {
            return ""; // Base case: empty string
        }
        char firstChar = str.charAt(0);
        String restOfString = moveXToEnd(str.substring(1)); // Recursive call for the rest of the string
        if (firstChar == 'x') {
            return restOfString + firstChar; // If the first character is 'x', append it to the end of the result from the rest
        } else {
            return firstChar + restOfString; // If not 'x', keep it at the front
        }
    }
}