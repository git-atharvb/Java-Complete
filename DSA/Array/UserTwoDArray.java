package Array;
import java.util.*;
public class UserTwoDArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        System.out.println("Enter the number of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter the number of columns:");
        int cols=sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of the 2D array:");  
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("The elements of the 2D array are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        // Search for an element in the 2D array
        System.out.println("Enter the element to search in the 2D array:");
        int target = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == target) {
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (found) {
            System.out.println("Element found in the 2D array.");
        } else {
            System.out.println("Element not found in the 2D array.");
        }
        // Find the maximum element in the 2D array
        int max = arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The maximum element in the 2D array is: " + max);
        sc.close();
    }
}