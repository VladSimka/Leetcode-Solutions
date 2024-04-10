package com.vladsimonenko.algorithms.arrays;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        System.out.println(new ThirdMaximumNumber().thirdMax(
                new int[]{1, 1, 2, 4, 5, 6, 8, 8, 34, 9}
        ));
    }

    public int thirdMax(int[] nums) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int current : nums) {
            if (current > first) {
                third = second;
                second = first;
                first = current;
            } else if (current > second && current < first) {
                third = second;
                second = current;
            } else if (current > third && current < second) {
                third = current;
            }
        }
        if (second == third || nums.length < 3) return first;
        return third == Integer.MIN_VALUE ? second : third;
    }
}
