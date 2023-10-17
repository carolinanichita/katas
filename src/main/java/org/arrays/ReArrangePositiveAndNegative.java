package org.arrays;

import java.util.Arrays;
import java.util.List;

public class ReArrangePositiveAndNegative {

    public static int[] reArrange(int[] arr) {
        int[] newArr = new int[arr.length];
        int newIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                newArr[newIndex] = arr[i];
                newIndex++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                newArr[newIndex] = arr[i];
                newIndex++;
            }
        }

        Arrays.sort(newArr);
        return  newArr;

    }

    public static String arrToString(int[] arr) {
        if (arr.length > 0) {
            String result = " ";

            for (int i = 0; i < arr.length; i++) {
                result += arr[i] + " ";
            }
            return result;
        } else {
            return "Empty array!";
        }
    }

    public static void main(String args[]) {
        int[] arr = {19, -3, 0, -4, -2, 6, 10};

        System.out.println("Array before: " + arrToString(arr));

        int[] result = reArrange(arr);
        System.out.println("Array after: " + arrToString(result));
    }
}
