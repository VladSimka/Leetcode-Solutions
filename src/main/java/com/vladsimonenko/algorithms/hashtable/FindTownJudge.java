package com.vladsimonenko.algorithms.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTownJudge {

    public static void main(String[] args) {
        System.out.println(new FindTownJudge().findJudge(
                3,
                new int[][]{{1, 3}, {2, 3},{3,1}}
        ));
    }

    public int findJudge(int n, int[][] trust) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (var arr : trust) {
            if (!map.containsKey(arr[1])) {
                map.put(arr[1], new ArrayList<>());
            }
            map.get(arr[1]).add(arr[0]);
        }

        List<Integer> candidates = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (map.containsKey(i)) {
                if (map.get(i).size() == n - 1) {
                    candidates.add(i);
                }
            }
        }

        if (candidates.size() != 1) {
            return -1;
        }


        int candidate = candidates.get(0);


        for (int i = 1; i <= n; i++) {
            if (map.containsKey(i)) {
                if (map.get(i).contains(candidate)) {
                    return -1;
                }
            }
        }
        return candidate;
    }
}
