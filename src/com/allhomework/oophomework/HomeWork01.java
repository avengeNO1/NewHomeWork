package com.allhomework.oophomework;

/**
 * @author HuAng
 * 定义一个Person类{name,age,job},初始化Person对象数组，
 * 有3个person对象，并且按照age从大到小进行排序，使用冒泡排序。
 */
public class HomeWork01 {
    public static void main(String[] args) {
        //有3个person对象数组
        Person[] person = new Person[3];
        person[0] = new Person("张翰小明", 20, "工程师");
        person[1] = new Person("张杰", 32, "经理");
        person[2] = new Person("李云龙", 48, "董事长");

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
        //使用冒泡排序
        Person temp = null;
        //按照年龄 从小到大
        for (int i = 0; i < person.length - 1; i++) {//外层循环
            for (int j = 0; j < person.length - 1 - i; j++) {//内层循环
                if (person[j].getAge() < person[j + 1].getAge()) {
                    temp = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] =  temp;
                }
            }
        }
        //按照名字的长度
//        for (int i = 0; i < person.length - 1; i++) {//外层循环
//            for (int j = 0; j < person.length - 1 - i; j++) {//内层循环
//                if (person[j].getName().length() < person[j + 1].getName().length()) {
//                    temp = person[j];
//                    person[j] = person[j + 1];
//                    person[j + 1] =  temp;
//                }
//            }
//        }
        System.out.println("=====按照年龄排序=====");
        for (int i = 0; i < person.length; i++){
            System.out.println(person[i]);
        }
    }
}
class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}