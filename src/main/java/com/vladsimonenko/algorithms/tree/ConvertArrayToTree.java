package com.vladsimonenko.algorithms.tree;

public class ConvertArrayToTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTRecursive(nums, 0, nums.length - 1);
    }

    public TreeNode sortedArrayToBSTRecursive(int[] nums, int begin, int end) {
        if (begin > end) return null;
        if (begin == end) return new TreeNode(nums[end]);
        int mid = (begin + end) / 2;

        TreeNode left = sortedArrayToBSTRecursive(nums, begin, mid - 1);
        TreeNode right = sortedArrayToBSTRecursive(nums, mid + 1, end);
        return new TreeNode(nums[mid], left, right);
    }
}
