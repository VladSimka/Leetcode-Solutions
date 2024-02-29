package com.vladsimonenko.algorithms.hashtable;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] alphabet = new int['z' - 'a' + 1];
        for (char c : s.toCharArray()) {
            alphabet[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            alphabet[c - 'a']--;
        }
        for (int j : alphabet) {
            if (j != 0) return false;
        }
        return true;
    }
}
