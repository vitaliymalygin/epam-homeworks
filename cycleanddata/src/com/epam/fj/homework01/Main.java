package com.epam.fj.homework01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите число е для ограничения последовательности");
        try (Scanner sc = new Scanner(System.in);) {
            int n=0;
            // Считываем число с консоли
            double e = sc.nextDouble();
            if (e>=0.25){
                System.out.println("нет решений");
                return;
            }
            else System.out.println("e=" + e);
            double a=0.25;
            for (int i=1;a>=e;i++){
                a=1/Math.pow((i+1),2);
                n=i;
            }
            System.out.println("Наименьший номер элемента последовательности="+n);


        }
    }
}