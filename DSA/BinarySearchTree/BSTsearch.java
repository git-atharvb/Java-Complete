package BinarySearchTree;
class Node {
    int data;
    Node left, right;
    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class BSTsearch {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(3);
        root.left.right = new Node(7);
        int target = 7;
        boolean found = search(root, target);
        if (found) {
            System.out.println("Element found in the BST.");
        } else {
            System.out.println("Element not found in the BST.");
        }
    }
    public static boolean search(Node node, int target) {
        if (node == null) {
            return false;
        }
        if (node.data == target) {
            return true;
        }
        if (target < node.data) {
            return search(node.left, target);
        } else {
            return search(node.right, target);
        }
    }
}