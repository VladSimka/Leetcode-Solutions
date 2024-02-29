package com.vladsimonenko.algorithms.strings;

public class AddBinary {

    public static void main(String[] args) {
        System.out.println(new AddBinary().addBinary("1111", "1111"));
    }

    public String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int remainder = 0;
        while (i >= 0 || j >= 0) {
            int sum = remainder;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            if (sum > 1) {
                sum = sum % 2;
                remainder = 1;
            } else {
                remainder = 0;
            }
            builder.insert(0, sum);
        }
        if (remainder != 0) {
            builder.insert(0, remainder);
        }
        return builder.toString();
    }
}
