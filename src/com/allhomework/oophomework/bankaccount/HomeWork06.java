package com.allhomework.oophomework.bankaccount;

/**
 * @author HuAng
 */
public class HomeWork06 {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(1000);//1000+1000-1 =1999
//
//        checkingAccount.withdraw(100);//1999-100-1 = 1898
//        System.out.println(checkingAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());//在免手续费的前提存三次 1300
        savingsAccount.deposit(100);//需要手续费
        System.out.println(savingsAccount.getBalance());//1399
        savingsAccount.earnMonthlyInterest();//重置count 计算利息
        System.out.println(savingsAccount.getBalance());//1412.99
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());//1512.99 免手续

    }
}

   