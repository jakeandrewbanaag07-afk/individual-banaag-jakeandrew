package com.joysistvi.day12.multidarray;
import java.util.Scanner;

public class Activity9_Banaag {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("======================================");
        System.out.println("          Average Calculator");
        System.out.println("======================================");

        System.out.print("Enter number of students: ");
        int students = scanner.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = scanner.nextInt();
        scanner.nextLine();

        String[] names = new String[students];
        String[] subjectNames = new String[subjects];
        double[][] grades = new double[students][subjects];
        double[] averages = new double[students];



        System.out.println("\nEnter subject names:");
        for (int j = 0; j < subjects; j++) {
            System.out.print("Subject " + (j + 1) + ": ");
            subjectNames[j] = scanner.nextLine();
        }

        for (int i = 0; i < students; i++) {
            System.out.print("\nName of Student " + (i + 1) + ": ");
            names[i] = scanner.nextLine();

            double total = 0;
            System.out.println("Enter grades for each subject:");

            for (int j = 0; j < subjects; j++) {
                System.out.print(subjectNames[j] + ": ");
                grades[i][j] = scanner.nextDouble();
                total += grades[i][j];
            }

            averages[i] = total / subjects;
            scanner.nextLine();
        }

        System.out.println("\n======================================");
        System.out.println("             Grades Report");
        System.out.println("======================================");

        System.out.printf("%-24s", "Student");
        for (String subject : subjectNames) {
            System.out.printf("%-12s", subject);
        }
        System.out.printf("%-10s%n", "Average");

        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < students; i++) {
            System.out.printf("%-24s", names[i]);

            for (int j = 0; j < subjects; j++) {
                System.out.printf("%-12.2f", grades[i][j]);
            }

            System.out.printf("%-10.2f%n", averages[i]);
        }

        scanner.close();



    }

}
