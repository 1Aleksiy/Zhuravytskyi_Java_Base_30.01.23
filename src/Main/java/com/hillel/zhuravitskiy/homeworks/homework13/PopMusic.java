package com.hillel.zhuravitskiy.homeworks.homework13;

public class PopMusic extends MusicStyles {
    String name;

     PopMusic(String name) {
        this.name = name;
         System.out.println("PopMusic group - " + name);
    }

    @Override
    void playMusic() {
        System.out.println("PopMusic-playMusic");



    }
}
