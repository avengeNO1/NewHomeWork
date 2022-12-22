package com.allhomework.oophomework.salarywork;

/**
 * @author HuAng
 */
public class Worker extends Employee {
    public Worker(String name, double daySalary, int day, double grade) {
        super(name, daySalary, day, grade);
    }

    @Override
    public double inputSalary() {
        return super.inputSalary() * getDay() * getGrade();
    }
}

   