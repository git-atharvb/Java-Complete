import java.util.*;
public class UserArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int[] num = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are:");
        for (int i = 0; i < size; i++) {
            System.out.print(num[i] + " ");
        }
        sc.close();
    }
}