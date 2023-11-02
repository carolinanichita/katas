package meeting_ranges;

import java.util.Arrays;

public class FirstComeFirstServed {

    //   *************** Solution that provides O(n) time and O(n) space costs ***************
    public static boolean isFirstComeFirstServed (int[] takeOutOrders, int[] dineInOrders, int[] servedOrders,
                                             int takeOutOrdersIndex, int dineInOrdersIndex, int servedOrdersIndex) {
        if (servedOrdersIndex == servedOrders.length) {
            return true;
        }

        if ((takeOutOrdersIndex < takeOutOrders.length) && (takeOutOrders[takeOutOrdersIndex] == servedOrders[servedOrdersIndex])) {
            takeOutOrdersIndex++;
        } else if ((dineInOrdersIndex < dineInOrders.length) && (dineInOrders[dineInOrdersIndex] == servedOrders[servedOrdersIndex])) {
            dineInOrdersIndex++;
        } else {
            return false;
        }
        servedOrdersIndex++;

        return isFirstComeFirstServed(takeOutOrders, dineInOrders, servedOrders, takeOutOrdersIndex, dineInOrdersIndex, servedOrdersIndex);
    }

//   *************** Solution that provides O(quadratic n) time and space costs ***************
//    public static int[] removeFirst(int[] arr) {
//        return Arrays.copyOfRange(arr, 1, arr.length);
//    }
//    public static boolean isFirstComeFirstServed (int[] takeOutOrders, int[] dineInOrders, int[] servedOrders) {
//        if (servedOrders.length == 0) {
//            return true;
//        }
//
//        if (takeOutOrders.length > 0 && takeOutOrders[0] == servedOrders[0]) {
//            return isFirstComeFirstServed(removeFirst(takeOutOrders), dineInOrders, removeFirst(servedOrders));
//        } else if (dineInOrders.length > 0 && dineInOrders[0] == servedOrders[0]) {
//            return isFirstComeFirstServed(takeOutOrders, removeFirst(dineInOrders), removeFirst(servedOrders));
//        } else {
//            return false;
//        }
//    }
}
