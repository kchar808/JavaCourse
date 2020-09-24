package com.company;

import java.util.Enumeration;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(30, 21, 79));
    }
    
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (a < 10 || b < 10 || c < 10 || a > 1000 || b > 1000 || c > 1000) {
            return false;
        }

        int aDigit = a % 10;
        int bDigit = b % 10;
        int cDigit = c % 10;

        return aDigit == bDigit || bDigit == cDigit || cDigit == aDigit;
    }

    public static boolean isValid(int number) {
        if(number >= 10 || number <= 1000) {
            return true;
        }
        return false;
    }
}
