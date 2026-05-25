package ErrorHandling;
public class Errors {
    public static void main(String[] args) {
        // Example of a syntax error
        // int x = 10 // Missing semicolon
        // Example of a runtime error (uncomment to see the error)
        // int result = 10 / 0; // Division by zero
        // Example of a logical error
        int a = 5;
        int b = 10;
        int sum = a - b; // Logical error: should be a + b
        System.out.println("The sum is: " + sum);
        // Handling exceptions with try-catch
        try {
            @SuppressWarnings("unused")
            int result = 10 / 0; // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }   
        // Example of a checked exception (uncomment to see the error)
        // FileReader file = new FileReader("nonexistentfile.txt"); // This will throw a FileNotFoundException
        // Handling checked exceptions with try-catch
        // Use try-with-resources to ensure FileReader is closed and avoid resource leak
        try (java.io.FileReader file = new java.io.FileReader("nonexistentfile.txt")) {
            System.out.println("Opened file successfully: " + file);
        } catch (java.io.FileNotFoundException e) {
            System.out.println("Caught a checked exception: " + e.getMessage());
        } catch (java.io.IOException e) {
            System.out.println("I/O error while closing the file: " + e.getMessage());
        }
        // Example of a custom exception
        try {
            validateAge(15); // This will throw a custom exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught a custom exception: " + e.getMessage());
        }   
        // Note: In Java, it's important to handle exceptions properly to prevent crashes and ensure that your program can recover gracefully from errors. Always use try-catch blocks to handle exceptions, and consider creating custom exceptions for specific error scenarios in your application.
    }
    // Custom exception class
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }
    // Method to validate age
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        } else {
            System.out.println("Age is valid.");
        }
    // Note: The above code demonstrates different types of errors in Java, including syntax errors, runtime errors, logical errors, checked exceptions, and custom exceptions. It's important to understand these concepts to write robust and error-free code. Always remember to handle exceptions properly and use custom exceptions when necessary to provide meaningful error messages to users or developers.
    // Additionally, you can also use the finally block to execute code that must run regardless of whether an exception was thrown or caught. This is useful for cleaning up resources, such as closing files or database connections, to prevent memory leaks and ensure that your application runs smoothly.
    // Example of using finally block
    try {
        int result = 10 / 0; // This will throw an ArithmeticException
    } catch (ArithmeticException e) {
        System.out.println("Caught an exception: " + e.getMessage());
    } finally {
        System.out.println("This block will always execute, regardless of exceptions.");        
        }
        // Note: The finally block is optional and can be used in conjunction with try-catch blocks to ensure that certain code is executed regardless of whether an exception occurs or not. It's a good practice to use the finally block for cleanup operations, such as closing resources, to prevent memory leaks and ensure that your application runs efficiently.
        // In summary, understanding and handling errors effectively is crucial for writing robust and reliable Java applications. By using try-catch blocks, custom exceptions, and finally blocks, you can manage errors gracefully and provide a better user experience while maintaining the integrity of your application. Always remember to test your code thoroughly to identify and fix any potential errors before deploying it to production.
        // Always remember to handle exceptions properly and use custom exceptions when necessary to provide meaningful error messages to users or developers. Additionally, consider using logging frameworks, such as Log4j or SLF4J, to log exceptions and errors in a more structured and manageable way, especially in larger applications where debugging can be more complex.
    }
}