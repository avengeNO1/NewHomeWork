package com.allhomework.fangfa;

/**
 * @author HuAng
 */
public class HomeWork07 {
    public static void main(String[] args) {
        Circle01 c = new Circle01();
        PassObject p = new PassObject();
        p.printAreas(c,5);
    }
}
/*
    将对象作为参数传递给方法
    1、定义一个Circle01类，包含一个double类型的radius属性代表圆的半径
        findArea()方法返回圆的面积
    2、定义类PassObject，在类中定义一个方法printAreas()，该方法的定义
        public void printAreas(Circle c, int times)//方法签名
    3、在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积
        例如 times为5 则输出半径1,2,3,4,5以及对应的圆面积
    4、在main方法中调用printArea()方法，调用完毕后输出当前半径值。ll
 */
class Circle01{
    double radius;
//    public Circle01(){}
//    public Circle01(double radius){
//       this.radius = radius;
//   }
    public double findArea(){//返回面积
        return Math.PI*radius*radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
}
class PassObject{
    public void printAreas(Circle01 c, int times){
        //在printAreas方法中打印输出1到times之间的每个整数半径值，以及对应的面积
        System.out.println("半径\t面积");
        for (int i = 1; i <= times; i++ ){//i为半径值
            c.setRadius(i);//修改c 对象的半径值
            System.out.println(i+"\t\t"+c.findArea());//半径和面积
        }
    }
}