package BinaryTree;
public class Postordertree {
    public static void postorder(TreeNode node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val + " ");
    }
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) {
            val = x;
            left = right = null;
        }
    }
    public static void main(String[] args) {
        // Creating a simple binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println("Postorder Traversal of the binary tree:");
        postorder(root); // Output should be: 4 5 2 3 1
    }
}
