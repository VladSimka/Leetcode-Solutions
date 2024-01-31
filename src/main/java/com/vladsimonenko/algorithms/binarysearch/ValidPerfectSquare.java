package com.vladsimonenko.algorithms.binarysearch;

public class ValidPerfectSquare {

    public static void main(String[] args) {
        System.out.println(new ValidPerfectSquare().isPerfectSquare(2147483647));
    }

    public boolean isPerfectSquare(int num) {
        int low = 1;
        int high = num - 1;
        long candidate;

        while (true) {
            candidate = low + (high - low) / 2;

            if (candidate * candidate < num) {
                low = (int) (candidate + 1);
            } else if (candidate * candidate > num) {
                high = (int) (candidate - 1);
                if ((candidate - 1) * (candidate - 1) < num) {
                    break;
                }
            } else {
                return true;
            }
        }

        return false;
    }


}
