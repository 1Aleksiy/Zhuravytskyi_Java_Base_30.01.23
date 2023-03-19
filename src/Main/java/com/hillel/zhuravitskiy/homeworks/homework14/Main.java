package com.hillel.zhuravitskiy.homeworks.homework14;

public class Main {
    public static void main(String[] args) {


        Androids androids = new Androids();
        androids.call();
        androids.sms();
        androids.internet();
        androids.operatingSystem();
        System.out.println();

        IPhones iPhones = new IPhones();
        iPhones.call();
        iPhones.sms();
        iPhones.internet();
        iPhones.operatingSystem();
    }

}
