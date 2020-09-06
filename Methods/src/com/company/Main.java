package com.company;

public class Main {

    public static void main(String[] args) {

        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);

        int playerPosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Greg", playerPosition);

        playerPosition = calculateHighScorePosition(900);
        displayHighScorePosition("Molly", playerPosition);

        playerPosition = calculateHighScorePosition(400);
        displayHighScorePosition("Jess", playerPosition);

        playerPosition = calculateHighScorePosition(50);
        displayHighScorePosition("Shane", playerPosition);

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int score) {

        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }

        return 4;


    }

    public static int calculateScore(boolean gameOver, int score, int lvlCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (lvlCompleted * bonus);
            finalScore += 2000;
            System.out.println(finalScore);
            return finalScore;
        }
        return -1;
    }
}
