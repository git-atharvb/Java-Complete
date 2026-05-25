package Stack;
import java.util.*;
public class Stack<T> {
    private List<T> list;
    public Stack() {
        list = new ArrayList<>();
    }
    public void push(T val) {
        list.add(val);
    }
    public T pop() {
        if (list.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.remove(list.size() - 1);
    }
    public T peek() {
        if (list.isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return list.get(list.size() - 1);
    }

    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after pop: " + stack.peek());
        stack.push(4);
        System.out.println("Top element after pushing 4: " + stack.peek());
        while (true) {
            try {
                System.out.println("Popped element: " + stack.pop());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
        // Testing stack with more elements
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println("Top element after pushing 0-4: " + stack.peek());
        // Pop all elements to test stack behavior
        while (true) {
            try {
                System.out.println("Popped element: " + stack.pop());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                break;
            }
        }
        // Testing stack with a large number of elements
        for (int i = 0; i < 100; i++) {
            stack.push(i);
        }
        // Pop all elements to test stack behavior with a large number of elements
        while (true) {
            try {
                System.out.println("Popped element: " + stack.pop());
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                break;
            }
        }   
        // Testing stack with negative numbers
        stack.push(-1);
        stack.push(-2);
        System.out.println("Top element after pushing -1 and -2: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after popping: " + stack.peek());
        // Testing stack with duplicate elements
        stack.push(5);
        stack.push(5);
        System.out.println("Top element after pushing duplicate 5s: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after popping one 5: " + stack.peek());
        // Testing stack with a mix of positive and negative numbers
        stack.push(10);
        stack.push(-10);
        System.out.println("Top element after pushing 10 and -10: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top element after popping: " + stack.peek());
        // Testing stack with a mix of different data types (using Integer wrapper class)
        Stack<Integer> stack2 = new Stack<>(); 
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        System.out.println("Top element in stack2: " + stack2.peek());
        System.out.println("Popped element from stack2: " + stack2.pop());
        System.out.println("Top element in stack2 after pop: " + stack2.peek());
        // Testing stack with a mix of different data types (using Object class)
        Stack<Object> stack3 = new Stack<>();
        stack3.push(1);
        stack3.push("Hello");
        stack3.push(3.14);
        System.out.println("Top element in stack3: " + stack3.peek());
        System.out.println("Popped element from stack3: " + stack3.pop());
        System.out.println("Top element in stack3 after pop: " + stack3.peek());
        // Testing stack with a mix of different data types (using generics)
        Stack<Integer> stack4 = new Stack<>();
        stack4.push(1);
        stack4.push(2); 
        stack4.push(3);
        System.out.println("Top element in stack4: " + stack4.peek());
        System.out.println("Popped element from stack4: " + stack4.pop());
        System.out.println("Top element in stack4 after pop: " + stack4.peek());
    }
}