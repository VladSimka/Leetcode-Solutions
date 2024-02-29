package com.vladsimonenko.algorithms.twopointers;

public class RemoveDuplicatesFromSortedArray {


    public int removeDuplicates(int[] nums) {
        int pointer = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[pointer]) {
                nums[++pointer] = nums[i];
            }
        }

        return ++pointer;
    }
}
