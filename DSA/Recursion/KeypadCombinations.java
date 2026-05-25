package Recursion;
public class KeypadCombinations {
    public static void main(String[] args) {
        String digits = "23";
        System.out.println("Possible combinations for digits \"" + digits + "\":");
        printCombinations(digits, "");
    }
    public static void printCombinations(String digits, String current) {
        if (digits.isEmpty()) {
            System.out.println(current); // Base case: print the current combination
            return;
        }
        char firstDigit = digits.charAt(0);
        String remainingDigits = digits.substring(1);
        String letters = getLettersForDigit(firstDigit);
        for (char letter : letters.toCharArray()) {
            printCombinations(remainingDigits, current + letter); // Recursive call for the remaining digits
        }
    }
    public static String getLettersForDigit(char digit) {
        switch (digit) {
            case '2': return "abc";
            case '3': return "def";
            case '4': return "ghi";
            case '5': return "jkl";
            case '6': return "mno";
            case '7': return "pqrs";
            case '8': return "tuv";
            case '9': return "wxyz";
            default: return "";
        }
    }
}