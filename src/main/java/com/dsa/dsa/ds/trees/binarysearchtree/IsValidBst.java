package com.dsa.dsa.ds.trees.binarysearchtree;

public class IsValidBst {
    public boolean isValidBST(TreeNode root) {
        // Empty trees are valid BSTs
        if (root == null) {
            return true;
        }
        //Get min and max values possible
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        // The current value must be between min and max
        if (root.val < min || root.val >= max) {
            return false;
        }

        if (root.left.val < root.right.val) {
            return true;
        }
        return false;
    }
}
