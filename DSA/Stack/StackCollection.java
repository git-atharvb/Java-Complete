package Stack;

public class StackCollection {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(100001);
        Stack<Integer> linkedListStack = new Stack<>();
        System.out.println("Testing ArrayStack:");
        StackConditions.main(args);
        System.out.println("\nTesting LinkedListStack:");
        LinkedListStack.main(args);
        // You can add more tests or comparisons between the two stack implementations here
        // For example, you can test the performance of both stacks with a large number of elements
        // Testing performance of ArrayStack
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayStack.push(i);
        }
        for (int i = 0; i < 100000; i++) {
            arrayStack.pop();
        }
        long endTime = System.nanoTime();
        System.out.println("ArrayStack time: " + (endTime - startTime) + " nanoseconds");
        // Testing performance of LinkedListStack
        startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedListStack.push(i);
        }   
        for (int i = 0; i < 100000; i++) {
            linkedListStack.pop();
        }
        endTime = System.nanoTime();
        System.out.println("LinkedListStack time: " + (endTime - startTime) + " nanoseconds");  
        // You can also compare the memory usage of both stacks if needed
        // Note: Memory usage comparison can be complex and may require additional tools or libraries to measure accurately
        // For simplicity, we can just print out the size of the stacks after pushing a large number of elements
        System.out.println("ArrayStack size after pushing 100000 elements: " + arrayStack.getCapacity());
        System.out.println("LinkedListStack size after pushing 100000 elements: " + linkedListStack.size());        
        // You can also test edge cases, such as popping from an empty stack or pushing onto a full stack (for ArrayStack)
        try {
            arrayStack.pop(); // pop from empty stack
        } catch (RuntimeException e) {
            System.out.println("ArrayStack: " + e.getMessage());
        }   
        try {
            linkedListStack.pop(); // pop from empty stack
        } catch (RuntimeException e) {
            System.out.println("LinkedListStack: " + e.getMessage());
        }   
        try {
            for (int i = 0; i < 100000; i++) {
                arrayStack.push(i); // push onto full stack
            }
        } catch (RuntimeException e) {
            System.out.println("ArrayStack: " + e.getMessage());
        }   
        // Note: LinkedListStack does not have a capacity limit, so we won't test pushing onto a full stack for it
        // You can also test the peek method for both stacks to ensure it returns the correct top element without modifying the stack
        arrayStack.push(10);
        System.out.println("ArrayStack top element: " + arrayStack.peek());
        linkedListStack.push(10);
        System.out.println("LinkedListStack top element: " + linkedListStack.peek());   
    }
}