package com.joysistvi.day13.string;

import java .util.Scanner;

public class StringClass {

    public static void main(String[] args) {
        // login Program
        Scanner scanner = new Scanner(System.in);

        String correctUsername = "admin";
        String correctPassword = "admin123";

        for (int tries = 1; tries<= 5; tries++){

            System.out.println("Enter Username: ");
            String username = scanner.nextLine();

            System.out.println("Enter Password: ");
            String password = scanner.nextLine();

            // validatiion
            if(username.isEmpty() && password.isEmpty()) {
                System.out.println("Username and Password cannot be empty.");
            }
            // authentication
            if(username.equals(correctUsername) && password.equals(correctPassword)){
                System.out.println("Login Successfully");
                System.out.println("Welcome, " + username + "!");
                break;
            }else{
                System.out.println("Invalid Username or Password.");
                System.out.println("\nAccess Denied.");
                if (tries < 5){
                    System.out.println("Attemps remaining: " + (5- tries));
                }else{
                    System.out.println("Maximum attempts reached. ");
                }

            }
            System.out.println();
        }
        scanner.close();

    }
}


/*


        while(true){

            String correctUsername = "admin";
            String correctPassword = "admin123";

            for (int tries =1; tries <=3; tries++)



            System.out.println("Enter Username: ");
            String username = scanner.nextLine();

            System.out.println("Enter Password: ");
            String password = scanner.nextLine();

            // validation
            if (username.isEmpty() || password.isEmpty()) {
                System.out.println("Username and Password cannot be empty");

            }

            // Authentication
            if (username.equals(correctUsername)&& password.equals(correctPassword)) {

                System.out.println("Login Successsfully!");
                System.out.println("Welcome, " + username + "!");
                break;
            }else{
                System.out.println("Invalid Username or Password.");
                System.out.println("Access Denied.\n");
            }
        }
*/
/*System.out.println("Are you sure that you really wanna exit?");
        System.out.println("[Y] Yes - Exit Program");
        System.out.println("[N] No - Return to Main Menu");

        System.out.println("\nEnter your choice: ");
        String choice = String.valueOf(scanner.nextLine().charAt(0));

        if (choice.equalsIgnoreCase("Y")){
            System.out.println("Exiting... ");
        }else{
            System.out.println("Returning Back To Main Menu");
        }*/
/*
  String word = "Hello"; // String literal

        System.out.println( word.charAt(4));

         String word = "Hello"; // String literal

        System.out.println( word.length());

         System.out.println( word.toUpperCase());

 System.out.println( word.toLowerCase());


   String midddleName = "Banaag"; // String literal

        char middleInitial = midddleName.charAt(0);

        System.out.println( middleInitial);




*/