package com.hillel.zhuravitskiy.homeworks.homework5;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість воїнів");

        String str = scanner.next();
        System.out.println();


        int Li_warrior = 13;
        int Li_archer = 24;
        int Li_rider = 46;

        int Li_people = Integer.parseInt(str);
        int Li_attack = Li_people * (Li_warrior + Li_archer + Li_rider);
        System.out.println("Загальна атака воїнів династії Li - " + Li_attack);

        int Min_warrior = 9;
        int Min_archer = 35;
        int Min_rider = 12;
        double Min_people = Li_people * 1.5;
        double Min_attack = Min_people * (Min_warrior + Min_archer + Min_rider);
        System.out.println("Загальна атака воїнів династії Min - " + Min_attack);




    }
}