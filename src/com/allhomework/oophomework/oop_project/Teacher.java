package com.allhomework.oophomework.oop_project;

/**
 * @author HuAng
 */
public class Teacher extends Person {//教师类
    //特有属性工龄 work_age
    private int work_age;

    public Teacher(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    @Override
    public String play() {
        return super.play() + "象棋";
    }
    //学习的方法
    public void teach(){
        System.out.println("我承诺会好好教学");
    }
    @Override
    public String toString() {
        return super.toString() +
                "work_age=" + work_age +
                '}'
                ;

    }
}

   