package com.vladsimonenko.algorithms.math;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(new HappyNumber().isHappy(19));
    }

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (n != 1) {
            int newNum = 0;
            while (n != 0) {
                newNum += (n % 10) * (n % 10);
                n /= 10;
            }

            if (!set.add(newNum)) return false;
            n = newNum;
        }

        return true;
    }
}
