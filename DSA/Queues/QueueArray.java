package Queues;

public class QueueArray {
    public static void main(String[] args) {
        SimpleQueue queue = new SimpleQueue(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);

        System.out.println("Front element: " + queue.peekFront());
        System.out.println("Queue size: " + queue.size());

        System.out.println("Removing element: " + queue.remove());
        System.out.println("Front element after removal: " + queue.peekFront());
        System.out.println("Queue size after removal: " + queue.size());
        System.out.println("Is the queue empty? " + queue.isEmpty());
        System.out.println("Is the queue full? " + queue.isFull());
        queue.insert(60); // This will wrap around
        System.out.println("Is the queue full after inserting more elements? " + queue.isFull());
        while (!queue.isEmpty()) {
            System.out.println("Removing element: " + queue.remove());
        }
    }
}
