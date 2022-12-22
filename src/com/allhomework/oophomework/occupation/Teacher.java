package com.allhomework.oophomework.occupation;

/**
 * @author HuAng
 */
public class Teacher extends Employee {

    private double classSalary;

    public Teacher(String occ, String name, double daySalary, int workDay) {
        super(occ, name, daySalary, workDay);
    }

    public double getClassSalary() {
        return classSalary;
    }

    public void setClassSalary(double classSalary) {
        this.classSalary = classSalary;
    }

    @Override
    public void printYearSalary() {
        System.out.println("姓名 " + getName() + " 职业 " + getOcc()
                + " 年薪 " + (getDaySalary() * getWorkDay() * 12 + classSalary * getWorkDay()));
    }
}

   