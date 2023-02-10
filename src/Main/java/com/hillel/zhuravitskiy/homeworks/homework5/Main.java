package com.hillel.zhuravitskiy.homeworks.homework5;

public class Main {
    public static void main(String[] args) {
//За владу в стародавньому Китаї боролися дві династії: Лі та Мінь.
//
//З кожного боку боролися 3 типи воїнів з такими показниками атаки:
//
//Лі:
//
//воїн - 13
//лучник - 24
//вершник - 46
//
//
//Мінь:
//
//воїн - 9
//лучник - 35
//вершник - 12
//Розрахувати: загальний показник атаки для обох династій, якщо відомо, що воїнів династії Лі кожного типу було 860, а кількість воїнів династії Мінь кожного типу в півтора рази більша.
//
//Вивести в консоль значення загальної атаки кожної армії;


        int Li_warrior = 13;
        int Li_archer = 24;
        int Li_rider = 46;

        int Li_people = 860;
        int Li_attack = Li_people * ( Li_warrior + Li_archer + Li_rider );
        System.out.println("Загальна атака воїнів династії Li - " + Li_attack);

        int Min_warrior = 9;
        int Min_archer = 35;
        int Min_rider = 12;
        double Min_people = Li_people * 1.5;
        double Min_attack = Min_people * ( Min_warrior + Min_archer + Min_rider );
        System.out.println("Загальна атака воїнів династії Min - " + Min_attack);

        System.out.println();
        System.out.println();
        System.out.println();






    }
}
