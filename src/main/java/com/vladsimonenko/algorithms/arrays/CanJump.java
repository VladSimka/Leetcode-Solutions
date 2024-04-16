package com.vladsimonenko.algorithms.arrays;

public class CanJump {

    public static void main(String[] args) {
        var arr = new int[]{3, 2, 1, 0, 4};
        System.out.println(new CanJump().canJump(
                arr
        ));
    }

    public boolean canJump(int[] nums) {
        int canAccess = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i > canAccess) return false;

            canAccess = Math.max(canAccess, i + nums[i]);
        }

        return true;
    }
}
