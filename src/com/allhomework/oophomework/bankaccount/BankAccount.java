package com.allhomework.oophomework.bankaccount;

/**
 * @author HuAng
 */
public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount){//存
        balance += amount;
    }
    public void withdraw(double amount){//取
        balance -= amount;
    }
}

   