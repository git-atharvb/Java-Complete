package Stack;
public class StackConditions {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        try {
            stack.pop();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        try {
            stack.push(6);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}