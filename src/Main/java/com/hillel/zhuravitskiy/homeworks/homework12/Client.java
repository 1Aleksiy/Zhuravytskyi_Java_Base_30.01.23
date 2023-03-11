package com.hillel.zhuravitskiy.homeworks.homework12;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;

public class Client {
    private final String name;
    private final String surname;
    private final String email;
    private final String phone;
    private final LocalDate birthday;
    private double weight;
    private int pressure;
    private int numberSteps;
    private final DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);//"MM-dd-yyyy");

    public Client(String name, String surname, String email, String phone, LocalDate birthday, double weight, int pressure, int numberSteps) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.birthday = birthday;
        this.weight = weight;
        this.pressure = pressure;
        this.numberSteps = numberSteps;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getPressure() {
        return pressure;
    }

    public int getNumberSteps() {
        return numberSteps;
    }

    public void setNumberSteps(int numberSteps) {
        this.numberSteps = numberSteps;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void printAge() {
        System.out.println("Client's age is %s".formatted(LocalDate.now().getYear() - birthday.get(ChronoField.YEAR)));
    }

    public void printAccountInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", birthday=" + formatter.format(birthday) +
                ", weight=" + weight +
                ", pressure=" + pressure +
                ", numberSteps=" + numberSteps +
                '}';
    }
}
