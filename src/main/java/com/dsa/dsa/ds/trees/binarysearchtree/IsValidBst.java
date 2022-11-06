package com.dsa.dsa.ds.trees.binarysearchtree;

public class IsValidBst {
    public boolean isValidBST(TreeNode root) {
        if (root.left.val <= root.right.val){
            return true;
        }
        return false;
    }
}
