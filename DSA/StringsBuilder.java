public class StringsBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(", ");
        sb.append("World!");
        System.out.println(sb.toString());
        // Insert a string at a specific index
        sb.insert(5, " Beautiful");
        System.out.println("After Insertion: " + sb.toString());
        //append a string to the end
        sb.append(" Welcome to StringBuilder.");
        System.out.println("After Appending: " + sb.toString());
        // Replace a portion of the string
        sb.replace(7, 16, "Amazing");
        System.out.println("After Replacement: " + sb.toString());
        // Delete a portion of the string
        sb.delete(5, 15);
        System.out.println("After Deletion: " + sb.toString());
        // Reverse the string
        sb.reverse();
        System.out.println("After Reversing: " + sb.toString());
        // Character at a specific index
        char charAtIndex = sb.charAt(3);    
        System.out.println("Character at index 3: " + charAtIndex);
        // Convert StringBuilder to String
        String finalString = sb.toString();
        System.out.println("Final String: " + finalString);
        // Check the length of the StringBuilder    
        int length = sb.length();
        System.out.println("Length of StringBuilder: " + length);
        // Check the capacity of the StringBuilder
        int capacity = sb.capacity();   
        System.out.println("Capacity of StringBuilder: " + capacity);
        // Clear the StringBuilder
        sb.setLength(0);
        System.out.println("After Clearing: '" + sb.toString() + "'");
        // Append multiple strings in a loop
        for (int i = 0; i < 5; i++) {
            sb.append("Number ").append(i).append(" ");
        }
        System.out.println("After Loop: " + sb.toString());
        // Trim the capacity to the current length
        sb.trimToSize();
        System.out.println("After Trimming Capacity: " + sb.toString());
        // Check if the StringBuilder is empty
        boolean isEmpty = sb.length() == 0; 
        System.out.println("Is StringBuilder empty: " + isEmpty);
        //front character of the StringBuilder
        char frontChar = sb.charAt(0);
        System.out.println("Front character: " + frontChar);
        //back character of the StringBuilder
        char backChar = sb.charAt(sb.length() - 1);
        System.out.println("Back character: " + backChar);
    }
}