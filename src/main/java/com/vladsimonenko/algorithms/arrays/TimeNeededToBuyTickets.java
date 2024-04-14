package com.vladsimonenko.algorithms.arrays;

public class TimeNeededToBuyTickets {

    public static void main(String[] args) {
        int[] arr = {5,1,1,1};

        System.out.println(new TimeNeededToBuyTickets().timeRequiredToBuy(
                arr,0
        ));
    }

    public int timeRequiredToBuy(int[] tickets, int k) {
        int time = 0;

        for (int i = 0; i < tickets.length; i++) {
            if (i <= k) {
                time += Math.min(tickets[i], tickets[k]);
            } else {

                if (tickets[i] < tickets[k]) {
                    time += tickets[i];
                } else {
                    time += tickets[k] - 1;
                }
            }
        }
        return time;

    }
}
