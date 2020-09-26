package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 1;
        while (count <= 10) {
            System.out.println("Enter number #" + count);
            boolean hasInt = scanner.hasNextInt();
            if (hasInt) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                System.out.println("Not a valid number.");
            }
            scanner.nextLine(); // handles end of line (enter key)
        }

        scanner.close();

        System.out.println("Your sum is " + sum);
    }
}
