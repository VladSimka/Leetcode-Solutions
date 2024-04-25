package com.vladsimonenko.algorithms.arrays;

public class BestTimeToBuyAndStock {

    public static void main(String[] args) {
        System.out.println(new BestTimeToBuyAndStock()
                .maxProfit(new int[]{7,1,5,3,6,4}));
    }
    public int maxProfit(int[] prices) {
        int profit = 0;
        int min = prices[0];

        for (int price : prices) {
            profit = Math.max(profit, price - min);
            min = Math.min(min, price);
        }
        return profit;
    }
}
