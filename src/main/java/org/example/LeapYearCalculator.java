package org.example;

public class LeapYearCalculator {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1924));
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        }
        return false;
    }
}
