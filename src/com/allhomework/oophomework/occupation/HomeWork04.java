package com.allhomework.oophomework.occupation;

/**
 * @author HuAng
 *父类 员工类
 * 子类 工人 农民 教师 科学家
 * 1.工人 农民 只有基本工资
 * 2.教师除了基本工资 还有课酬（元/天）
 * 3.科学家除了基本工资 还有年终奖
 * 4.HomeWork04将各类型的员工全年工资打印出来
 *
 *
 */
public class HomeWork04 {
    public static void main(String[] args) {
        Worker worker = new Worker("工人", "jack", 180, 26);
        Peasant peasant = new Peasant("农民", "marry", 100, 28);
        Teacher teacher = new Teacher("教师", "林一", 300, 22);
        teacher.setClassSalary(50);
        Scientist scientist = new Scientist("科学家", "dave", 500, 22);
        scientist.setYearBonus(20000);
        worker.printYearSalary();
        peasant.printYearSalary();
        teacher.printYearSalary();
        scientist.printYearSalary();
    }
}

   