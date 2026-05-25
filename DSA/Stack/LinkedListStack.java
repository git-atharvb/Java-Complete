package Stack;
public class LinkedListStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
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