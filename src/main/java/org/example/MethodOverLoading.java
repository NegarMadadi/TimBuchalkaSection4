package org.example;

public class MethodOverLoading {
    public static void main(String[] args) {
        int newScore = calculateScore("Negar", 500);
        System.out.println("New acore is " + newScore);
        calculateScore(3);
        calculateScore();

    }

    private static void calculateScore() {
        System.out.println("No player Name, no player score");
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static void calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
    }
}
