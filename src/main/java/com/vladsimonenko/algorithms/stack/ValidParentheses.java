package com.vladsimonenko.algorithms.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("]"));
    }

    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(', '{', '[' -> stack.addLast(c);

                case ')', '}', ']' -> {
                    if (stack.isEmpty() ||
                            (c == ')' && stack.getLast() != '(') ||
                            (c == ']' && stack.getLast() != '[') ||
                            (c == '}' && stack.getLast() != '{')
                    ) {
                        return false;
                    } else {
                        stack.pollLast();
                    }
                }
            }

        }

        return stack.isEmpty();

    }
}
