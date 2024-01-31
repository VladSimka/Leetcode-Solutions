package com.vladsimonenko.algorithms.binarysearch;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElement {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new FindFirstAndLastPositionOfElement().searchRange(
                new int[]{1}, 1
        )));
    }

    public int[] searchRange(int[] nums, int target) {
        int firstPos = -1;
        int lastPos = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                firstPos = mid;
                end = mid - 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        start = 0;
        end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                lastPos = mid;
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return new int[]{firstPos, lastPos};
    }
}
