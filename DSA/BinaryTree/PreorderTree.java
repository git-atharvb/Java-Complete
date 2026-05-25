package BinaryTree;

public class PreorderTree {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) {
            val = x;
            left = right = null;
        }
    }

    public static void preorder(TreeNode node) {
        if (node == null) return;
        System.out.print(node.val + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void main(String[] args) {
        // Creating a simple binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Preorder Traversal of the binary tree:");
        preorder(root); // Output should be: 1 2 4 5 3
    }
}
