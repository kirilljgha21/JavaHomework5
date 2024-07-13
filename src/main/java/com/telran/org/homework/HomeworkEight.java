package com.telran.org.homework;

import java.util.Scanner;

public class HomeworkEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        boolean isLeap = isLeapYear(year);
        if (isLeap) {
            System.out.println(year + " является високосным годом.");
        } else {
            System.out.println(year + " не является високосным годом.");
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
