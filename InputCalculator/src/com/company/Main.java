package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        double average = 0;
        while (true) {
            boolean isInt = scanner.hasNextInt();
            if(isInt) {
                int number = scanner.nextInt();
                count++;
                sum += number;
                average = (double) sum / count;
            } else {
                System.out.println("SUM = " + sum + " AVG = " + Math.round(average));
                break;
            }

        }
        scanner.close();
    }
}
