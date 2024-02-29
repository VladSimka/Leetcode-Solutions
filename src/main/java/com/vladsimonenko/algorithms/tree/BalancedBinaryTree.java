package com.vladsimonenko.algorithms.tree;

public class BalancedBinaryTree {

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return Math.abs(depthOfTree(root.left) - depthOfTree(root.right)) <= 1 &&
                isBalanced(root.left) && isBalanced(root.right);
    }

    public int depthOfTree(TreeNode node) {
        if (node == null) return 1;


        return Math.max(depthOfTree(node.left), depthOfTree(node.right)) + 1;
    }
}
