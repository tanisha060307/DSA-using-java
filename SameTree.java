public class SameTree {

    // Create a node
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Check whether two trees are the same
    static boolean isSameTree(TreeNode p, TreeNode q) {

        // Both nodes are empty
        if (p == null && q == null) {
            return true;
        }

        // One node is empty, but the other is not
        if (p == null || q == null) {
            return false;
        }

        // Values are different
        if (p.val != q.val) {
            return false;
        }

        // Check left AND right subtrees
        return isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {

        // -------- TREE 1 --------
        TreeNode p = new TreeNode(1);

        p.left = new TreeNode(2);
        p.right = new TreeNode(3);


        // -------- TREE 2 --------
        TreeNode q = new TreeNode(1);

        q.left = new TreeNode(2);
        q.right = new TreeNode(3);


        // Check whether both trees are same
        boolean result = isSameTree(p, q);

        System.out.println("Are the two trees the same? " + result);
    }
}