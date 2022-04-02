package org.example;

public class MethodOverLoadingChallenge {
    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(0, 1));
        System.out.println(calcFeetAndInchesToCentimeters(6, 0));
        System.out.println(calcFeetAndInchesToCentimeters(-21));
        System.out.println(calcFeetAndInchesToCentimeters(100));
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (!(feet >= 0 && (inches >= 0 && inches <= 12))) {
            System.out.println("Invalid feet or inches parameters.");
            return -1;
        }
        double centimeters = ((feet * 12) * 2.54) + (inches * 2.54);
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " centimeters");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches <= 0) {
            return -1;
        }
        double feet = (int) (inches / 12);
        double remainingInches = (int) (inches % 12);
        System.out.println(inches + " is equal to " + feet + "feet, " + remainingInches + "inches = ");

        double centimeters = calcFeetAndInchesToCentimeters(feet, remainingInches);

        return centimeters;
    }
}
