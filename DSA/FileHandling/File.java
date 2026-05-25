package FileHandling;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
// or just import java.io.*; to include all classes in the java.io package
public class File {
    public static void main(String[] args) {
        //File handling in Java involves using classes from the java.io package, such as File, FileReader, FileWriter, BufferedReader, BufferedWriter, etc. Here is a simple example of how to create a file, write to it, and read from it:
        // File handling example
        String filePath = "example.txt";   
        // Writing to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Hello, this is a file handling example in Java.");
            writer.newLine();
            writer.write("This file is created using BufferedWriter.");
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        // Reading from a file
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(filePath))) {
            String line;
            System.out.println("Contents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("An error occurred while reading from the file: " + ex.getMessage()); 
        }
        }
        // Note: When working with file handling in Java, it's important to handle exceptions properly, as file operations can throw IOException. Additionally, using try-with-resources (as shown in the example) ensures that resources are closed automatically, preventing potential memory leaks. Always ensure that the file path is correct and that you have the necessary permissions to read/write to the file.
        // append to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) { // 'true' for append mode
            writer.write("This line is appended to the file.");
            writer.newLine();
            System.out.println("Line appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file: " + e.getMessage());
        }
        // Reading the updated file
        try (java.io.BufferedReader reader = new java.io.BufferedReader(new java.io.FileReader(filePath))) {
            String line;
            System.out.println("Updated contents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("An error occurred while reading from the file: " + ex.getMessage()); 
        }
        // Note: The above code demonstrates basic file handling operations in Java, including writing to a file, reading from a file, and appending to a file. You can further explore other file handling classes and methods in the java.io package for more advanced functionalities, such as handling binary files, using FileInputStream and FileOutputStream for byte streams, and utilizing the java.nio package for non-blocking I/O operations.
        // Always remember to handle exceptions properly and ensure that resources are closed to prevent memory leaks when working with file handling in Java.
        // Additionally, you can also use the java.nio.file package for more modern and efficient file handling operations, such as using Files class for reading and writing files, and Path class for handling file paths. The java.nio.file package provides a more flexible and powerful API for file handling in Java.
        // Example of using java.nio.file package for file handling
        java.nio.file.Path path = java.nio.file.Paths.get("example_nio.txt");
        // Writing to a file using java.nio.file
        try {
            java.nio.file.Files.write(path, "Hello, this is a file handling example using java.nio.file package.".getBytes());
            System.out.println("File written successfully using java.nio.file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
        // Reading from a file using java.nio.file
        try {   
            java.util.List<String> lines = java.nio.file.Files.readAllLines(path);
            System.out.println("Contents of the file read using java.nio.file:");
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.println("An error occurred while reading from the file: " + ex.getMessage()); 
        }
        // Note: The java.nio.file package provides a more modern and efficient way to handle file operations in Java. It offers better performance and more features compared to the traditional java.io package. When working with files, it's recommended to use the java.nio.file package for better performance and improved functionality.
        // Always ensure to handle exceptions properly and close resources when working with file handling in Java, regardless of the package you choose to use. Proper exception handling and resource management are crucial for preventing issues such as memory leaks and ensuring the stability of your application when dealing with file operations.
        // In summary, file handling in Java can be done using both the java.io and java.nio.file packages, each offering different approaches and functionalities for working with files. It's important to choose the appropriate package based on your specific needs and requirements when performing file operations in Java.
    }
}