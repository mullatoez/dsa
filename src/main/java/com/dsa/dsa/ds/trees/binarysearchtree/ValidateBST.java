package com.dsa.dsa.ds.trees.binarysearchtree;

import java.util.ArrayList;

public class ValidateBST {
    private TreeNode root;

    private static boolean isValidBST(TreeNode root) {
        return isValidBST(root, null,null);
    }

    public static boolean isValidBST(TreeNode root, Integer max, Integer min) {

        // an empty binary trees is a valid BST.
        if (root == null)
            return true;

        if (max != null && root.val >= max)
            return false;

        if (min != null && root.val <= min )
            return false;

        return isValidBST(root.left, root.val, min) &&
                isValidBST(root.right, max, root.val);
    }
}
