package com.vladsimonenko.algorithms.binarysearch;

public class SearchInsert {
    public static void main(String[] args) {
        System.out.println(new SearchInsert().searchInsert(new int[]{1, 3, 4, 6}, 2));
    }

    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while (low <= high) {
            mid = low + (high - low) / 2;

            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;

                if (mid > 0 && nums[mid - 1] < target) {
                    return mid;
                }
            } else {
                return mid;
            }
        }

        return target < nums[0] ? mid : mid + 1;
    }
}
