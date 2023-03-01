package com.hillel.zhuravitskiy.homeworks.homework9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість строк");
        int n = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                System.out.println(n);
                break;
            } else {
                System.out.println("Wrong data!");
                scanner.nextLine();
            }
        }
        System.out.println("Введіть кількість стовбців");
        int m = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                m = scanner.nextInt();
                System.out.println(m);
                break;
            } else {
                System.out.println("Wrong data!");
                scanner.nextLine();
            }
        }
        int[][] array1 = new int[n][m];
        int[][] array2 = new int[m][n];

        int rows = n;
        int columns = m;
        Random random = new Random();
        IntStream.range(0, rows)
                .forEach(row -> IntStream.range(0, columns)
                        .forEach(column -> array1[row][column] = random.nextInt(50)));
        System.out.println(Arrays.deepToString(array1) + " ");


        System.out.println();
        for (n = 0; n <array2.length; n++) {
            for (m = n + 1; m < array2[n].length; m++) {

                             int temp = array1[n][m];
                array1[n][m] = array2[m][n];
                             array2[m][n] = temp;
            }
        }
        System.out.println();
        for (n = 0; n <array1.length; n++) {
            for (m = n + 1; m < array1[n].length; m++) {

        }
            System.out.print(Arrays.deepToString(array2) + " ");

                }

            }

        }
//        System.out.println();
//        for (n = 0; n < array1.length; n++) {
//            for (m = n + 1; m < array1.length; m++) {


//               IntStream.range(0, 44);
//                      .filter(m ->m % 10 < 5 )
//                     .filter(n -> n/ 10 > n % 10)
//                     .forEach(n ->{
//                         int temp = array1[n/10][m%10] = array2[m%10][n/10];
//                          array2[m%10][n/10] = temp;
//                      });





