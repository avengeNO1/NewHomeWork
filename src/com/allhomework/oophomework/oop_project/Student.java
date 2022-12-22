package com.allhomework.oophomework.oop_project;

/**
 * @author HuAng
 */
public class Student extends Person{//学生类
    //特有属性 学号 stu_id
    private String stu_id;

    public Student(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    @Override
    public String play() {
        return super.play() + "足球 ";
    }
    //学习的方法
    public void study(){
        System.out.println("我承诺会好好学习");
    }

    @Override
    public String toString() {
        return super.toString() +
                "stu_id=" + stu_id +
                '}'
             ;
    }
}

   