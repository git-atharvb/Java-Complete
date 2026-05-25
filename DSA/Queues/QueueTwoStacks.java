package Queues;
import java.util.Stack;
class TwoStackQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    public TwoStackQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    public void enqueue(int value) {
        stack1.push(value);
    }
    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }
    public int size() {
        return stack1.size() + stack2.size();
    }
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}
public class QueueTwoStacks {
    public static void main(String[] args) {
        TwoStackQueue queue = new TwoStackQueue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue size: " + queue.size());
        System.out.println("Dequeue element: " + queue.dequeue());
        System.out.println("Front element after dequeue: " + queue.peek());
        System.out.println("Queue size after dequeue: " + queue.size());
        System.out.println("Is the queue empty? " + queue.isEmpty());
        queue.enqueue(60);
        System.out.println("Front element after enqueueing 60: " + queue.peek());
        System.out.println("Queue size after enqueueing 60: " + queue.size());
        while (!queue.isEmpty()) {
            System.out.println("Dequeue element: " + queue.dequeue());
        }
        System.out.println("Is the queue empty after dequeuing all elements? " + queue.isEmpty());  
        try {
            queue.dequeue(); // Attempting to dequeue from an empty queue
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