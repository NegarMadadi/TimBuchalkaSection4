package org.example;

public class SecondAndMinuteChallenge {
    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int minutes, int seconds) {
        int hour;
        if ((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {
            hour = minutes / 60;
            minutes = minutes % 60;
        } else return "Invalid value";
        return (hour + "h " + minutes + "m " + seconds + "s");
    }
    public static String getDurationString(int seconds) {
        if ((seconds <= 0)) {
            return "Invalid value";
        } else {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }
    }
}
