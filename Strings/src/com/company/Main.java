package com.company;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + ", and this is more";
        System.out.println(myString);
        myString = myString + " \u00A9 2020";
        System.out.println(myString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);
    }
}
