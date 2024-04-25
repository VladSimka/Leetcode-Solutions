package com.vladsimonenko.algorithms.dp;

public class NthTribonacciNumber {
    public static void main(String[] args) {
        System.out.println(new NthTribonacciNumber().tribonacci(4));
    }
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;

        int first = 0;
        int second = 1;
        int third = 1;

        for (int i = 0; i < n-2; i++) {
            int tmp = first + second + third;
            first = second;
            second = third;
            third = tmp;
        }

        return third;
    }
}
