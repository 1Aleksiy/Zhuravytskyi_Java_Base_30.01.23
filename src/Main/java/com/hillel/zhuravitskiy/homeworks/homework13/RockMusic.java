package com.hillel.zhuravitskiy.homeworks.homework13;

public class RockMusic extends MusicStyles{
  String name;

    public RockMusic(String name) {
        this.name = name;
        System.out.println("RockMusic group - " + name);
    }

    @Override
    void playMusic() {
        System.out.println("RockMusic - playMusic");

    }
}
