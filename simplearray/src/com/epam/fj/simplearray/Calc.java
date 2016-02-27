package com.epam.fj.simplearray;

/**
 * Created by vitaliy on 26.02.16.
 */
public class Calc {


    public static double getMaxSum(double[] array) {
        double maxSum = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length / 2; i++) {
            if ((array[i] + array[array.length - i - 1]) > maxSum) {
                maxSum = array[i] + array[array.length - i - 1];
            }

        }
        return maxSum;
    }


}
