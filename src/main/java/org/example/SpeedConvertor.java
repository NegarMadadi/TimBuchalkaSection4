package org.example;

public class SpeedConvertor {
    public static void main(String[] args) {
        printConversion(3);
    }

    public static long toMilesPerHour(double kilometersPerHour) {
        long mile = 0;
        if (kilometersPerHour < 0) {
            return -1;
        }
           return mile = (long) (Math.round((kilometersPerHour/1.609)));
    }


    public static void printConversion(double kilometersPerHour) {
        long mile;
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            mile = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + mile + " mi/h");
        }
    }
}
