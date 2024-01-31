package com.vladsimonenko.algorithms.sort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {1, 56, 2312, 5, 43, 22, 8, 454};
        mergeSort(arr);

        System.out.println(Arrays.toString(arr));

    }


    public static void mergeSort(int[] arr) {
        mergeSortRec(arr, 0, arr.length - 1);
    }

    private static void mergeSortRec(int[] arr, int start, int end) {
        if (start < end) {
            int mid = (end + start) / 2;

            mergeSortRec(arr, start, mid);
            mergeSortRec(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] leftArr = new int[mid - start + 1];
        int[] rightArr = new int[end - mid];

        for (int i = start; i < mid + 1; i++) {
            leftArr[i - start] = arr[i];
        }

        for (int i = mid + 1; i <= end; i++) {
            rightArr[i - mid - 1] = arr[i];
        }

        int i = 0;
        int j = 0;

        while (i < leftArr.length || j < rightArr.length) {
            if (i == leftArr.length || (j != rightArr.length && leftArr[i] > rightArr[j])) {
                arr[start + i + j] = rightArr[j++];
            } else {
                arr[start + i + j] = leftArr[i++];
            }
        }

    }
}
