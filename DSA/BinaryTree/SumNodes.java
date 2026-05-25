package BinaryTree;
public class SumNodes {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) {
            val = x;
            left = right = null;
        }
    }
    public static int sumNodes(TreeNode node) {
        if (node == null) return 0;
        return node.val + sumNodes(node.left) + sumNodes(node.right);
    }
    public static void main(String[] args) {
        // Creating a simple binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        int totalSum = sumNodes(root);
        System.out.println("Sum of all nodes in the binary tree: " + totalSum); // Output should be: 15
    }
}