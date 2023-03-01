package com.hillel.zhuravitskiy.homeworks.homework9;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {


        int[] array1 = new int[7];
        int[] array2 = new int[7];
        System.out.print("Numbers lottery - ");


        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * (9 + 1));
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.print("Numbers player - ");

        for (int b = 0; b < array2.length; b++) {
            array2[b] = (int) (Math.random() * (9 + 1));
            System.out.print(array2[b] + " ");
        }

        System.out.println();

        Arrays.sort(array1);
        System.out.println("lottery " + Arrays.toString(array1));

        Arrays.sort(array2);
        System.out.println("player  " + Arrays.toString(array2));
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        int index4 = 0;
        int index5 = 0;
        int index6 = 0;
        int index0 = 0;


        for (int i = 0; i < array1.length; i++)
            for (int b = 0; b < array2.length; b++) {
                if (array1[1] == array2[1]) {
                    index1 = 1;

                }if (array1[2] == array2[2]) {
                    index2 = 2;

                }if (array1[3] == array2[3]) {
                    index3 = 3;

                }if (array1[4] == array2[4]) {
                    index4 = 4;

                }if (array1[5] == array2[5]) {
                    index5 = 5;

                }if (array1[6] == array2[6]) {
                    index6 = 6;

                }if (array1[0] == array2[0]) {
                    index0 = 0;

                    break;
                }


            }

        System.out.println("index matching: " + index0 +" "+ index1 +" "+ index2+" "+ index3+" "+ index4+" "+ index5+" "+index6 );

    }
}








