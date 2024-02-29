package com.vladsimonenko.algorithms.twopointers;

public class MergeSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int common = m + n - 1;
        int left = m - 1;
        int right = n - 1;

        while (left >= 0 || right >= 0) {
            if ((left < 0) || (right >= 0 && nums1[left] < nums2[right])) {
                nums1[common--] = nums2[right--];
            } else {
                nums1[common--] = nums1[left--];
            }
        }

    }
}
