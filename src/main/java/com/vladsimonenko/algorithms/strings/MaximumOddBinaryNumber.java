package com.vladsimonenko.algorithms.strings;

public class MaximumOddBinaryNumber {
    public String maximumOddBinaryNumber(String s) {
        int countZeroes = 0;
        int countOnes = -1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                countZeroes++;
            } else {
                countOnes++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < countOnes; i++) {
            sb.append('1');
        }
        for (int i = 0; i < countZeroes; i++) {
            sb.append('0');
        }
        sb.append('1');

        return sb.toString();
    }
}
