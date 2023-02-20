package com.hillel.zhuravitskiy.homeworks.homework7;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 0;i <200  ; i++) {
            if (i / 10 == 4 || i / 10 == 9 || i % 10 == 4 || i % 10 == 9 || (i -100 )/10 ==4 || (i -100 )/10 ==9 || i % 100 == 4 || i % 100 == 9) {
                continue;
            }

            if (counter==100){
                break;
            }
            System.out.println("shuttle namber =  " + i );
            counter++;

        }
        System.out.println("count shuttle = " + counter);

    }
}
