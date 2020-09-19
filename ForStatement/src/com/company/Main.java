package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        for(int i = 0; i <= 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        for(int j = 2; j <= 8; j++) {
            System.out.println("10,000 at " + j +"% interest = " + String.format("%.2f",
                    calculateInterest(10000, j)));
        }

        System.out.println("************");

        // modified loop. backwards from 8 to 2 percent

        for(int j = 8; j >= 2; j--) {
            System.out.println("10,000 at " + j +"% interest = " + String.format("%.2f",
                    calculateInterest(10000, j)));
        }

        // prime number for loop
        int count = 0;
        for(int i = 10; i <= 30; i++) {
            if(isPrime(i)) {
                System.out.println(i);
                count++;
                if(count == 5) {
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {

        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
       return (amount * (interestRate / 100));
    }
}
