package com.epam.fj.homework01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);) {
            System.out.println("Введите значения a, b , h");
            // Считываем числа с консоли
            double a = sc.nextDouble();
            System.out.println("a="+a);
            double b = sc.nextDouble();
            System.out.println("b="+b);
            double h = sc.nextDouble();
            System.out.println("h="+h);
            double x=a;
            while (x<b){
                double f= Math.tan(2*x)-3;
                System.out.println("x=" +x+" F(x)="+f);
                x=x+h;
            }
        }
    }
}
