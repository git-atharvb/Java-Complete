package Recursion;
public class OccurenceOfElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 2};
        int target = 2;
        int count = countOccurrences(arr, target, 0);
        System.out.println("The number " + target + " occurs " + count + " times in the array.");
    }
    public static int countOccurrences(int[] arr, int target, int index) {
        if (index == arr.length) {
            return 0; // Base case: end of array
        }
        int countInRest = countOccurrences(arr, target, index + 1); // Recursive call for the rest of the array
        if (arr[index] == target) {
            return 1 + countInRest; // If current element matches target, add 1 to the count from the rest
        } else {
            return countInRest; // If not a match, just return the count from the rest
        }
    }
}