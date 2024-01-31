package com.vladsimonenko.algorithms.prefixsum;

import java.util.Arrays;

public class RunningSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new RunningSum().runningSum(new int[]{3,1,2,10,1})));
    }
    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}
