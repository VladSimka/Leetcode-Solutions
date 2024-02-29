package com.vladsimonenko.algorithms.twopointers;

import java.util.Arrays;

public class TwoSumTwo {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new TwoSumTwo().twoSum(
                new int[]{2, 7, 11, 15},
                18
        )));
    }

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[2];
    }
}
