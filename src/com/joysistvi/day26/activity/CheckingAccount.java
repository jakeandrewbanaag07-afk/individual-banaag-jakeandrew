package com.joysistvi.day26.activity;

public class CheckingAccount extends Account
        implements Transaction, Transferable, Overdraftable {

    // constructor
    public CheckingAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // display info
    @Override
    public void displayAccountInfo() {
        System.out.println("=== Checking Account ===");
        System.out.println(this);        // "this" is printed through toString()
        System.out.println("Overdraft Limit: " + OVERDRAFT_LIMIT);
    }

   // overdraft check
    @Override
    public boolean isWithinOverdraft(double amount) {
        return getBalance() - amount >= -OVERDRAFT_LIMIT;
    }

    // deposit
    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;                      // stop here, change nothing
        }
        setBalance(getBalance() + amount);
        System.out.println("Deposited " + amount + ". New balance: " + getBalance());
    }

   // withdraw
    @Override
    public boolean withdraw(double amount) {
        if (amount <= 0) {                                   // Rule 1
            System.out.println("Invalid withdrawal amount.");
            return false;
        }
        if (!isWithinOverdraft(amount)) {                    // Rule 2 ("!" means NOT)
            System.out.println("Withdrawal failed: exceeds the overdraft limit of " + OVERDRAFT_LIMIT);
            return false;
        }
        setBalance(getBalance() - amount);                   // all good: take the money
        System.out.println("Withdrew " + amount + ". New balance: " + getBalance());
        return true;
    }

     // transfer
    @Override
    public boolean transfer(Transaction target, double amount) {
        System.out.println("Transferring " + amount + "...");
        if (withdraw(amount)) {
            target.deposit(amount);
            System.out.println("Transfer successful.");
            return true;
        }
        System.out.println("Transfer failed.");
        return false;
    }

    // overloaded methods
    public void deposit(double amount, String remarks) {
        deposit(amount);
        System.out.println("Remarks: " + remarks);
    }

    public boolean withdraw(double amount, String remarks) {
        boolean result = withdraw(amount);
        System.out.println("Remarks: " + remarks);
        return result;
    }
}