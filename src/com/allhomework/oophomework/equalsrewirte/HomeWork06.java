package com.allhomework.oophomework.equalsrewirte;

/**
 * @author HuAng
 */
public class HomeWork06 {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("milan", 34, "神经外科", '男', 20000);
        Doctor doctor2 = new Doctor("milan", 34, "神经外科", '男', 20000);
        System.out.println(doctor1.equals(doctor2));
    }
}

   