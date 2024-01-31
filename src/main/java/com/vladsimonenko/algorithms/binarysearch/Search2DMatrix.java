package com.vladsimonenko.algorithms.binarysearch;

public class Search2DMatrix {

    public static void main(String[] args) {
        System.out.println(new Search2DMatrix().searchMatrix(
                new int[][]{
                        {1, 3, 5, 7},
                        {10, 11, 16, 20},
                        {23, 30, 34, 60}
                }, 3
        ));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        int start = 0;
        int end = m * n - 1;


        while (start <= end) {
            int mid = start + (end - start) / 2;
            int i = mid / n;
            int j = mid % n;

            if (matrix[i][j] == target) {
                return true;
            } else if (matrix[i][j] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }


        return false;
    }
}
