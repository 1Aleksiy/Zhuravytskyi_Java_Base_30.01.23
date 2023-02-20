package com.hillel.zhuravitskiy.homeworks.homework7;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 11);
        System.out.println();

        int timer = 3;
        while (timer >=0) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("guess the number from 0 to 10 ");
            int number = 0;
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                System.out.println("number  " + number);
                if (number > random){
                    System.out.println("вашее число більше загаданого");
                }
                if (number < random){
                    System.out.println("ваше число менше загаданого");
                }

                if (number== random){
                    System.out.println("ти вгадав ");

                break;}

                timer--;
                if (timer==-1){
                System.out.println(" ти програв " );
                }

            } else {
                System.out.println("Incorrect");

            }

        }


    }
}
