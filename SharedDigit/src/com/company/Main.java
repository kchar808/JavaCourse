package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(82, 81));
    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if((firstNumber < 10) || (firstNumber > 99) || (secondNumber < 10) || (secondNumber > 99)) {
            return false;
        }

        int first;
        int second;
        int originalSecond = secondNumber;
        while (firstNumber > 0) {
            first = firstNumber % 10;

            while (secondNumber > 0) {
                second = secondNumber % 10;
                if(second == first) {
                    return true;
                }
                secondNumber /= 10;
            }
            secondNumber = originalSecond; // reset 2nd number
            firstNumber /= 10;
        }

        return false;
    }
}
