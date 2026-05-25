package Queues;

public class SimpleQueue {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public SimpleQueue(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.nItems = 0;
    }

    public void insert(int item) {
        if (rear == maxSize - 1) {
            rear = -1; // Wrap around
        }
        rear++;
        queueArray[rear] = item;
        nItems++;
    }

    public int remove() {
        int temp = queueArray[front];
        front++;
        if (front == maxSize) {
            front = 0; // Wrap around
        }
        nItems--;
        return temp;
    }

    public int peekFront() {
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }
}