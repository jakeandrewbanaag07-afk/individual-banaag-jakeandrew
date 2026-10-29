package com.joysistvi.day11.singledarray;
import java .util.Scanner;
public class Activity8_Banaag {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;


        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }


        System.out.println("\nNumbers entered:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println( "Index " + (i + 1) + ": " + numbers[i]);
            sum += numbers[i];
        }


        double average = (double) sum / numbers.length;
        System.out.println("\nSum = " + sum);
        System.out.println("Average = " + average);

        scanner.close();

    }
}
