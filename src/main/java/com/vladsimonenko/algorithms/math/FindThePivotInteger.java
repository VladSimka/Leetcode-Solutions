package com.vladsimonenko.algorithms.math;

public class FindThePivotInteger {

    public static void main(String[] args) {
        System.out.println(new FindThePivotInteger().pivotInteger(8));
    }

    public int pivotInteger(int n) {
        if (n == 1) return 1;
        int fullSum = ((1 + n) * n) / 2;
        int leftSum = 0;

        for (int i = 1; i < n; i++) {
            leftSum += i;
            if (leftSum == (fullSum - leftSum + i)) {
                return i;
            }
        }

        return -1;
    }

    public int pivotIntegerSecondSolution(int n) {
        double x = Math.sqrt((n * (n + 1)) / 2);
        return x % 1 == 0 ? (int) x : -1;
    }
}
