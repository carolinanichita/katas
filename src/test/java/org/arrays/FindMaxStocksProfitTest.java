package org.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FindMaxStocksProfitTest {
    @Test
    public void priceGoesUpThenDownTest() {
        int[] stockPrices = {2,4,7,3,1};
        int expectedMaxProfit = 5;
        int actualMaxProfit = FindMaxStocksProfit.getMaxStockProfit(stockPrices);

        assertEquals(expectedMaxProfit, actualMaxProfit);
    }

    @Test
    public void priceGoesDownThenUpTest() {
        int[] stockPrices = {9,4,3,8,11};
        int expectedMaxProfit = 8;
        int actualMaxProfit = FindMaxStocksProfit.getMaxStockProfit(stockPrices);

        assertEquals(expectedMaxProfit, actualMaxProfit);
    }

    @Test
    public void bigIncreaseThenSmallIncreaseTest() {
        int[] stockPrices = {2,9,1,3};
        int expectedMaxProfit = 7;
        int actualMaxProfit = FindMaxStocksProfit.getMaxStockProfit(stockPrices);

        assertEquals(expectedMaxProfit, actualMaxProfit);
    }

    @Test
    public void priceGoesUpAllTimeTest() {
        int[] stockPrices = {2,4,5,8,12};
        int expectedMaxProfit = 10;
        int actualMaxProfit = FindMaxStocksProfit.getMaxStockProfit(stockPrices);

        assertEquals(expectedMaxProfit, actualMaxProfit);
    }

    @Test
    public void priceGoesDownAllTimeTest() {
        int[] stockPrices = {12,8,7,4,2};
        int expectedMaxProfit = -1;
        int actualMaxProfit = FindMaxStocksProfit.getMaxStockProfit(stockPrices);

        assertEquals(expectedMaxProfit, actualMaxProfit);
    }

    @Test
    public void samePriceAllTimeTest() {
        int[] stockPrices = {1,1,1,1,1};
        int expectedMaxProfit = 0;
        int actualMaxProfit = FindMaxStocksProfit.getMaxStockProfit(stockPrices);

        assertEquals(expectedMaxProfit, actualMaxProfit);
    }

    @Test()
    public void onePriceTest() {
        assertThrows(Exception.class, () -> {
            FindMaxStocksProfit.getMaxStockProfit(new int[]{5});
        });
    }

    @Test()
    public void emptyPricesTest() {
        assertThrows(Exception.class, () -> {
            FindMaxStocksProfit.getMaxStockProfit(new int[]{});
        });
    }
}