package com.vladsimonenko.algorithms.arrays;

public class MajorityElement {

    public static void main(String[] args) {
        System.out.println(new MajorityElement().majorityElement(new int[]{10, 9, 9, 9, 10}));
    }

    public int majorityElement(int[] nums) {
        int counter = 1;
        int majority = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == majority) {
                counter++;
            } else {
                counter--;
                if (counter < 0) {
                    majority = nums[i];
                    counter = 0;
                }

            }
        }

        return majority;
    }
}
