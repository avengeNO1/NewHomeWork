package com.allhomework.oophomework.salarywork;

/**
 * @author HuAng
 */
public class Employee {//员工类

    private String name;
    private double daySalary;
    private int day;
    private double grade;

    //构造器 getter setter 成员方法
    public Employee(String name, double daySalary, int day, double grade) {
        this.name = name;
        this.daySalary = daySalary;
        this.day = day;
        this.grade = grade;
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

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    //inputSalary()输出工资的方法
    public double inputSalary(){
        return daySalary;
    }
}

   