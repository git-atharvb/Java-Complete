package Queues;

class CircularQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    public void insert(int value) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = value;
        size++;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        int value = arr[front];
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            front = (front + 1) % capacity;
        }
        size--;
        return value;
    }

    public int peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return arr[front];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}

public class CircularQueueArray {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
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
