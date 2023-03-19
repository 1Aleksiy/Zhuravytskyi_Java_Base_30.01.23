package com.hillel.zhuravitskiy.homeworks.homework14;

public class IPhones implements Smartphones,IOS{
    @Override
    public void call() {
        System.out.println("IPhones call");

    }

    @Override
    public void sms() {
        System.out.println("IPhones sms");

    }

    @Override
    public void internet() {
        System.out.println("IPhones internet");


    }

    @Override
    public void operatingSystem() {
        System.out.println("Operating System");
    }
}
