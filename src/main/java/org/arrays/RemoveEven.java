package org.arrays;

public class RemoveEven {

    public static int[] removeEven(int[] arr) {
        int countOdd = 0;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                countOdd ++;
            }
        }

        int[] result = new int[countOdd];
        int indexResult = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
               result[indexResult] = arr[i];
               indexResult++;
            }
        }
        return result;
    }

    public static String arrToString(int[] arr) {
        if(arr.length > 0) {
            String result = "";
            for(int i = 0; i < arr.length; i++) {
                result += arr[i] + " ";
            }
            return result;
        } else {
            return "Empty array!";
        }
    }

    public static void main(String args[]) {
        int[] arr = {12,3,5,14,22,10,0};

        System.out.println("Array before: " + arrToString(arr));

        int[] result = removeEven(arr);
        System.out.println("Array after: " + arrToString(result));

    }
}
