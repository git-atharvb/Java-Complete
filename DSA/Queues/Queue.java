package Queues;
public class Queue {
    public static void main(String[] args) {
        SimpleQueue queue = new SimpleQueue(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        System.out.println("Front element: " + queue.peekFront());
        System.out.println("Queue size: " + queue.size());
        System.out.println("Removing element: " + queue.remove());
        System.out.println("Front element after removal: " + queue.peekFront());
        System.out.println("Is the queue empty? " + queue.isEmpty());
        System.out.println("Is the queue full? " + queue.isFull());
        queue.insert(40);
        queue.insert(50);
        queue.insert(60); // This will wrap around
        System.out.println("Is the queue full after inserting more elements? " + queue.isFull());
        while (!queue.isEmpty()) {
            System.out.println("Removing element: " + queue.remove());
        }
        System.out.println("Is the queue empty after removing all elements? " + queue.isEmpty());
        // Testing wrap-around behavior
        queue.insert(70);   
        queue.insert(80);
        System.out.println("Front element after wrap-around: " + queue.peekFront());
        // Removing elements to test wrap-around
        System.out.println("Removing element: " + queue.remove());  
        System.out.println("Front element after removing one element: " + queue.peekFront());
        // Inserting more elements to test wrap-around again
        queue.insert(90);
        System.out.println("Front element after inserting more elements: " + queue.peekFront());
        // Final state of the queue
        System.out.println("Final queue size: " + queue.size());
        // printing remaining elements in the queue
        while (!queue.isEmpty()) {
            System.out.println("Removing element: " + queue.remove());
        }
        // Final check to confirm the queue is empty
        System.out.println("Is the queue empty at the end? " + queue.isEmpty());
        // Testing edge cases
        try {
            queue.remove(); // Attempting to remove from an empty queue
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }   
        try {
            queue.peekFront(); // Attempting to peek from an empty queue
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}