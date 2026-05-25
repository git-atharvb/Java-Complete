import java.util.Scanner;
public class UserStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your email: ");
        String email = sc.nextLine();
        System.out.println("User Name: " + name);
        System.out.println("User Email: " + email);
        // Validate email format
        if (email.contains("@") && email.contains(".")) {
            System.out.println("Email format is valid.");
        } else {
            System.out.println("Email format is invalid.");
        }
        // Check if the name is empty
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty.");
        } else {
            System.out.println("Name is valid.");
        }
        // Check if the email starts with a specific domain
        if (email.endsWith("@example.com")) {
            System.out.println("Email is from example.com domain.");
        } else {
            System.out.println("Email is not from example.com domain.");
        }   
        // Split the email into username and domain
        String[] emailParts = email.split("@");
        if (emailParts.length == 2) {
            String emailUsername = emailParts[0];
            String emailDomain = emailParts[1];
            System.out.println("Email Username: " + emailUsername);
            System.out.println("Email Domain: " + emailDomain);
        } else {
            System.out.println("Invalid email format.");
        }
        //substring of the name
        if (name.length() >= 3) {
            String nameSubstring = name.substring(0, 3);
            System.out.println("First 3 characters of the name: " + nameSubstring);
        } else {
            System.out.println("Name is too short for substring.");
        }
        sc.close();
    }
}