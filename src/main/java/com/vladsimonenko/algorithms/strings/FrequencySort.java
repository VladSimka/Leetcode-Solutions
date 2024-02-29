package com.vladsimonenko.algorithms.strings;

import java.util.*;


public class FrequencySort {

    public static void main(String[] args) {
        System.out.println(new FrequencySort().frequencySort("Aabb"));
    }
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            list.add(c);
        }


        Comparator<Character> comparator = (c1,c2)->map.get(c2)-map.get(c1);
        list.sort(comparator);
        return String.join("", list.stream().map(String::valueOf).toArray(String[]::new));
    }
}
