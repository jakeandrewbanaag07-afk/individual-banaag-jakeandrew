package com.joysistvi.day7.userinput;

import java.util.Scanner;

public class Activity5_Banaag {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for the USSD code
        System.out.println("Dial *143# to access Globe Services");
        System.out.print("Enter USSD Code: ");
        String code = scanner.nextLine();

        // Check if the code is correct
        if (!code.equals("*143#")) {
            System.out.println("Invalid code!");
            return;
        }

        // Display the main menu
        System.out.println("* Load Registration *");
        System.out.println("[1] Go+");
        System.out.println("[2] Go");
        System.out.println("[3] GoEXTRA");
        System.out.println("[4] UNLI 5G");
        System.out.println("[5] ALLNET");
        System.out.print("Enter a choice: ");
        int choice = scanner.nextInt();

        String promo = "";

        // Show promos based on the user choice
        if (choice == 1) {
            System.out.println("*** Go+ Promos ***");
            System.out.println("[1] Go+99");
            System.out.println("[2] Go+129");
            System.out.println("[3] Go+149");
        } else if (choice == 2) {
            System.out.println("*** Go Promos ***");
            System.out.println("[1] Go50");
            System.out.println("[2] Go90");
            System.out.println("[3] Go120");
        } else if (choice == 3) {
            System.out.println("*** GoEXTRA Promos ***");
            System.out.println("[1] GoEXTRA99");
            System.out.println("[2] GoEXTRA129");
            System.out.println("[3] GoEXTRA149");
        } else if (choice == 4) {
            System.out.println("*** UNLI 5G Promos ***");
            System.out.println("[1] UNLI 5G 99");
            System.out.println("[2] UNLI 5G 149");
            System.out.println("[3] UNLI 5G 199");
        } else if (choice == 5) {
            System.out.println("*** ALLNET Promos ***");
            System.out.println("[1] ALLNET99");
            System.out.println("[2] ALLNET149");
            System.out.println("[3] ALLNET199");
        } else {
            System.out.println("Invalid choice!");
            return;
        }

        // Get the selected promo number
        System.out.print("Enter a choice: ");
        int p = scanner.nextInt();

        // Match the selected promo
        if (choice == 1) {
            if (p == 1) promo = "Go+99";
            else if (p == 2) promo = "Go+129";
            else if (p == 3) promo = "Go+149";
        } else if (choice == 2) {
            if (p == 1) promo = "Go50";
            else if (p == 2) promo = "Go90";
            else if (p == 3) promo = "Go120";
        } else if (choice == 3) {
            if (p == 1) promo = "GoEXTRA99";
            else if (p == 2) promo = "GoEXTRA129";
            else if (p == 3) promo = "GoEXTRA149";
        } else if (choice == 4) {
            if (p == 1) promo = "UNLI 5G 99";
            else if (p == 2) promo = "UNLI 5G 149";
            else if (p == 3) promo = "UNLI 5G 199";
        } else if (choice == 5) {
            if (p == 1) promo = "ALLNET99";
            else if (p == 2) promo = "ALLNET149";
            else if (p == 3) promo = "ALLNET199";
        }

        // Check if the promo number is valid
        if (promo.equals("")) {
            System.out.println("Invalid choice!");
            return;
        }

        // Display promo details
        System.out.println("*** " + promo + " Promo ***");
        System.out.println("-> Get 8 GB for all sites + 8GB");
        System.out.println("[1] Subscribe");
        System.out.println("[2] Exit");
        System.out.print("Enter a choice: ");
        int action = scanner.nextInt();

        // Subscribe or exit
        if (action == 1) {
            System.out.println("You are now subscribed to " + promo);
        } else if (action == 2) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Invalid choice!");
        }

        scanner.close();

    }
}
