package com.allhomework.oophomework;

/**
 * @author HuAng
 */
public class Grand {
    String name = "AA ";
    private int age;
    public void g1(){}
}
class Father extends Grand{
    String id = "001";
    private double score;
    public void f1(){
        //super 和 this 可以访问哪些成员
        //super.name; super.g1();
        //this.id;this.score;this.f1(); this.name; this.g1();
    }
}
class Son extends Father{
    String name = "BB";
    public void g1(){}
    private void show(){
        //super 和 this 可以访问哪些成员
        //super.id; super.name; super.g1();super.f1();
        //this.name;this.g1();this.show();this.id;this.f1();
    }
}

   