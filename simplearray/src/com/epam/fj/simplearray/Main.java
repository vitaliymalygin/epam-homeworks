package com.epam.fj.simplearray;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    double[] array=new double[10];
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Please input 10 digit");
            for (int i = 0; i < array.length; i++) {
                array[i] = sc.nextDouble();

            }
        }
        Calc calc=new Calc();
        double maxSum=calc.getMaxSum(array);
        System.out.println("The answer is "+maxSum);
    }
}
