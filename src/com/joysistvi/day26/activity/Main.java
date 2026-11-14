package com.joysistvi.day26.activity;

public class Main {

    //  helper method
    public static void testAccount(Account account) {
        account.displayAccountInfo();
    }

    public static void main(String[] args) {

        // create accounts
        SavingsAccount savings = new SavingsAccount("1001", "Ram Cujuangco", 5000.0);
        CheckingAccount checking = new CheckingAccount("2001", "Poisxn Cujuangco", 1000.0);

        // show the info
        testAccount(savings);
        System.out.println();            // empty line
        testAccount(checking);

        // saving transactions
        System.out.println("\n=== Savings Transactions ===");
        savings.deposit(1000);                   
        savings.withdraw(5800);
        savings.deposit(500, "Birthday gift");
        savings.withdraw(1500, "Rent");

        // checking transactions
        System.out.println("\n=== Checking Transactions ===");
        checking.withdraw(2500);
        checking.withdraw(1000);

        // transfer
        System.out.println("\n=== Transfer (Savings to Checking) ===");
        savings.transfer(checking, 1000);

        // interest
        System.out.println("\n=== Interest ===");
        savings.addInterest();
    }
}