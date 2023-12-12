package org.arrays;

public class FindMaxStocksProfit {
    public static int getMaxStockProfit(int[] stockPrices) {
        if (stockPrices.length < 2) {
            throw new IllegalArgumentException("Getting a profit requires at least 2 prices!");
        }

        int minPrice = stockPrices[0];
        int maxStockProfit = stockPrices[1] - stockPrices[0];

        for (int i = 1; i < stockPrices.length; i++) {
            int currentPrice = stockPrices[i];

            int currentProfit = currentPrice - minPrice;

            maxStockProfit = Math.max(maxStockProfit, currentProfit);
            minPrice = Math.min(currentPrice, minPrice);
        }
        return maxStockProfit;
    }
}
