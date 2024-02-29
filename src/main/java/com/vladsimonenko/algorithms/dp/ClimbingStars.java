package com.vladsimonenko.algorithms.dp;

public class ClimbingStars {
    public static void main(String[] args) {
        System.out.println(new ClimbingStars().climbStairs(4));
    }


    public int climbStairs(int n) {
        if (n == 1) return 1;
        int first = 1;
        int second = 2;
        int result = 0;
        for (int i = 2; i < n; i++) {
            result = first + second;
            first = second;
            second = result;
        }

        return result;
    }
}
