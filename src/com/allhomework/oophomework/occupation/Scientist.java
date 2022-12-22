package com.allhomework.oophomework.occupation;

/**
 * @author HuAng
 */
public class Scientist extends Employee {

    private double yearBonus;

    public Scientist(String occ, String name, double daySalary, int workDay) {
        super(occ, name, daySalary, workDay);
    }

    public double getYearBonus() {
        return yearBonus;
    }

    public void setYearBonus(double yearBonus) {
        this.yearBonus = yearBonus;
    }
    public void printYearSalary(){
        System.out.println("姓名 " + getName() + " 职业 " + getOcc()
                + " 年薪 " + (getDaySalary() * getWorkDay() * 12 + yearBonus));
    }
}

   