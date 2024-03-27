package com.vladsimonenko.algorithms.arrays;

import java.util.Arrays;

public class ProductOfArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
                new ProductOfArray().productExceptSelf(
                        new int[]{-1, 1, 0, -3, 3}
                )
        ));
    }

    public int[] productExceptSelf(int[] nums) {
        long productExceptZeroes = 1;
        int countOfZeroes = 0;

        for (int i : nums) {
            if (i != 0) {
                productExceptZeroes *= i;
            } else {
                countOfZeroes++;
            }
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < result.length; i++) {

            if (nums[i] == 0) {
                result[i] = countOfZeroes > 1 ? 0 : (int) productExceptZeroes;
            } else {
                result[i] = countOfZeroes > 0 ? 0 : (int) (productExceptZeroes / nums[i]);
            }
        }
        return result;

    }
}
