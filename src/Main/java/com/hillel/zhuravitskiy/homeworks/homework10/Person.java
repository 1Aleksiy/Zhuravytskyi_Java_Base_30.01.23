package com.hillel.zhuravitskiy.homeworks.homework10;

public class Person {
    public static void main(String[] args) {
        personInfo("Alex ","Karom","Odessa","0962352140");
        personInfo("Den ","Taerony","Lvov","0672562159");
        personInfo("Ben ","Bentli","Kiev","0532859141");
    }
    static void personInfo(String name, String surname, String city, String tel){
        System.out.println("Зателефонувати громадянину " +name +surname+" із міста "+city+" ТЕЛЕФОН " +tel );
    }







}
