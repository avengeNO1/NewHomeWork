package com.allhomework.oophomework.oop_project;

/**
 * @author HuAng
 */
public class Person {//父类
    //共同属性名称 name、 性别 sex、 年龄 age
    private String name;
    private char sex;
    private int age;

    //构造器
    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String play(){//玩的方法
        return name + "在玩";
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age
                ;
    }
}

   