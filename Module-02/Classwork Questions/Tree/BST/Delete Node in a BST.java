Problem Link: https://leetcode.com/problems/delete-node-in-a-bst/description/


class Solution {
    public int minInRightSide(TreeNode root) {
        if (root.left == null) {
            return root.val;
        } 

        return minInRightSide(root.left);
    }

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else {
            // when key is a leaf node
            if (root.left == null && root.right == null) {
                return null;
            } 
            // Single child
            else if (root.left != null && root.right == null) {
                return root.left;
            } else if (root.left == null && root.right != null) {
                return root.right;
            }
            // Two child 
            else {
                int minNodeVal = minInRightSide(root.right);
                root.val = minNodeVal;
                root.right = deleteNode(root.right, minNodeVal);

            }
        }

        return root;
    }
}
