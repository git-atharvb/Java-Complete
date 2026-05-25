package BinaryTree;
public class Subtree {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) {
            val = x;
            left = right = null;
        }
    }
    public static boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) return false;
        if (isSameTree(s, t)) return true;
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
    private static boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        if (s.val != t.val) return false;
        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }
    public static void main(String[] args) {
        // Creating the main tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        // Creating the subtree
        TreeNode subtreeRoot = new TreeNode(2);
        subtreeRoot.left = new TreeNode(4);
        subtreeRoot.right = new TreeNode(5);
        boolean result = isSubtree(root, subtreeRoot);
        System.out.println("Is the second tree a subtree of the first tree? " + result); // Output should be: true
    }
}