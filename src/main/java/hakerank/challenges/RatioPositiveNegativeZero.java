package hakerank.challenges;

import java.util.List;

public class RatioPositiveNegativeZero {

    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        int positive = 0;
        int negative = 0;
        int zero = 0;

        for(int i = 0; i < n; i++) {
            if(arr.get(i) > 0) {
                positive += 1;
            } else if (arr.get(i) < 0) {
                negative += 1;
            } else if (arr.get(i) == 0) {
                zero += 1;
            }
        }

        double posRatio = positive / n;
        double negRatio = negative / n;
        double zeroRatio = zero / n;

        System.out.println(String.format("%.6f", posRatio));
        System.out.println(String.format("%.6f", negRatio));
        System.out.println(String.format("%.6f", zeroRatio));

    }

}

// Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the decimal value of each fraction on a new line with  places after the decimal.
//
//Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.
//
//Example
//
//There are  elements, two positive, two negative and one zero. Their ratios are ,  and . Results are printed as:
//
//0.400000
//0.400000
//0.200000
