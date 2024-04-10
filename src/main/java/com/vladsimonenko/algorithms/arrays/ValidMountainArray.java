package com.vladsimonenko.algorithms.arrays;

public class ValidMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 3, 2, 1};

        System.out.println(new ValidMountainArray().validMountainArray(arr));
    }

    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;
        int start = 0;
        int end = arr.length - 1;

        while (start < arr.length && arr[start] < arr[start + 1]) {
            start++;
        }

        while (end > 0 && arr[end] < arr[end - 1]) {
            end--;
        }

        return end!=arr.length-1 &&end == start;
    }
}
