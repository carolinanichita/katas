package org.arrays;

// Given an array of size n, can you find the second maximum element in the array?
public class FindSecondMaxVal {
    public static int findSecondMaximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondmax && arr[i] < max) {
                secondmax = arr[i];
            }
        }
        return secondmax;
    }

    public static String arrToString(int[] arr) {
        if (arr.length > 0) {
            String result = "";
            for (int i = 0; i < arr.length; i++) {
                result += arr[i] + " ";
            }
            return result;
        } else {
            return "Empty array!";
        }
    }

    public static void main(String args[]) {
        int[] arr = {-2, 3, 1, -13, 5, 21};

        System.out.println("Array after: " + arrToString(arr));

        int result = findSecondMaximum(arr);
        System.out.println("Array after: " + result);

    }
}
