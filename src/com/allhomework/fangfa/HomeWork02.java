package com.allhomework.fangfa;

/**
 * @author HuAng
 */
public class HomeWork02 {
    public static void main(String[] args) {
        int[] oldArr = {1,2,3};
        A03 a03 = new A03();
        int[] newArr = a03.copyArr(oldArr);
        System.out.println("旧数组 ");
        for (int i = 0; i < oldArr.length; i++){
            System.out.print(oldArr[i]+"\t");
        }
        System.out.println("\n新数组 ");
        for (int i = 0; i < newArr.length; i++){
            System.out.print(newArr[i]+"\t");
        }

    }
}
/*
实现数组复制功能
输入旧数组，返回一个新数组，元素和旧数组一样(假设int 类型数组)
  返回类型 int
    方法名 copyArr()
    形参列表 ()
    先实现功能再健壮代码
    化繁为简
 */
class A03{
    public int[] copyArr(int[] oldArr){
        //创建相同长度的newArr数组
        int[] newArr = new int[oldArr.length];
        for (int i = 0; i < oldArr.length; i++){//遍历数组oldArr拷贝元素到新数组(赋值)
            newArr[i] = oldArr[i];
        }
        return newArr;
    }
}

   