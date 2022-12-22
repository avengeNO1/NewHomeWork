package com.allhomework.oophomework;

/**
 * @author HuAng
 */
public class Test {//父类
    String name = "Rose";
    Test(){
        System.out.println("Test");
    }
    Test(String name){
        this.name = name;
    }
}
class Demo extends Test{
    String name = "jack";
    Demo(){
        super();
        System.out.println("Demo");
    }
    Demo(String s){
       super(s);
    }
    public void test(){
        System.out.println(super.name);
        System.out.println(this.name);
    }
    public static void main(String[] args) {
        new Demo().test();//new Demo();匿名对象

        //调用本类有参构造器，super(s)
        //查找父类的有参构造Test(String name) 初始化父类属性name 为Jone（属性没有动态绑定）
        new Demo("John").test();
    }
}
   