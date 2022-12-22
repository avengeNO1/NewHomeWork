package com.allhomework.fangfa;
/**
 * @author HuAng
 */
public class HomeWork03 {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println("面积 = "+circle.area());
        System.out.println("周长 = "+circle.girth());
    }
}
/*
    定义一个圆类Circle 属性 半径radius
    提供显示圆周周长的方法，提供显示圆面积area的方法

     返回类型 double
     方法名 girth()
     形参列表 ()
     先实现功能再健壮代码
     化繁为简 */
class Circle{
    double radius;
    public Circle(double radius){//构造器 初始化radius
        this.radius = radius;
    }
    public double girth(){
        return 2 * Math.PI * radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
}
   