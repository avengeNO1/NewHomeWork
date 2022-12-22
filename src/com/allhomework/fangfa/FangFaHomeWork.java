package com.allhomework.fangfa;

/**
 * @author HuAng
 */
public class FangFaHomeWork {
    //9 - 16 A01
//    public static void main(String[] args) {
//        double[] num = {1.3, 32.2, 12.5, 10.2};
//        A01 a = new A01();
//        Double res = a.max(num);
//        if (res != null){
//            System.out.println("num数组中的最大值="+a.max(num));
//        }else{
//            System.out.println("输入有误");
//        }
//    }

   // A02
//public static void main(String[] args) {
//    String [] num = {"张杰","Tom","Marry"};
//    A02 a02 = new A02();
//    int index = a02.find("jj",num);//存元素下标
//    System.out.println(index);
//    }

   // Book
    public static void main(String[] args) {
        Book book = new Book("笑傲江湖",300);
        book.info();
        book.updatePrice();
        book.info();//更新后的信息
    }
}

/*
求double 数组的最大值max
max方法 确定
返回类型 double 改成 Double
方法名 max()
形参列表 double [] num
先实现功能再健壮代码
化繁为简
 */

//class A01{
//
//    public Double max(double[] num){//返回一个包装类Double
//        if (num != null && num.length > 0 ){//先保证并不为null 在规定至少有一个元素
//            double max = num[0];
//            for (int i = 1; i < num.length; i++){
//                if (max < num[i]){
//                    max = num[i];
//                }
//            }
//            return max;
//        }else {
//            return null;
//        }
//    }
//}
/*
     定义方法find 查找字符串数组的元素，
     并返回索引，找不到 返回-1
    返回类型 int
    方法名 find()
    形参列表 (String,String [])
    先实现功能再健壮代码
    化繁为简
 */
//class A02{
//    public int find(String findStr,String[] num){
//
//        for (int i = 0; i < num.length; i++){
//            if (findStr.equals(num[i])){
//                return i;
//            }
//        }
//        return -1;
//    }
//}
/*
     定义方法updatePrice 更改书本价格，
     如果价格 > 150,改价150 价格 > 100 改价100
     否则不变。
    返回类型 void
    方法名 updatePrice()
    形参列表 ()
    构造器
    先实现功能再健壮代码
    化繁为简
 */
class Book{
    String bookName;
    double price;
    public Book(String bookName,double price){
        this.bookName = bookName;
        this.price = price;
    }
    public void updatePrice(){
        if (this.price > 150){
            this.price = 150;
        }else if (this.price > 100 ){
            this.price = 100;
        }
    }
    //显示书籍信息
    public void info(){
        System.out.println("书名"+this.bookName+"价格"+this.price);
    }
}


   