package com.allhomework.oophomework.transform;

/**
 * @author HuAng
 */
public class HomeWork07 {
    public static void main(String[] args) {
        //向上转型 父类的引用指向子类的对象
        //person的编译类型是Person 运行类型是 Student
        Person person  = new Student();
        person.run();//student run
        person.eat();//person eat


        //向下转型 指向子类对象的父类引用 转换成 指向子类对象的子类引用
        //
        Student student = (Student) person;
        student.run();//student run 动态绑定机制
        student.eat();//person eat
        student.study();//student study

    }
}

   