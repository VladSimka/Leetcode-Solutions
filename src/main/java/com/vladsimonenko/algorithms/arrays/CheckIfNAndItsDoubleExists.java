package com.vladsimonenko.algorithms.arrays;

import java.util.HashSet;
import java.util.Set;

public class CheckIfNAndItsDoubleExists {
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int j : arr) {
            if (set.contains(j * 2)) return true;
            if (j % 2 == 0 && set.contains(j / 2)) return true;

            set.add(j);
        }

        return false;
    }
}
