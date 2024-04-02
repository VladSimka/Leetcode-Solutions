package com.vladsimonenko.algorithms.strings;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        System.out.println(new IsomorphicStrings().isIsomorphic("badc", "baba"));
    }

    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))) {
                if (map.containsValue(t.charAt(i))) return false;
                map.put(s.charAt(i), t.charAt(i));
            } else {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }
        }

        return true;
    }
}
