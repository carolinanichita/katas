package org.arrays;

import java.util.Arrays;

public class ReverseArrOfChar {
    public static char[] reverseArray(char[] arr) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        char temporary;

        while (leftIndex < rightIndex) {
            temporary = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = temporary;
            leftIndex++;
            rightIndex--;
        }
        System.out.println("Array in the method: ");
        System.out.println(arr);
        return arr;
    }
}
