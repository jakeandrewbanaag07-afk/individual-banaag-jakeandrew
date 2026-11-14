package com.joysistvi.day26.activity;

public abstract class Account {

    // data

    private String accountNumber;
    private String accountHolder;
    private double balance;

   // constructor
    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    // getter,setter

    public String getAccountNumber() {
        return accountNumber;
    }


    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    // Balance: anyone can read it...
    public double getBalance() {
        return balance;
    }


    protected void setBalance(double balance) {
        this.balance = balance;
    }

    // toString

    @Override
    public String toString() {
        return "Account Number: " + accountNumber + "\n"
                + "Account Holder: " + accountHolder + "\n"
                + "Balance: " + balance;
    }

    //  abstract method
    public abstract void displayAccountInfo();
}