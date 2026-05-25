package Queues;

public class QueueCollections {
    public static void main(String[] args) {
        //Collections for Queue
        java.util.Queue<Integer> queue = new java.util.LinkedList<>();
        // Adding elements to the queue
        queue.add(10);
        queue.add(20);
        queue.add(30);
        // Displaying the front element of the queue
        System.out.println("Front element: " + queue.peek());
        // Removing an element from the queue
        System.out.println("Removing element: " + queue.remove());
        // Displaying the front element after removal
        System.out.println("Front element after removal: " + queue.peek());
        // Checking if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());
        // Checking the size of the queue
        System.out.println("Queue size: " + queue.size());
        // Adding more elements to the queue
        queue.add(40);
        queue.add(50);
        // Displaying the size of the queue after adding more elements
        System.out.println("Queue size after adding more elements: " + queue.size());
        // Removing all elements from the queue
        while (!queue.isEmpty()) {
            System.out.println("Removing element: " + queue.remove());
        }
        // Final check to confirm the queue is empty
        System.out.println("Is the queue empty after removing all elements? " + queue.isEmpty());
        // Testing edge cases
        try {
            queue.remove(); // Attempting to remove from an empty queue
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }  
        try {
            queue.peek(); // Attempting to peek from an empty queue
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        // Final check to confirm the queue is empty
        System.out.println("Is the queue empty at the end? " + queue.isEmpty()); 
    }
}