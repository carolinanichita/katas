package org.arrays;

// Given an array, return an array where each index stores the product of all numbers
// except the number on the index itself.

public class MultiplyAllExceptItself {
    public static  int[] findProduct(int[] arr) {
        int n = arr.length;
        int i, temp = 1;

        var result = new int[n];

        for (i = 0; i < n; i++)
        {
            result[i] = temp;
            temp *= arr[i];
        }

        temp = 1;

        for (i = n - 1; i >= 0; i--)
        {
            result[i] *= temp;
            temp *= arr[i];
        }

        return result;
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
    public static void main(String []args) {
        int[] arr = {-1, 2, -3, 4, -5};

        System.out.println("Array before: " + arrToString(arr));

        int[] prodArr = findProduct(arr);
        System.out.println("Array after product: " + arrToString(prodArr));

    }
}
