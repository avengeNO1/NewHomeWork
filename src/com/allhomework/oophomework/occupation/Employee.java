package com.allhomework.oophomework.occupation;

/**
 * @author HuAng
 */
public class Employee {
    private String occ;
    private String name;
    private double daySalary;
    private int workDay;

    public Employee(String occ, String name, double daySalary, int workDay) {
        this.occ = occ;
        this.name = name;
        this.daySalary = daySalary;
        this.workDay = workDay;
    }

    public String getOcc() {
        return occ;
    }

    public void setOcc(String occ) {
        this.occ = occ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaySalary() {
        return daySalary;
    }

    public void setDaySalary(double daySalary) {
        this.daySalary = daySalary;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }
    public void printYearSalary(){
        System.out.println("姓名 " + name + " 职业 " + occ + " 年薪 " + daySalary * workDay * 12);
    }
}

   