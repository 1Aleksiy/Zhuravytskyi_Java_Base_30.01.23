package com.hillel.zhuravitskiy.homeworks.homework12;

import java.time.LocalDate;
import java.util.List;

import static com.hillel.zhuravitskiy.homeworks.homework12.Client.*;

public class Fitness {
    public static void main(String[] args) {
        List<Client> clients = List.of(
               new Client("Tolyk", "S_FIRST", "tolyk@gmail.com", "+380674537226",
                        LocalDate.of(1987, 1, 1), 80, 120/70, 6000),
                new Client("Den", "Bogatyi", "bogat@gmail.com", "+380963541235",
                        LocalDate.of(2000, 5, 7), 100, 130/80, 7000),
                new Client("Ben", "Aflik", "aflik@gmail.com", "+380632559981",
                        LocalDate.of(2005, 12, 21), 70, 120/75, 8000),
                new Client("Sem", "Boil", "boil@gmail.com", "+380632559345",
                LocalDate.of(1975, 10, 20), 110, 140/85, 5000)
        );
//

        clients.forEach(client -> {
            client.printAccountInfo();
            client.printAge();
        });

        System.out.println();
        System.out.println();

        clients.forEach(client -> {
            client.setPressure(120/70) ;
            client.setNumberSteps(10000);
            client.printAccountInfo();
            client.printAge();
        });





    }
}


