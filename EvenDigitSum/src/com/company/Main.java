package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(276753));
        System.out.println(getEvenDigitSum(-50));
        System.out.println(getEvenDigitSum(252));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while(number != 0) {
            int currentDigit = number % 10;
            if(currentDigit % 2 == 0) {
                sum += currentDigit;
            }
            number /= 10;
        }

        return sum;

    }
}
