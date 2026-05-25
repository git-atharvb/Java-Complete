package BinarySearchTree;
public class RootToLeafPath {
    static class Node {
        int data;
        Node left, right;
        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void printRootToLeafPaths(Node root, String path) {
        if (root == null) {
            return;
        }
        path += root.data + " ";
        if (root.left == null && root.right == null) {
            System.out.println(path);
            return;
        }
        printRootToLeafPaths(root.left, path);
        printRootToLeafPaths(root.right, path);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("Root to leaf paths:");
        printRootToLeafPaths(root, "");
    }
}