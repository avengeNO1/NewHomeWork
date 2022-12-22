package com.allhomework.class_homework;

/**
 * @author HuAng
 */
public class HomeWork01 {
    public static void main(String[] args) {
        Cellphone cellphone = new Cellphone();
        cellphone.testWork(new Calculator() {
            @Override
            public double work(double n1, double n2) {
                return n1 + n2;
            }
        },2,4);
    }
}
/*
 1.计算器接口具有work方法，功能是运算，有一个手机类Cellphone，定义方法testWork
   测试计算功能，调用计算接口的work方法
 2.要求调用Cellphone对象的testWork方法，使用匿名内部类

 */
interface Calculator{//计算器类
    //计算方法 work
    public double work(double n1,double n2);
}
class Cellphone  {
    //当调用testWork方法时，直接传入一个实现了Calculator接口的匿名内部类
    //至于怎么完成计算 由匿名内部类进行
    public void testWork(Calculator calculator,double n1, double n2){
        double result = calculator.work(n1, n2);
        System.out.println("计算机运算的结果是：" + result);
    }
}

   