package com.vladsimonenko.algorithms.math;

public class Power {
    public static void main(String[] args) {
        System.out.println(new Power().myPow(1024, -2));
    }

    public double myPow(double x, int n) {
        if (n == 1) return x;
        if (n == 0) return 1;
        int a = Math.abs(n);
        double res;
        if (a % 2 == 0) {
            res = myPow(x * x, a / 2);
        } else {
            res = myPow(x * x, a / 2) * x;
        }
        return n > 0 ? res : 1 / res;
    }
}
