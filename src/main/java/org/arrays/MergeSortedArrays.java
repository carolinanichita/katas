package org.arrays;

public class MergeSortedArrays {
    public static int[] mergeSortArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int currentIndexArr1 = 0;
        int currentIndexArr2 = 0;
        int currentIndexMergedArr = 0;

        while (currentIndexMergedArr < mergedArray.length) {

            boolean isArr1Exhausted = currentIndexArr1 >= arr1.length;
            boolean isArr2Exhausted = currentIndexArr2 >= arr2.length;

            if (!isArr1Exhausted && (isArr2Exhausted || (arr1[currentIndexArr1] < arr2[currentIndexArr2]))) {
                mergedArray[currentIndexMergedArr] = arr1[currentIndexArr1];
                currentIndexArr1++;
            } else {
                mergedArray[currentIndexMergedArr] = arr2[currentIndexArr2];
                currentIndexArr2++;
            }
            currentIndexMergedArr++;
        }

        return mergedArray;
    }
}
