package com.vladsimonenko.algorithms.strings;

public class FindFirstPalindromic {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello" + " World";
        String s3 = "Hello World";
        System.out.println(s3 == s2);
    }

    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) return word;
        }

        return "";
    }

    public boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left <= right) {
            if (word.charAt(left) != word.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }
}
