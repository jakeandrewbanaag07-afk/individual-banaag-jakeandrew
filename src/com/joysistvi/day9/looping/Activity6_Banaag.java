package com.joysistvi.day9.looping;
import java.util.Scanner;

public class Activity6_Banaag {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for a number5
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Display the multiplication table
        System.out.println("\nMultiplication Table of " + number);

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}

