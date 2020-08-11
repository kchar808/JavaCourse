package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("The remainder of 4 % 3 = " + result);

        result++;
        System.out.println("1 + 1 = " + result);

        result--;
        System.out.println("2 - 1 = " + result);

        result+=2;
        System.out.println("1 + 2 = " + result);

        result*=10;
        System.out.println("3 * 10 = " + result);

        result/=3;
        System.out.println("30 / 3 = " + result);

        result-=2;
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And aliens are cool!");
        }

        int topScore = 80;
        if (topScore <= 100) {
            System.out.println("High score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than 2nd top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("NO!");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        double value = 20.00;
        double secondValue = 80.00;
        double total = (value + secondValue) * 100.00;
        double remainder = total % 40.00;
        boolean leftOver = (remainder == 0) ? true : false;
        System.out.println(leftOver);
        if (!leftOver) {
            System.out.println("Got some remainder");
        }
    }
}
