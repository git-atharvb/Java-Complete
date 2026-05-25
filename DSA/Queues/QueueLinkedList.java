package Queues;

public class QueueLinkedList {
    private Node front;
    private Node rear;
    private int size;

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public QueueLinkedList() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void insert(int item) {
        Node newNode = new Node(item);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public int remove() {
        if (front == null) {
            throw new RuntimeException("Queue is empty!");
        }
        int temp = front.data;
        front = front.next;
        if (front == null) {
            rear = null; // If the queue becomes empty
        }
        size--;
        return temp;
    }

    public int peekFront() {
        if (front == null) {
            throw new RuntimeException("Queue is empty!");
        }
        return front.data;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public int size() {
        return size;
    }
    // Main method for testing the QueueLinkedList implementation
    public static void main(String[] args) {
    // Create a queue and perform some operations
    QueueLinkedList queue = new QueueLinkedList();
    queue.insert(10);
    queue.insert(20);
    queue.insert(30);
    System.out.println("Front element: " + queue.peekFront());
    System.out.println("Queue size: " + queue.size());
    System.out.println("Removing element: " + queue.remove());
    System.out.println("Front element after removal: " + queue.peekFront());
    System.out.println("Is the queue empty? " + queue.isEmpty());
    queue.insert(40);
    queue.insert(50);
    System.out.println("Queue size after inserting more elements: " + queue.size());
    while (!queue.isEmpty()) {
        System.out.println("Removing element: " + queue.remove());
    }
    System.out.println("Is the queue empty after removing all elements? " + queue.isEmpty());
    // Testing edge cases   
    try {
        queue.remove(); // Attempting to remove from an empty queue
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());

        }
    try {        queue.peekFront(); // Attempting to peek from an empty queue
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
        }
    // Final check to confirm the queue is empty
    System.out.println("Is the queue empty at the end? " + queue.isEmpty());       
    }
}
