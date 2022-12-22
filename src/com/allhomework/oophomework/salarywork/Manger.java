package com.allhomework.oophomework.salarywork;

/**
 * @author HuAng
 */
public class Manger extends Employee {
    //奖金
    private double bonus;
    //因为奖金的额度不确定。不在构造器中写
    public Manger(String name, double daySalary, int day, double grade) {
        super(name, daySalary, day, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double inputSalary() {
        return super.inputSalary() * getDay() * getGrade() + getBonus();
    }
}

   