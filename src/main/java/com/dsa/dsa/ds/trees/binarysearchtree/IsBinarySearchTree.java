package com.dsa.dsa.ds.trees.binarysearchtree;

public class IsBinarySearchTree {
    boolean isBST(TreeNode root, TreeNode left, TreeNode right){
        if (root == null){
            return true;
        }

        if (left != null && root.val <= left.val){
            return false;
        }

        if (right != null && root.val >= right.val){
            return false;
        }

        return isBST(root.left, left, root) && isBST(root.right,root,right);
    }

    boolean iterateBinaryST(TreeNode treeNode, int key){
        if (treeNode == null){
            System.out.println("Tree is empty");
            return false;
        }

        while (treeNode != null){
            if (key > treeNode.val){
                treeNode = treeNode.right;
            } else if (key < treeNode.val) {
                treeNode = treeNode.left;
            }else {
                //key is found
                System.out.println(treeNode.val);
                return true;
            }
        }
        return false;
    }

    TreeNode insert(TreeNode treeNode, int data){
        if (treeNode == null){ //create a new node
            return new TreeNode(data);
        }

        //Otherwise recur down the tree
        if (data > treeNode.val){
            //move right
            treeNode.right = insert(treeNode.right,data);
        }

        if (data < treeNode.val){
            treeNode.left = insert(treeNode.left,data);
        }

        return treeNode;
    }

    void findFullNode(TreeNode treeNode){
        if (treeNode == null){
            System.out.println("Empty tree");
        }else {
            findFullNode(treeNode.left);//left side has to come first
            if (treeNode.left != null && treeNode.right != null){
                System.out.println(treeNode.val+ " ");
            }
            findFullNode(treeNode.right);//right side comes second to make it a sorted tree
        }
    }
}
