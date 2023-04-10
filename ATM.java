// package com.ATM_MACHINE_PROJECT;

public class ATM {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;

    // default constructor
    public ATM() {
        
    }

    // getter and setter function to acces the varible
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getDepositedAmount() {
        return depositAmount;
    }
    public void setDepositedAmount(double depositedAmount) {
        this.depositAmount = depositedAmount;
    }
    public double getWithdrawnAmount() {
        return withdrawAmount;
    }
    public void setWithdrawnAmount(double withdrawnAmount) {
        this.withdrawAmount = withdrawnAmount;
    }
}


