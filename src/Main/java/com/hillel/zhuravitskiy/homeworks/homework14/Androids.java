package com.hillel.zhuravitskiy.homeworks.homework14;

public class Androids implements Smartphones,LinuxOS{
    @Override
    public void call() {
        System.out.println("Androids call");
    }

    @Override
    public void sms() {
        System.out.println("Androids sms");

    }

    @Override
    public void internet() {
        System.out.println("Androids internet");

    }

    @Override
    public void operatingSystem() {
        System.out.println("Operating System");
    }
}
