package com.joysistvi.day26.activity;

public interface Transaction {
    void deposit(double amount);        // put money in
    boolean withdraw(double amount);    // take money out (true = worked, false = failed)
}
