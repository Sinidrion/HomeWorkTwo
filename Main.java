package com.company;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Choose Task");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        while (num != 0) {
            switch (num) {
                case 1:
                    System.out.println("You Choose 1 Task");
                    break;
                case 2:
                    System.out.println("You Choose 2 Task");
                    break;
                case 3:
                    System.out.println("You Choose 3 Task");
                    break;
                case 4:
                    System.out.println("You Choose 4 Task");
                    break;
                case 5:
                    System.out.println("You Choose 5 Task");
                    break;
                case 6:
                    System.out.println("You Choose 6 Task");
                    break;
                case 7:
                    System.out.println("You Choose 7 Task");
                    break;
                case 8:
                    System.out.println("You Choose 8 Task");
                    break;
                case 9:
                    System.out.println("You Choose 9 Task");
                    break;
                default:
                    System.out.println("You don't Choose Task");
            }
            break;
        }

    }

}
