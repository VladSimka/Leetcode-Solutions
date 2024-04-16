package com.vladsimonenko.algorithms.queue;

import java.util.*;

public class RevealCardsInIncreasingOrder {

    public static void main(String[] args) {
        int[] cards = {17,13,11,2,3,5,7};

        System.out.println(Arrays.toString(new RevealCardsInIncreasingOrder()
                .deckRevealedIncreasing(cards)));
    }

    public int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        List<Integer> ordered = new ArrayList<>() {
            {
                for (int i : deck) {
                    add(i);
                }
            }
        };

        Deque<Integer> cards = new ArrayDeque<>();
        int end = ordered.size() - 1;

        cards.addLast(ordered.get(end--));

        while (end >= 0) {
            int last = cards.removeLast();
            cards.addFirst(last);
            cards.addFirst(ordered.get(end--));
        }

        int[] result = new int[deck.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = cards.removeFirst();
        }


        return result;
    }
}
