package com.vladsimonenko.algorithms.tree;

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;

        int currentLeftVal = 0;
        if (root.left!=null && root.left.left == null && root.left.right == null) {
            currentLeftVal += root.left.val;
        }

        return currentLeftVal + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }
}
