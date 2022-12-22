package com.allhomework.fangfa;

/**
 * @author HuAng
 */
public class HomeWork04 {
    public static void main(String[] args) {
        Cale cale = new Cale(2,-2);
        System.out.println("和 = " + cale.sum());
        System.out.println("差 = " + cale.sub());
        System.out.println("积 = " + cale.mul());
//        double resDiv = cale.div();
//        if (cale.flag){
//            System.out.println("商 = " + cale.div());
//        }
        Double divRes = cale.div();
        if (divRes != null){
            System.out.println("商 = " + cale.div());
        }
    }
}
  /*
    定义一个Cale计算类，在其中定义2个变量表示两个操作数，
    定义4个方法分别求和、差、积、商（除数为0要提示）
    并且创建两个对象，分别测试
     */
class Cale{
    double num1;
    double num2;
    boolean flag = true;
    //加减乘除
    public Cale(double num1,double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public double sum(){//和
        return num1 + num2;
    }
    public double sub(){//差
        return num1 - num2;
    }
    public double mul(){//积
        return num1 * num2;
    }
    public Double div(){//商
//        if (num2 == 0){
//            System.out.println("输入错误，除数不能为0");
//            flag = false;
//            return -1;
//        }else {
//            return num1/num2;
//        }
        if (num2 == 0){
            System.out.println("输入错误，除数不能为0");
            return null;
        }else {
            return num1/num2;
        }
    }
}

   