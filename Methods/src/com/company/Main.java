package com.company;

public class Main {

    public static void main(String[] args) {
        calculateScore(true, 800, 5, 100);

        calculateScore(true, 10000, 8, 200);
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
