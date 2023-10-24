package org.arrays;

public class ReverseWords {
    public static char[] reverseWords(char[] message) {
        int currentWordStartIndex = 0;

        reverseChars(message, 0, message.length - 1);

        for (int i = 0; i < message.length; i++) {
            if (message[i] == message.length || message[i] == ' ') {
                reverseChars(message, currentWordStartIndex, i - 1);
                currentWordStartIndex = i + 1;
            }
        }

        return message;
    }

    public static char[] reverseChars(char[] arr, int leftIndex, int rightIndex) {
        while (leftIndex < rightIndex) {
            char temporary = arr[leftIndex];
            arr[leftIndex] = arr[rightIndex];
            arr[rightIndex] = temporary;
            leftIndex++;
            rightIndex--;
        }
        return arr;
    }
}
