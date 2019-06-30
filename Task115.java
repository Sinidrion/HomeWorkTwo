package com.company;

import java.util.Scanner;

public class Task115 {

    public static void main(String[] args) {
        System.out.println("Введите значение x");
        Scanner num = new Scanner(System.in);
        int x = num.nextInt();
        System.out.println("a)" + (-1/Math.pow(x,2)));
        System.out.println("Введите значение a");
        Scanner num1 = new Scanner(System.in);
        float a = num1.nextFloat();
        System.out.println("Введите значение b");
        Scanner num2 = new Scanner(System.in);
        float b = num2.nextFloat();
        System.out.println("Введите значение c");
        Scanner num3 = new Scanner(System.in);
        float c = num3.nextFloat();
        System.out.println("б)" + (a/(b*c)));
        System.out.println("в)" + ((a/b)*c));
        System.out.println("г)" + ((a+b)*c));
        System.out.println("д)" + (5.45f*((a+2*b)/(2-a))));
        System.out.println("е)" + (float)((-b+(Math.sqrt((Math.pow(b,2))-(4*a*c))))/(2*a)));
        System.out.println("ж)" + ((-b+(1/a)))/(2/c));
        System.out.println("з)" + (1/(1+((a+b)/2))));
        System.out.println("и)" + (float)(1/(1+(1/2+(1/2+(3/5))))));
        System.out.println("Введите значение m");
        Scanner num4 = new Scanner(System.in);
        int m = num4.nextInt();
        System.out.println("Введите значение n");
        Scanner num5 = new Scanner(System.in);
        int n = num5.nextInt();
        System.out.println("к)" + (Math.pow(2,Math.pow(m,n))));




    }
}