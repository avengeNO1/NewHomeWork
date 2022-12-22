package com.allhomework.oophomework.bankaccount;

/**
 * @author HuAng
 */
public class SavingsAccount extends BankAccount {
    private int count = 3;//三次免手续费
    private double rate = 0.01;//利率

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    //有三次免手续费
    @Override
    public void deposit(double amount) {//重写存的方法
        if (count > 0){
            super.deposit(amount);
        }else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {//重写取的方法
        if (count > 0){
            super.deposit(amount);
        }else {
            super.deposit(amount + 1);
        }
        count--;
    }
    //月初重置count 和计算利息
    public void earnMonthlyInterest(){
        count = 3;
        super.deposit(getBalance() * rate);
    }
}

   