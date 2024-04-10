package com.vladsimonenko.algorithms.arrays;

import java.util.Arrays;

public class SortArrayByParity {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SortArrayByParity().sortArrayByParity(
                new int[]{0, 12, 14, 2, 4, 6, 1, 3, 5, 77}
        )));
    }

    public int[] sortArrayByParity(int[] nums) {
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                while (k < nums.length && nums[k] % 2 == 0) {
                    k++;
                }
                if (k > i) continue;
                int tmp = nums[i];
                nums[i] = nums[k];
                nums[k] = tmp;
            }
        }


        return nums;
    }
}
