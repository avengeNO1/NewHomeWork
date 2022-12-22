package com.allhomework.oophomework.oop_project;

/**
 * @author HuAng
 */
public class HomeWork08 {
    /*
    1、Student类 有名称 name、 性别 sex、 年龄 age、学号 stu_id、做合理的封装，通过构造器
    在创建对象的时候就将4个属性赋值
    2、Teacher类，有名称 name、 性别 sex、 年龄 age、工龄 work_age，做合理的封装，通过构造器
    在创建对象的时候就将4个属性赋值
    3、抽取共同属性放置在父类Person类中
    4、学生需要有学习的方法（study），在方法中写出“我承诺会好好学习”。
    5、教师需要有教学的方法（teach），在方法中写出“我承诺，我会认真教学”。
    6、学生和教师都有玩的方法（play），学生玩的是足球，老师玩的是象棋，次方法返回的是字符串
    分别返回“xx爱踢足球”，“xx爱下象棋”在父类中定义，子类重写。
    7、定义多态数组，里面保存2个学生和2个教师，要求年龄从高到低排序。
    8、定义方法，形参为Person类型 功能：调用学生的study或教师的teach方法。
     */
    public static void main(String[] args) {
        //1-6的具体体现
//        Teacher teacher = new Teacher("jack", '男', 34, 9);
//        //System.out.println("teacher");//调用toString方法打印
//        System.out.println("老师的信息：");
//        System.out.println("名称: " + teacher.getName());
//        System.out.println("性别: " + teacher.getSex());
//        System.out.println("年龄: " + teacher.getAge());
//        System.out.println("工龄: " + teacher.getWork_age());
//        System.out.println(teacher.play());
//        System.out.println("========================");
//        Student student = new Student("milan", '女', 15, 1001);
//        //System.out.println("teacher");//调用toString方法打印
//        System.out.println("老师的信息：");
//        System.out.println("名称: " + student.getName());
//        System.out.println("性别: " + student.getSex());
//        System.out.println("年龄: " + student.getAge());
//        System.out.println("学号: " + student.getStu_id());
//        System.out.println(student.play());

        //7、定义多态数组，里面保存2个学生和2个教师，要求年龄从高到低排序。
        Person[] person = new Person[4];
        person[0] = new Teacher("jack", '男', 34, 9);
        person[1] = new Teacher("张杰", '男', 45, 20);
        person[2] = new Student("milan", '男', 15, "1001");
        person[3] = new Student("marry", '女', 13, "2020");


//        //冒泡
//
//        for(int i = 0; i < person.length - 1; i++){//外层
//            for (int j = 0; j < person.length - 1 - i; j++){//内层
//                Person temp = null;
//                if (person[j].getAge() < person[j +1].getAge()){
//                    temp = person[j];
//                    person[j] = person[j + 1];
//                    person[j + 1] = temp;
//                }
//            }
//        }
//        for(int i = 0; i < person.length; i++){
//
//            System.out.println(person[i].toString());
//        }

        //创建对象
        HomeWork08 homeWork08 = new HomeWork08();
        homeWork08.bubbleSort(person);
        //输出
        for(int i = 0; i < person.length; i++){
            System.out.println(person[i].toString());
        }
        for(int i = 0; i < person.length; i++){
            homeWork08.test(person[i]);
        }
    }

    //方法 完成年龄从高到低排序
    public void bubbleSort(Person[] person){
        Person temp = null;
        for(int i = 0; i < person.length - 1; i++){//外层
            for (int j = 0; j < person.length - 1 - i; j++){//内层
                if (person[j].getAge() < person[j +1].getAge()){
                    temp = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = temp;
                }
            }
        }
    }
    //  8、定义方法，形象为Person类型 功能：调用学生的study或教师的teach方法。
    public void test(Person person){
        if (person instanceof Student){
            ((Student) person).study();
        }else if (person instanceof Teacher){
            ((Teacher) person).teach();
        }else {

        }
    }
}

   