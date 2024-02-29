package com.vladsimonenko.algorithms.arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int end = digits.length - 1;

        while (digits[end] == 9) {
            digits[end] = 0;
            end--;
            if (end < 0) {
                int[] res = new int[digits.length + 1];
                res[0] = 1;
                return res;
            }
        }

        digits[end]++;
        return digits;
    }
}
