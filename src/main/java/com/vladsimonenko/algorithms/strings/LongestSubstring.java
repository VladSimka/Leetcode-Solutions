package com.vladsimonenko.algorithms.strings;

public class LongestSubstring {

    public static void main(String[] args) {
        String[] strs = {"cir", "car", "chhhh"};
        System.out.println(new LongestSubstring().longestCommonPrefix(strs));
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        out:
        for (int i = 0; i < strs[0].length(); i++) {

            char current = strs[0].charAt(i);
            boolean add = true;
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].length() < i + 1 || strs[j].charAt(i) != current) {

                    break out;
                }
            }
             sb.append(current);

        }

        return sb.toString();
    }
}
