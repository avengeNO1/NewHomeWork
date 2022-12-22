package com.allhomework.oophomework.salarywork;

/**
 * @author HuAng
 *
 * 父类 员工类
 * 子类 部门经理 普通员工
 * 1.经理工资 = 1000+单日工资  * 天数 * 等级（1.2） 1000为奖金
 * 2.普通员工工资 = 单日工资 * 天数 * 等级（1.0）
 * 3.员工属性： 姓名 单日工资 工作天数
 * 4.员工方法 打印工资
 * 5.普通员工和经理都是员工子类 需要重写打印工资的方法
 * 6.定义并初始化普通员工对象，调用打印方法输入工资 定义并初始化经理对象，调用打印方法输入工资
 */
public class HomeWork03 {
    public static void main(String[] args) {
        Worker jack = new Worker("jack", 200, 24, 1.0);
        System.out.println("员工jack的工资是：" + jack.inputSalary());

        Manger mark = new Manger("mark", 400, 24, 1.2);
        mark.setBonus(300000);
        System.out.println("经理mark的工资是：" + mark.inputSalary() );
    }
}

   