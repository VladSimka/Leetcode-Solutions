package com.vladsimonenko.algorithms.arrays;

import java.util.Arrays;

public class ReplaceElementsWithGreatestElementOnRightSide {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ReplaceElementsWithGreatestElementOnRightSide()
                .replaceElements(new int[]{17, 18, 5, 4, 6, 1})));
    }

    public int[] replaceElements(int[] arr) {
        int highRight = arr[arr.length - 1];
        arr[arr.length - 1] = -1;

        for (int i = arr.length - 2; i >= 0; i--) {
            int tmp = arr[i];
            arr[i] = highRight;
            highRight = Math.max(highRight, tmp);
        }

        return arr;
    }
}
