package meeting_ranges;

import java.util.Arrays;

public class FirstComeFirstServed {

    public static int[] removeFirst(int[] arr) {
        return Arrays.copyOfRange(arr, 1, arr.length);
    }
    public static boolean isFirstComeFirstServed (int[] takeOutOrders, int[] dineInOrders, int[] servedOrders) {
        if (servedOrders.length == 0) {
            return true;
        }

        if (takeOutOrders.length > 0 && takeOutOrders[0] == servedOrders[0]) {
            return isFirstComeFirstServed(removeFirst(takeOutOrders), dineInOrders, removeFirst(servedOrders));
        } else if (dineInOrders.length > 0 && dineInOrders[0] == servedOrders[0]) {
            return isFirstComeFirstServed(takeOutOrders, removeFirst(dineInOrders), removeFirst(servedOrders));
        } else {
            return false;
        }
    }
}
