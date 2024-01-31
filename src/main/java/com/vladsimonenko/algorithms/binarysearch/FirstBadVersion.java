package com.vladsimonenko.algorithms.binarysearch;


import com.vladsimonenko.algorithms.exception.NotImplementedException;

public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(new FirstBadVersion().firstBadVersion(5));
    }

    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int bad;

        while (true) {
            bad = low + (high - low) / 2;
            if (!isBadVersion(bad)) {
                low = bad + 1;
            } else {
                if (bad == 1) return 1;
                if (isBadVersion(bad - 1)) {
                    high = bad - 1;
                } else {
                    return bad;
                }
            }
        }
    }


    private boolean isBadVersion(int n) {
        throw new NotImplementedException();
    }
}
