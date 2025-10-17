/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return helper(root.left, root.right);
    }

    public boolean helper(TreeNode left, TreeNode right) {
        boolean check = true;

        if (left == null || right == null) {
            return left == null && right == null;
        }

        if (left.val == right.val) {
            if (left.left != null && right.right != null) {
                check = helper(left.left, right.right);
            } else if (left.left != null || right.right != null) {
                return false;
            }

            if (!check) {
                return check;
            }

            if (left.right != null && right.left != null) {
                check = helper(left.right, right.left);
            } else if (left.right != null || right.left != null) {
                return false;
            }

        } else {
            check = false;
        }

        return check;
    }
}
