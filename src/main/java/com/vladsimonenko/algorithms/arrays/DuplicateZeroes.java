package com.vladsimonenko.algorithms.arrays;

import java.util.Arrays;

public class DuplicateZeroes {
    public static void main(String[] args) {
        var arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};

        new DuplicateZeroes().duplicateZeros(arr);

        System.out.println(Arrays.toString(arr));
    }

    public void duplicateZeros(int[] arr) {
        int numberOfZeroes = 0;
        for (int i : arr) {
            if (i == 0) {
                numberOfZeroes++;
            }
        }

        for (int j = arr.length - 1; j >= 0; j--) {
            int number = arr[j];
            if (number == 0) {
                if (j + numberOfZeroes < arr.length) {
                    arr[j + numberOfZeroes] = 0;
                }
                if (j + numberOfZeroes - 1 < arr.length) {
                    arr[j + numberOfZeroes - 1] = 0;
                }
                numberOfZeroes--;
            } else {
                if (j + numberOfZeroes < arr.length) {
                    arr[j + numberOfZeroes] = number;
                }
            }
        }


    }
}
