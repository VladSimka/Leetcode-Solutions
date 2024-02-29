package com.vladsimonenko.algorithms.strings;

public class FirstOccurrence {
    public static void main(String[] args) {
        System.out.println(new FirstOccurrence().strStr("a", "a"));
    }

    public int strStr(String haystack, String needle) {

        OUT:
        for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
            int left = i;
            int right = left + needle.length();
            for (int j = left; j < right; j++) {
                if (haystack.charAt(j) != needle.charAt(j - left)) {
                    continue OUT;
                }
            }
            return i;
        }

        return -1;
    }
}
