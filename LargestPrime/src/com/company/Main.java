package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }

        for(int i = number; i > 1; i--) { // loops down from number until it reaches down to a
            // prime number
            if(number % i == 0) {
                number = i;
            }
        }
        return number;



    }
}
