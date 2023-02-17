package com.allhomework.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author HuAng
 */
public class ArraysHomeWork {
    /*
        自定义Book类 里面包含name和price按照price排序（从大到小），
        要求用两种方式排序 有一个Book[] books = 4 本书对象
        使用传递实现Comparator接口匿名内部类，也称为定制排序
        Book[] books = new Book[4];
     */
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦", 100);
        books[1] = new Book("新金瓶梅", 90);
        books[2] = new Book("青年文摘20版", 5);
        books[3] = new Book("java从入门到放弃", 300);

        //1.price 从大到小
//        Arrays.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                Book book1 =  (Book) o1;
//                Book book2 =  (Book) o2;
//                double i =  book2.getPrice() - book1.getPrice();
//                //进行转换
//                if (i > 0){
//                    return 1;
//                }else if (i < 0){
//                    return -1;
//                }else {
//                    return 0;
//                }
//            }
//        });
        //2.price 从小到大
//        Arrays.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                Book book1 =  (Book) o1;
//                Book book2 =  (Book) o2;
//                double i =  book2.getPrice() - book1.getPrice();
//                //进行转换
//                if (i > 0){
//                    return -1;
//                }else if (i < 0){
//                    return 1;
//                }else {
//                    return 0;
//                }
//            }
//        });
        //3.name 从长到短
        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                Book book1 = (Book) o1;
                Book book2 = (Book) o2;
                return book2.getName().length() - book1.getName().length();
            }
        });
        System.out.println(Arrays.toString(books));
    }
}

class Book {
    private String name;
    private double price;

    public Book() {
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
   