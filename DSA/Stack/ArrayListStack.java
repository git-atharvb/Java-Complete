package Stack;
public class ArrayListStack {
    public static void main(String[] args) {
        // Implementation for ArrayList-based stack
        // You can use ArrayList to implement stack operations
        // Example:
        java.util.ArrayList<Integer> stack = new java.util.ArrayList<>();
        stack.add(1); // push
        stack.add(2); // push
        stack.add(3); // push
        System.out.println("Top element: " + stack.get(stack.size() - 1)); // peek
        System.out.println("Popped element: " + stack.remove(stack.size() - 1)); // pop
        System.out.println("Top element after pop: " + stack.get(stack.size() - 1)); // peek
        stack.add(4); // push   
        System.out.println("Top element after pushing 4: " + stack.get(stack.size() - 1)); // peek
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.remove(stack.size() - 1)); // pop
        }   
        try {
            stack.remove(stack.size() - 1); // pop from empty stack
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Stack is empty");
        }   
        // Testing stack with more elements
        for (int i = 0; i < 5; i++) {
            stack.add(i); // push
        }
        System.out.println("Top element after pushing 0-4: " + stack.get(stack.size() - 1)); // peek
        // Pop all elements to test stack behavior
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.remove(stack.size() - 1)); // pop
        }
        // Testing stack with a large number of elements
        for (int i = 0; i < 100; i++) {
            stack.add(i); // push
        }
        // Pop all elements to test stack behavior with a large number of elements
        while (!stack.isEmpty()) {
            System.out.println("Popped element: " + stack.remove(stack.size() - 1)); // pop
        }
    }
}