package Stack;
public class ReverseStack {
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.size() == 0) {
            return;
        }
        int top = stack.pop();
        reverseStack(stack);
        pushAtBottom(stack, top);
    }
    public static void pushAtBottom(Stack<Integer> stack, int x) {
        if (stack.size() == 0) {
            stack.push(x);
            return;
        }
        int top = stack.pop();
        pushAtBottom(stack, x);
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack before reversing: " + stack);
        reverseStack(stack);
        System.out.println("Stack after reversing: " + stack);
    }
}