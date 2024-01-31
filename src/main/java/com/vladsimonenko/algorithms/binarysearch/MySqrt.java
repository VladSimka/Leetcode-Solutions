package com.vladsimonenko.algorithms.binarysearch;

public class MySqrt {

    public static void main(String[] args) {
        System.out.println(new MySqrt().mySqrt(1));
    }

    /**
     * Given a non-negative integer x, return the square root of x rounded down to the nearest integer.
     * The returned integer should be non-negative as well.
     */
    public int mySqrt(int x) {
        long low = 0;
        long high = x;
        long result = 0;

        while (low <= high) {
            result = low + (high - low) / 2;

            if (result * result == x) return (int) result;

            if (result * result > x) {
                high = result - 1;
            } else {
                low = result + 1;
                if ((result + 1) * (result + 1) > x) {
                    return (int) result;
                }
            }
        }

        return (int) result;
    }
}
