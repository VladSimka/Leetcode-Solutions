package com.vladsimonenko.algorithms.hashtable;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateTwo {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int digit = nums[i];
            if (!map.containsKey(digit)) {
                map.put(digit, i);
            } else {
                if (i - map.get(digit) <= k) {
                    return true;
                }
                map.put(digit, i);
            }
        }

        return false;
    }
}
