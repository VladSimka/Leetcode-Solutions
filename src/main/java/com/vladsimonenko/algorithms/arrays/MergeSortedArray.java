package com.vladsimonenko.algorithms.arrays;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        new MergeSortedArray().merge(nums1,3,nums2,3);

        System.out.println(Arrays.toString(nums1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int common = n + m - 1;
        int first = m - 1;
        int second = n - 1;

        while (common > 0) {
            if (first >= 0 && second >= 0) {
                if (nums1[first] > nums2[second]) {
                    nums1[common--] = nums1[first--];
                } else {
                    nums1[common--] = nums2[second--];
                }
            }else if(second>=0){
                nums1[common--] = nums2[second--];
            }else {
                nums1[common--] = nums1[first--];
            }
        }
    }
}
