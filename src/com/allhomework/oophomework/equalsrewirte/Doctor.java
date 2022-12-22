package com.allhomework.oophomework.equalsrewirte;

/**
 * @author HuAng
 * 重写equals 方法，只要属性相同就说明对象相同
 *
 */
public class Doctor {
    //属性
    private String name;
    private int age;
    private String job;
    private char gender;
    private double sal;
    //构造器
    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    //重写Object的equals方法

    @Override
    public boolean equals(Object obj) {
        //判断两个对象是否为同一个对象 是则返回true
        if(this == obj){
            return true;
        }
        //判断obj是否为Doctor类型或者是他的子类型 第一种
//        if (obj instanceof Doctor){
//            //向下转型 获得obj的各个属性
//            Doctor doc = (Doctor) obj;
//            return this.age == doc.age && this.gender == doc.gender
//                    && this.job.equals(doc.job) && this.name.equals(doc.name)
//                    && this.sal == doc.sal;
//        }
//        return false;
        //第二种
        if (!(obj instanceof Doctor)){
            return false;
        }
        Doctor doc = (Doctor) obj;
        return this.age == doc.age && this.gender == doc.gender
                    && this.job.equals(doc.job) && this.name.equals(doc.name)
                    && this.sal == doc.sal;
    }
}

   