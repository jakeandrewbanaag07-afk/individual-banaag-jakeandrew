package com.joysistvi.day21.Activity14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ---------- STEP 1: Ask for the six fields ----------
        System.out.println("*** User Registration ***");
        System.out.println("Please enter the details below:\n");

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter middle name: ");
        String middleName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter address: ");
        String address = input.nextLine();

        System.out.print("Enter email: ");
        String email = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        // ---------- STEP 2: Create the object with the constructor ----------
        UserAccount account = new UserAccount(firstName, middleName, lastName,
                address, email, password);

        // ---------- STEP 3: Display it (calls toString automatically) ----------
        System.out.println();
        System.out.println(account);

        input.close();
    }
}