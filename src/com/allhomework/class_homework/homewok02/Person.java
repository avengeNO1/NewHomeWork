package com.allhomework.class_homework.homewok02;

/**
 * @author HuAng
 */
public class Person {
    //4.有Person类，有name和Vehicles属性，在构造器中为两个属性赋值
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    //5.实例化Person对象“唐僧”，要求一般情况下用Horse作为交通工具，遇到大河时用Boat作为交通工具
    public void passRiver(){
        //判断一下当前的属性是否存在,如果为空，就获得一艘船
//        Boat boat = Factory.getBoat();
//        boat.work();
        //
       // if (vehicles == null){
        if (!(vehicles instanceof Boat)){
            vehicles = Factory.getBoat();
        }
        vehicles.work();
    }
    public void common(){
        //vehicles instanceof Horse 判断当前的vehicles 是不是horse
        //1.vehicles  = null   vehicles instanceof Horse =》false
        //2.vehicles  = 马对象  vehicles instanceof Horse =》true
        //3.vehicles  = 船对象   vehicles instanceof Boat =》false

        if (!(vehicles instanceof Horse)){
            vehicles = Factory.getHorse();
        }
        vehicles.work();
    }
}

   