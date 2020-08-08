package com.company;

public class Main {

    public static void main(String[] args) {

	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float max value = " + myMaxFloatValue);

        double myMinDubValue = Double.MIN_VALUE;
        double myMaxDubValue = Double.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinDubValue);
        System.out.println("Float max value = " + myMaxDubValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5.00 / 3.00;
        System.out.println("MyIntValue = " + myIntValue);
        System.out.println("My myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);


        double pounds = 56d;
        double kilograms = pounds * 0.45359237d;
        System.out.println(kilograms);
    }
}
