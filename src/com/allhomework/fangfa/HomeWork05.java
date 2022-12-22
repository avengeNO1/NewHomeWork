package com.allhomework.fangfa;

/**
 * @author HuAng
 */
public class HomeWork05 {
    public static void main(String[] args) {
        Music music = new Music("hhh",300);
        music.play();
        System.out.println(music.getInfo());
    }
}
/*
   定义Music类
   属性 音乐名 name 时长times

   有播放功能play和返回本身属性信息的功能方法getInfo
 */
class Music{
    String name;
    int times;
    public  Music(String name,int times){
        this.name = name;
        this.times = times;
    }
    public void play(){
        System.out.println("音乐名"+name+"音乐时长"+times);
    }
    public String getInfo(){
        return "音乐"+name+"音乐时长"+times;
    }
}
