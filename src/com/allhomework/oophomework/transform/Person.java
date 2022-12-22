package com.allhomework.oophomework.transform;

/**
 *向下转型和向上转型
 */
public class Person {
    public void run(){
        System.out.println("person run");
    }
    public void eat(){
        System.out.println("person eat");
    }
}
class Student extends Person{
    @Override
    public void run() {
        System.out.println("student run");
    }

    public void study(){
        System.out.println("student study");
    }

}

   