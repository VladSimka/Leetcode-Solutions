package com.vladsimonenko.algorithms.twopointers;

import java.util.Arrays;

public class IntersectionTwoArrays {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new IntersectionTwoArrays().intersection(
                new int[]{1, 2, 2, 1},
                new int[]{2, 2}
        )));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        int[] map = new int[1001];

        int counter = 0;
        for (int i : nums1) {
            map[i] = 1;
        }

        for (int i : nums2) {
            if (map[i] == 1) {
                map[i] = 2;
                counter++;
            }
        }

        int[] result = new int[counter];
        counter = 0;


        for (int i : nums2) {
            if (map[i] == 2) {
                map[i] = 1;
                result[counter++] = i;
            }
        }

        return result;
    }

}
