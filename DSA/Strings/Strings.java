package Strings;
public class Strings {
    public static void main(String[] args) {
        String name = "John Doe";
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);
        //Uppercase the name
        String upperCaseName = name.toUpperCase();
        System.out.println("Uppercase Name: " + upperCaseName);
        //Lowercase the name
        String lowerCaseName = name.toLowerCase(); 
        System.out.println("Lowercase Name: " + lowerCaseName);
        //Length of the name
        int nameLength = name.length();
        System.out.println("Length of Name: " + nameLength);
        //Substring of the name
        String firstName = name.substring(0, 4);
        System.out.println("First Name: " + firstName);
        //Replace spaces with underscores
        String modifiedName = name.replace(" ", "_");
        System.out.println("Modified Name: " + modifiedName);
        // Check if the name contains "Doe"
        boolean containsDoe = name.contains("Doe"); 
        System.out.println("Contains 'Doe': " + containsDoe);
        // Split the name into parts
        String[] nameParts = name.split(" ");  
        System.out.println("Name Parts:");
        for (String part : nameParts) {
            System.out.println(part);
        }   
        // Trim whitespace from the name
        String nameWithWhitespace = "   John Doe   ";   
        String trimmedName = nameWithWhitespace.trim();
        System.out.println("Trimmed Name: '" + trimmedName + "'");
        // Check if the name starts with "John"
        boolean startsWithJohn = name.startsWith("John");
        System.out.println("Starts with 'John': " + startsWithJohn);
        //character at a specific index
        char charAtIndex = name.charAt(5);
        System.out.println("Character at index 5: " + charAtIndex);
        //Concatinate two strings
        String firstName2 = "Jane";
        String lastName2 = "Smith"; 
        String fullName2 = firstName2 + " " + lastName2;
        System.out.println("Full Name: " + fullName2);
        //Compare two strings
        String name1 = "John";
        String name2 = "John";
        boolean areNamesEqual = name1.equals(name2);    
        System.out.println("Are names equal: " + areNamesEqual);
        //Check if the name is empty
        String emptyString = "";
        boolean isEmpty = emptyString.isEmpty();    
        System.out.println("Is the string empty: " + isEmpty);
    }
}