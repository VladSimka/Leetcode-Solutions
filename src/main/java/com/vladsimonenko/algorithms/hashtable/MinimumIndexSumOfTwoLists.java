package com.vladsimonenko.algorithms.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumOfTwoLists {

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> result = new ArrayList<>();

        int minIndex = Integer.MAX_VALUE;

        for (int i = 0; i < list2.length && i <= minIndex; i++) {
            if (!map.containsKey(list2[i])) {
                continue;
            }

            int sum = map.get(list2[i]) + i;

            if (sum < minIndex) {
                minIndex = i;
                result.clear();
                result.add(list2[i]);
            }else if(sum==minIndex){
                result.add(list2[i]);
            }



        }

        return result.toArray(new String[0]);
    }
}
