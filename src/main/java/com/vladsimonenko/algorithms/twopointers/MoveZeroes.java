package com.vladsimonenko.algorithms.twopointers;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[k++] = nums[i];
                if (i != (k - 1)) {
                    nums[i] = 0;
                }
            }
        }
    }
}
