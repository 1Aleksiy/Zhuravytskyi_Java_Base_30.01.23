package com.hillel.zhuravitskiy.homeworks.homework13;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MusicStyles> groups = List.of(
         new PopMusic("Ninety"),
         new RockMusic("Queens"),
         new ClassicMusic("Symphony")
                );
        groups.forEach(MusicStyles -> {

            MusicStyles.playMusic();


        });



    }


}
