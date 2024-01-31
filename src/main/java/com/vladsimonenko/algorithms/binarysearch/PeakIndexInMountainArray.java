package com.vladsimonenko.algorithms.binarysearch;

public class PeakIndexInMountainArray {


    public static void main(String[] args) {
        System.out.println(new PeakIndexInMountainArray().peakIndexInMountainArray(
                new int[]{3, 5, 3, 2, 0}
        ));
    }

    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }
}
