package com.vladsimonenko.algorithms.dp;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int smallestPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < smallestPrice) smallestPrice = price;

            if (price - smallestPrice > maxProfit) maxProfit = price - smallestPrice;
        }


        return maxProfit;
    }
}
