package com.allhomework.oophomework.bankaccount;

/**
 * @author HuAng
 */
public class CheckingAccount extends BankAccount {//新账号
    //属性

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {//存
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) {//取
        super.withdraw(amount + 1);
    }
}

   