package org.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArraysTest {

    @Test
    public void shouldMergeAndSort2Arrays() {
        int[] arr1 = {1, 3, 5};
        int[] arr2 = {2, 4, 6};

        int[] actual = MergeSortedArrays.mergeSortArrays(arr1, arr2);
        int[] expected = {1, 2, 3, 4, 5, 6};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMerge489With13712() {
        int[] arr1 = {4, 8, 9, 12};
        int[] arr2 = {1, 3, 7};

        int[] actual = MergeSortedArrays.mergeSortArrays(arr1, arr2);
        int[] expected = {1, 3, 4, 7, 8, 9, 12};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMergeArrayWithDifferentLengths() {
        int[] arr1 = {4, 8, 9};
        int[] arr2 = {1, 3, 7, 21};

        int[] actual = MergeSortedArrays.mergeSortArrays(arr1, arr2);
        int[] expected = {1, 3, 4, 7, 8, 9, 21};

        assertArrayEquals(expected, actual);
    }

}