package com.hillel.zhuravitskiy.homeworks.homework8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] team1 = new int[25];
        int[] team2 = new int[25];
        int sum1 = 0;
        int aat1 = 0;
        int sum2 = 0;
        int aat2 = 0;

        for (int i = 0; i < team1.length ; i++) {
            team1[i] =(int) ((Math.random() *( 40 - 18 + 1)) + 18);
            sum1 = (sum1 + team1[i]) ;
            aat1 = sum1 / team1.length;
        }
        System.out.println("age of players team 1 - " + Arrays.toString(team1));
        System.out.println("Середній вік 1 команди - " + aat1);


        for (int i = 0; i < team2.length ; i++) {
            team2[i] = (int) ((Math.random() *( 40 - 18 + 1)) + 18);
            sum2 = (sum2 + team2[i]) ;
            aat2 = sum2 / team2.length;
        }
        System.out.println("age of players team 2 - " + Arrays.toString(team2));
        System.out.println("Середній вік 2 команди - " + aat2);

    }
}
