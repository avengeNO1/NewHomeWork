package com.allhomework.oophomework.homeworkteacher;

/**
 * @author HuAng
 * 1.要求有属性 name age post salary
 * 2.编写业务方法 introduce() 实现输出一个教师的信息
 * 3.编写教师类的三个子类 教授 副教授 讲师
 * 工资级别：教授 1.3 副教授 1.2 讲师 1.1三个子类都重写父类的introduce()方法
 * 4.定义并初始化一个老师对象，调用业务方法，实现对象基本信息的后台打印
 */
public class HomeWork02 {
    public static void main(String[] args) {

        Professor jack = new Professor("jack", 45, "教授",30000,1.3);
        jack.introduce();
        AssProfessor mark = new AssProfessor("mark", 35, "教授",20000,1.2);
        mark.introduce();
        Lecturer marry = new Lecturer("marry",28, "讲师",15000,1.1);
        marry.introduce();




    }
}

   