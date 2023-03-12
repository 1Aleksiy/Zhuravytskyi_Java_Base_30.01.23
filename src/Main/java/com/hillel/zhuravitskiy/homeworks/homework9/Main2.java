package com.hillel.zhuravitskiy.homeworks.homework9;
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
        System.out.println("Перший масив :");
        printArray(array1);
        System.out.println();


        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                array2[i][j] = array1[j][i];
            }
        }
        System.out.println("Другий масив :");
        printArray(array2);

        scanner.close();
    }

    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
        }
    }
}