package org.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMaxStocksProfitTest {
    @Test
    public void priceGoesUpThenDown() {
        int[] stockPrices = {2,4,7,3,1};
        int expectedMaxProfit = 5;
        int actualMaxProfit = FindMaxStocksProfit.getMaxStockProfit(stockPrices);

        assertEquals(expectedMaxProfit, actualMaxProfit);
    }
}