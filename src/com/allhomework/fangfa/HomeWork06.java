package com.allhomework.fangfa;

/**
 * @author HuAng
 */
public class HomeWork06 {
    public static void main(String[] args) {

    }
}
/*
    创建一个Employee类
    属性（名字 性别 年龄 职位 薪水）
    提供三个构造方法，可以初始化
    1、（名字 性别 年龄 职位 薪水）
    2、（名字 性别 年龄）
    3、（ 职位 薪水）
    要求充分复用构造器
 */
class Employee{
    String name;
    char sex;
    int age;
    String job;
    double salary;
    //要求充分复用构造器 先写属性少的
    public Employee(String job, double salary){
        this.job = job;
        this.salary = salary;
    }
    //  2、（名字 性别 年龄）
    public Employee(String name, char sex,  int age){
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    //名字 性别 年龄 职位 薪水
    public Employee(String name, char sex,  int age, String job, double salary){
        this(name,sex,age);//在构造器中调用其他构造器，置于行首
        //this(job,salary);//错误 对this的调用必须是构造器中的第一个语句
        this.job = job;
        this.salary = salary;
    }
}
   