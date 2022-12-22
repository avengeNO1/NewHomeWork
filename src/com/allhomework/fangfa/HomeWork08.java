package com.allhomework.fangfa;

import java.util.Random;
import java.util.Scanner;

/**
 * @author HuAng
 */
public class HomeWork08 {
    public static void main(String[] args) {
        int count = 0;
        while (true){
            System.out.println("请输入石头剪刀布");
            Scanner scanner = new Scanner(System.in);
            int player = scanner.nextInt();//0     1     2
            Random random = new Random();
            int num = random.nextInt(3);

            switch (player){
                case 0:
                    System.out.println("你出的是\n石头");
                    break;
                case 1:
                    System.out.println("你出的是\n剪刀");
                    break;
                case 2:
                    System.out.println("你出的是\n布");
                    break;
                default:
                    break;
            }
            switch (num){
                case 0:
                    System.out.println("电脑出\n石头");
                    break;
                case 1:
                    System.out.println("电脑出\n剪刀");
                    break;
                case 2:
                    System.out.println("电脑出\n布");
                    break;
                default:
                    break;
            }
           if(player >=0 && player<= 2){
               if (player == 0 && num == 1){ //石头 剪刀
                   System.out.println("恭喜你赢得比赛");
                   count++;
               }else if (player == 1 && num == 2){//剪刀 布
                   System.out.println("恭喜你赢得比赛");
                   count++;
               }else if (player == 2 && num == 0){//布 石头
                   System.out.println("恭喜你赢得比赛");
                   count++;
               }else{
                   System.out.println("不好意思，输了");
               }
           }else{
               System.out.println("输入错误 ，请重新输入");
           }

        }
       // System.out.println("一共赢了"+count);
    }

}
/*
  猜拳游戏
  电脑随机生成0     1     2
  分别表示   石头  剪刀   布
  显示人赢得次数
 */


   