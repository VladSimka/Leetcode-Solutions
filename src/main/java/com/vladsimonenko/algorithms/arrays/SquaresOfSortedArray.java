package com.vladsimonenko.algorithms.arrays;

public class SquaresOfSortedArray {

    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];

        for (int i = nums.length - 1; i >= 0; i--) {
            int leftElement = nums[left];
            int rightElement = nums[right];

            if (Math.abs(leftElement) > Math.abs(rightElement)) {
                result[i] = leftElement * leftElement;
                left++;
            } else {
                result[i] = rightElement * rightElement;
                right--;
            }
        }

        return result;
    }
}
