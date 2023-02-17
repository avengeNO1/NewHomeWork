package com.allhomework.class_homework.homewok02;

/**
 * @author HuAng
 */
public class Factory {
    // 3.创建交通工具工厂类，有两个方法分别获得交通工具Horse和Boat
    //将方法 static
    //因为始终都是同一匹马
    private static Horse horse = new Horse();

    public Factory() {

    }

    public static Horse getHorse(){
     //   return new Horse();
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
}

   