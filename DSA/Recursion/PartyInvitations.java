package Recursion;
import java.util.Scanner;
public class PartyInvitations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of people to invite: ");
        int n = sc.nextInt();
        long result = countInvitations(n);
        System.out.println("The number of ways to invite " + n + " people is: " + result);
        sc.close();
    }
    public static long countInvitations(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case: there is one way to invite 0 or 1 person
        }
        return countInvitations(n - 1) + (n - 1) * countInvitations(n - 2); // Recursive call: invite the first person alone or with one of the remaining (n-1) people
    }
}