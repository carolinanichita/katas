package meeting_ranges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstComeFirstServedTest {

    @Test
    public void bothOrderArraysHaveSameNumberOfOrdersTest () {
        final int[] takeOutOrders = {1,2,3};
        final int[] dineInOrders = {4,5,6};
        final int[] servedOrders = {1,2,3,4,5,6};

        final boolean result = FirstComeFirstServed.isFirstComeFirstServed(takeOutOrders, dineInOrders, servedOrders,0,0,0);
        assertTrue(result);
    }

    @Test
    public void orderArraysHaveDifferentLengthsTest () {
        final int[] takeOutOrders = {1,2,3};
        final int[] dineInOrders = {4,5,6,7,9,11};
        final int[] servedOrders = {1,2,3,4,5,11,7,9,6};

        final boolean result = FirstComeFirstServed.isFirstComeFirstServed(takeOutOrders, dineInOrders, servedOrders,0,0,0);
        assertFalse(result);
    }

    @Test
    public void oneOrdersArrayIsEmptyTest () {
        final int[] takeOutOrders = {};
        final int[] dineInOrders = {4,5,6,7,9,11};
        final int[] servedOrders = {4,5,6,7,9,11};

        final boolean result = FirstComeFirstServed.isFirstComeFirstServed(takeOutOrders, dineInOrders, servedOrders,0,0,0);
        assertTrue(result);
    }

    @Test
    public void servedOrderArrayHaveNoCorrectOrder () {
        final int[] takeOutOrders = {1,2,3};
        final int[] dineInOrders = {4,5,6,7,9};
        final int[] servedOrders = {1,2,9,11,5,4,7,3,6};

        final boolean result = FirstComeFirstServed.isFirstComeFirstServed(takeOutOrders,dineInOrders, servedOrders,0,0,0);
        assertFalse(result);
    }

    @Test
    public void oneOrdersArrayHasExtraOrders () {
        final int[] takeOutOrders = {1, 9};
        final int[] dineInOrders = {7, 8};
        final int[] servedOrders = {1, 7, 8};
        final boolean result = FirstComeFirstServed.isFirstComeFirstServed(takeOutOrders, dineInOrders, servedOrders,0,0,0);
        assertFalse(result);
    }

    @Test
    public void oneOrdersArrayHasUnservedOrders() {
        final int[] takeOutOrders = {55, 9};
        final int[] dineInOrders = {7, 8};
        final int[] servedOrders = {1, 7, 8, 9};
        final boolean result = FirstComeFirstServed.isFirstComeFirstServed(takeOutOrders, dineInOrders, servedOrders,0,0,0);
        assertFalse(result);
    }

    @Test
    public void orderNumbersAreNotSequential() {
        final int[] takeOutOrders = {27, 12, 18};
        final int[] dineInOrders = {55, 31, 8};
        final int[] servedOrders = {55, 31, 8, 27, 12, 18};
        final boolean result = FirstComeFirstServed.isFirstComeFirstServed(takeOutOrders, dineInOrders, servedOrders,0,0,0);
        assertTrue(result);
    }

}