package Stack;

public class ArrayStack {
    private int[] stack;
    private int top;
    private int capacity;

    public ArrayStack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public void push(int x) {
        if (top == capacity - 1) {
            throw new RuntimeException("Stack is full");
        }
        stack[++top] = x;
    }

    public int pop() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top--];
    }

    public int peek() {
        if (top == -1) {
            throw new RuntimeException("Stack is empty");
        }
        return stack[top];
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
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
    }
}