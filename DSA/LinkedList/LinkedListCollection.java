package LinkedList;
import java.util.LinkedList;
public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        list.add("LinkedList");
        System.out.println("Elements in the LinkedList:");
        for (String element : list) {
            System.out.println(element);
        }
        // Accessing elements        
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        // Removing elements        
        list.removeFirst(); 
        System.out.println("After removing the first element:");
        for (String element : list) {
            System.out.println(element);
        }
        // Checking if the list contains an element        
        System.out.println("Does the list contain 'World'? " + list.contains("World"));  
        // Clearing the list        
        list.clear();
        System.out.println("Is the list empty? " + list.isEmpty());
        // Adding more elements
        list.add("New");    
        list.add("Elements");
        // Adding elements at specific positions
        list.add(1, "Inserted");
        list.addFirst("First");
        list.addLast("Last");
        list.add(2, "Another");
        System.out.println("Elements after adding new ones:");
        for (String element : list) {
            System.out.println(element);
        }
        // Size of the list
        System.out.println("Size of the list: " + list.size());
        // Iterating using an iterator
        System.out.println("Iterating using an iterator:");
        var iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Using LinkedList as a stack
        list.push("Stack Element");
        System.out.println("After pushing an element to the stack:");
        for (String element : list) {
            System.out.println(element);
        }
        // Using LinkedList as a queue
        list.offer("Queue Element");    
        System.out.println("After offering an element to the queue:");
        for (String element : list) {
            System.out.println(element);
        }   
        // Removing elements from the stack and queue
        list.pop(); // Removes the top element of the stack 
        list.poll(); // Removes the head of the queue
        System.out.println("After popping from stack and polling from queue:");
        for (String element : list) {
            System.out.println(element);
        }
        // Final size of the list
        System.out.println("Final size of the list: " + list.size());
        // Final check if the list is empty
        System.out.println("Is the list empty at the end? " + list.isEmpty());
        // Final state of the list        System.out.println("Final state of the list:");
        for (String element : list) {
            System.out.println(element);
        }
        // This demonstrates various operations on a LinkedList in Java, including adding, removing, and iterating through elements, as well as using it as a stack and queue.
        // Note: The output of the program will depend on the operations performed and the state of the LinkedList at each step.
        // The LinkedList class in Java provides a doubly-linked list implementation, which allows for efficient insertion and removal of elements at both ends of the list. It also implements the List and Deque interfaces, making it versatile for various use cases.
        // The program demonstrates the use of LinkedList in Java, showcasing its capabilities and how it can be used in different scenarios. It also highlights the importance of understanding the underlying data structure when working with collections in Java.
        // The LinkedList class in Java is part of the java.util package and provides a way to store a collection of elements in a linked list structure. It allows for efficient insertion and removal of elements, as well as easy traversal through the list. The program demonstrates various operations that can be performed on a LinkedList, such as adding, removing, and iterating through elements, as well as using it as a stack and queue. It also highlights the importance of understanding the underlying data structure when working with collections in Java.
    }
}