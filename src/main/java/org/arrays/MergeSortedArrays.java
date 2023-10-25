package org.arrays;

public class MergeSortedArrays {
    public static int[] mergeSortArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        int currentIndexArr1 = 0;
        int currentIndexArr2 = 0;
        int currentIndexMergedArr = 0;

        while (currentIndexMergedArr < mergedArray.length) {
            if (currentIndexArr1 >= arr1.length) {
                mergedArray[currentIndexMergedArr] = arr2[currentIndexArr2];
                currentIndexArr2++;
            } else if (currentIndexArr2 >= arr2.length){
                mergedArray[currentIndexMergedArr] = arr1[currentIndexArr1];
                currentIndexArr1++;
            } else if (arr1[currentIndexArr1] < arr2[currentIndexArr2]) {
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

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] actual = MergeSortedArrays.mergeSortArrays(arr1, arr2);
        System.out.println(actual);
    }
}
