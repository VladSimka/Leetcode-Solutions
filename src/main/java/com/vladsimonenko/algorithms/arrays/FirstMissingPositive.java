package com.vladsimonenko.algorithms.arrays;

public class FirstMissingPositive {

    public static void main(String[] args) {
        System.out.println(new FirstMissingPositive().firstMissingPositive(
                new int[]{3, 4, -1, 1}
        ));
    }

    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while ((nums[i] > 0 && nums[i] <= nums.length) && (i + 1 != nums[i])) {
                swap(nums, i, nums[i] - 1);
            }
        }


        int missing = nums.length + 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != i + 1) {
                return i + 1;
            }

        }
        return missing;
    }

    public void swap(int[] nums, int i, int j) {
        nums[i] += nums[j];
        nums[j] = nums[i] - nums[j];
        nums[i] = nums[i] - nums[j];
    }
}
