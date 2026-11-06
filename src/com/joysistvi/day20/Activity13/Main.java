package com.joysistvi.day20.Activity13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        UserAccount user = new UserAccount();


        System.out.println("***********************************");
        System.out.println("*    User Account Registration    *");
        System.out.println("***********************************");

        System.out.print("First name: ");
        user.setFirstName(input.nextLine().trim());

        System.out.print("Middle name: ");
        user.setMiddleName(input.nextLine().trim());

        System.out.print("Last name: ");
        user.setLastName(input.nextLine().trim());

        System.out.print("Address: ");
        user.setAddress(input.nextLine().trim());

        // EMAIL VALIDATION
        System.out.print("Email: ");

        while (!user.setEmail(input.nextLine().trim())) {
            System.out.print("Invalid email. Try again: ");
        }

        // PASSWORD
        System.out.print("Password: ");
        user.setPassword(input.nextLine());

        // DISPLAY ACCOUNT
        System.out.println("\n=== Account Created ===");
        System.out.println("Full name : " + user.getFullName());
        System.out.println("Email     : " + user.getEmail());
        System.out.println("Address   : " + user.getAddress());
        System.out.println("Password  : ********");

        input.close();
    }
}