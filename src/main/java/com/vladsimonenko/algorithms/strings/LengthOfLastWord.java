package com.vladsimonenko.algorithms.strings;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(new LengthOfLastWord().lengthOfLastWord("heel  world   "));
    }

    public int lengthOfLastWord(String s) {
        int length = 0;

        int counter = s.length() - 1;
        while (counter >= 0 && !Character.isAlphabetic(s.charAt(counter))) {
            counter--;
        }

        while (counter >= 0 && Character.isAlphabetic(s.charAt(counter))) {
            counter--;
            length++;
        }


        return length;
    }
}
