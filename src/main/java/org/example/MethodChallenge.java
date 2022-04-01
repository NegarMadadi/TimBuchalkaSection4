package org.example;

public class MethodChallenge {
    public static void main(String[] args) {

        highScorePosition("Negar", calculateHighScorePosition(1500));
        highScorePosition("Sara", calculateHighScorePosition(1000));
        highScorePosition("Elmira", calculateHighScorePosition(900));
        highScorePosition("Mohammad", calculateHighScorePosition(500));
        highScorePosition("Nahid", calculateHighScorePosition(400));
        highScorePosition("AmirAli", calculateHighScorePosition(50));
    }

    public static void highScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position "
                + position + " on the highScore table.");
    }

    public static int calculateHighScorePosition(int playersScore) {

     /*
      // Other way of solving the same challenge
      if (playersScore >= 1000) {
            return 1;
        } else if (playersScore >= 500 ) {
            return 2;
        } else if (playersScore >= 100) {
            return 3;
        }
        return 4;*/

        int position = 4;  //assuming position 4 will be returned.
        if (playersScore >= 1000) {
            position = 1;
        } else if (playersScore >= 500) {
            position = 2;
        } else if (playersScore >= 100) {
            position = 3;
        }

        return position;
    }
}
