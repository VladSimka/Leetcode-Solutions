package com.vladsimonenko.algorithms.strings;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MakeTheStringGreat {

    public static void main(String[] args) {
        System.out.println(new MakeTheStringGreat().makeGood2(
                "leEeetcode"
        ));
    }

    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < sb.length() - 1; i++) {
            char before = sb.charAt(i);
            char after = sb.charAt(i + 1);

            if ((Character.toUpperCase(after) == Character.toUpperCase(before)) &&
                ((Character.isLowerCase(before) && Character.isUpperCase(after)) ||
                 (Character.isLowerCase(after) && Character.isUpperCase(before)))) {
                sb.delete(i, i + 2);
                i = -1;
            }
        }

        return sb.toString();
    }

    public String makeGood2(String s) {
        Deque<Character> stack = new ArrayDeque<>();


        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && Math.abs(stack.peek() - s.charAt(i)) == 32) {
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }


        StringBuilder sb = new StringBuilder();

        while (!stack.isEmpty()) {
            sb.insert(0,stack.pop());
        }

        return sb.toString();
    }
}
