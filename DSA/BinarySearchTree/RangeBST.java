package BinarySearchTree;
public class RangeBST {
    static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void printInRange(Node root, int low, int high) {
        if (root == null) {
            return;
        }
        if (root.data >= low && root.data <= high) {
            System.out.print(root.data + " ");
        }
        if (root.data > low) {
            printInRange(root.left, low, high);
        }
        if (root.data < high) {
            printInRange(root.right, low, high);
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        int low = 4;
        int high = 12;
        System.out.println("Elements in the range [" + low + ", " + high + "]:");
        printInRange(root, low, high);
    }
}