package com.hillel.zhuravitskiy.homeworks.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter the name of the first team");
        String name1 = scanner.next();
        System.out.println("first team  - " + name1);

        System.out.println("Please enter number 1 frag");
        int number1_1 = -1;
        if (scanner.hasNextInt()) {
            number1_1 = scanner.nextInt();
            System.out.println("1 number  " + number1_1);
        } else {
            System.out.println("Incorrect");
            System.exit(  0 );
        }
        int number1_2 = -1;
        System.out.println("Please enter number 2 frag");
        if (scanner.hasNextInt()) {
             number1_2 = scanner.nextInt();
            System.out.println("2 number  " + number1_2);
        } else {
            System.out.println("Incorrect");
            System.exit(  0 );
        }
        int number1_3 = -1;
        System.out.println("Please enter number 3 frag");
        if (scanner.hasNextInt()) {
             number1_3 = scanner.nextInt();
            System.out.println("3 number  " + number1_3);
        } else {
            System.out.println("Incorrect");
            System.exit(  0 );
        }
        int number1_4 = -1;
        System.out.println("Please enter number 4 frag");
        if (scanner.hasNextInt()) {
            number1_4 = scanner.nextInt();
            System.out.println("4 number  " + number1_4);
        } else {
            System.out.println("Incorrect");
            System.exit(  0 );
        }
        int number1_5 = -1;
        System.out.println("Please enter number 5 frag");
        if (scanner.hasNextInt()) {
             number1_5 = scanner.nextInt();
            System.out.println("5 number  " + number1_5);
        } else {
            System.out.println("Incorrect");
            System.exit(  0 );
        }


       int GPA1 =(number1_1 + number1_2+ number1_3 + number1_4 +  number1_5) /5 ;
        System.out.println("Середне арафметичне 1 команди  - " + GPA1);
        System.out.println();








        System.out.println("Please enter the name of the second team");
        String name2 = scanner.next();
        System.out.println("second team  - " + name2);

        System.out.println("Please enter number 1 frag");
        int number2_1 = -1;
        if (scanner.hasNextInt()) {
            number2_1 = scanner.nextInt();
            System.out.println("1 number  " + number2_1);
        } else {
            System.out.println("Incorrect");
            System.exit(  0 );
        }

        System.out.println("Please enter number 2 frag");
        int number2_2 = -1;
        if (scanner.hasNextInt()) {
            number2_2 = scanner.nextInt();
            System.out.println("2 number  " + number2_2);
        } else {
            System.out.println("Incorrect");
            System.exit(  0 );
        }

        System.out.println("Please enter number 3 frag");
        int number2_3 = -1;
        if (scanner.hasNextInt()) {
            number2_3 = scanner.nextInt();
            System.out.println("3 number  " + number2_3);
        } else {
            System.out.println("Incorrect");
            System.exit(  0 );
        }

        System.out.println("Please enter number 4 frag");
        int number2_4 = -1;
        if (scanner.hasNextInt()) {
            number2_4 = scanner.nextInt();
            System.out.println("4 number  " + number2_4);
        } else {
            System.out.println("Incorrect");
            System.exit(  0 );
        }

        System.out.println("Please enter number 5 frag");
        int number2_5 = -1;
        if (scanner.hasNextInt()) {
             number2_5 = scanner.nextInt();
            System.out.println("5 number  " + number2_5);
        } else {
            System.out.println("Incorrect");
            System.exit(  0 );
        }

        int GPA2 =(number2_1 + number2_2+ number2_3 + number2_4 +  number2_5) /5 ;
        System.out.println("Середне арафметичне 2 команди  - " + GPA2);


        if (GPA1>GPA2){
            System.out.println("Перемогла команда " + name1 +  " набрала - " + GPA1 +  " очків" );
        }
        else if (GPA1==GPA2) {
            System.out.println("Нічія - "+ name2 +" набрала  - "+ GPA2 + " очків "+ name1 +" набрала - "+ GPA1 +" очків");
        }
         else {
            System.out.println("Перемогла команда " + name2 + " набрала  - " + GPA2 + " очків");
      }



    }

    }


