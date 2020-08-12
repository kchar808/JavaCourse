package com.company;

public class Main {

    public static void main(String[] args) {
		boolean gameOver = true;
		int score = 4000;
		int lvlCompleted = 5;
		int bonus = 100;

//	    if (score < 5000 && score > 1000) {
//            System.out.println("Your score was < 5000 but > 1000");
//        } else if (score < 1000) {
//			System.out.println("your score was less than 1000");
//		} else {
//			System.out.println("Got here");
//		}
//

		if (gameOver) {
			int finalScore = score + (lvlCompleted * bonus);
			System.out.println(finalScore);
		}

		score = 10000;
		lvlCompleted = 8;
		bonus = 200;

		if (gameOver) {
			int finalScore = score + (lvlCompleted * bonus);
			System.out.println(finalScore);
		}
	}
}
