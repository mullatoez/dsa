package com.dsa.dsa.ds.trees.binarysearchtree;

public class IterateBST {
    boolean iterateBinaryST(TreeNode root, int key){
        if (root == null){
            System.out.println("Tree is empty");
            return false;
        }

        while (root != null){
            if (key > root.val){
                root = root.right;
            } else if (key < root.val) {
                root = root.left;
            }else {
                //key is found
                return true;
            }
        }
        return false;
    }
}
