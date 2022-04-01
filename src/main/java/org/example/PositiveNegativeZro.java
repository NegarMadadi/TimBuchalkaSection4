package org.example;

public class PositiveNegativeZro {
    public static void main(String[] args) {
        checkNumber(-3);
    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("Positive.");
        } else if (number < 0) {
            System.out.println("Negative.");
        } else
            System.out.println("Zero");
    }
}
