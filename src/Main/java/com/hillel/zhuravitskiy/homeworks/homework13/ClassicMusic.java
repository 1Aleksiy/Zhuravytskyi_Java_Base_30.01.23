package com.hillel.zhuravitskiy.homeworks.homework13;

public class ClassicMusic extends MusicStyles{
    String name;

    public ClassicMusic(String name) {
        this.name = name;
        System.out.println("ClassicMusic group - " + name);
    }

    @Override
    void playMusic() {
        System.out.println("ClassicMusic - playMusic");
    }
}
