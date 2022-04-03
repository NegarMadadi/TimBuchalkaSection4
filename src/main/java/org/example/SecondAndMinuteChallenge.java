package org.example;

public class SecondAndMinuteChallenge {
    private static final  String Invalid_value_message = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(-32));
        System.out.println(getDurationString(65, 9));
    }

    public static String getDurationString(int minutes, int seconds) {

        int hour;
        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
            return Invalid_value_message;
        }
        hour = minutes / 60;
        minutes = minutes % 60;

        String hoursString = hour + "h";
        if (hour < 10) {
            hoursString = "0" + hoursString;
        }

        String minutesString = minutes + "m";
        if (minutes < 10) {
            minutesString = "0" + minutesString;
        }


        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + secondsString;
        }


        return (hoursString + " " + minutesString + " " + secondsString);
    }


    public static String getDurationString(int seconds) {
        if ((seconds <= 0)) {
            return Invalid_value_message;
        } else {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }
    }
}
