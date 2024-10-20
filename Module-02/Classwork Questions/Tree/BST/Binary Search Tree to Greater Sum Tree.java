class Solution {
    int sum = 0;
    public void helper(TreeNode root) {
        if (root == null) return;

        helper(root.right);
        sum += root.val;
        root.val = sum;
        helper(root.left);
    }

    public TreeNode bstToGst(TreeNode root) {
        sum = 0;
        helper(root);
        return root;
    }
}
