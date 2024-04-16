package com.vladsimonenko.algorithms.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class RemoveKDigits {

    public static void main(String[] args) {
        String string = "12345456";
        int k = 3;

        System.out.println(new RemoveKDigits().removeKdigits(string, k));
    }

    public String removeKdigits(String num, int k) {
        if (num.length() == k) return "0";
        Deque<Character> stack = new ArrayDeque<>();

        int i = 0;

        while (i < num.length()) {

            while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.insert(0, stack.pop());
        }

        int j = 0;

        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }


        return sb.toString();
    }

}