package BinaryTree;
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int x) {
        val = x;
        left = right = null;
    }
}
public class SimpleBinaryTree {
    public static void main(String[] args) {
        // Creating a simple binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        // Printing the binary tree
        System.out.println("Root: " + root.val);
        System.out.println("Left Child of Root: " + root.left.val);
        System.out.println("Right Child of Root: " + root.right.val);
        System.out.println("Left Child of Left Child: " + root.left.left.val);
        System.out.println("Right Child of Left Child: " + root.left.right.val);
        // The tree structure is:
        //         1    
        //       /   \
        //      2     3
        //     / \
        //    4   5
    }
}