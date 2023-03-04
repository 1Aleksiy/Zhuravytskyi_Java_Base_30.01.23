package com.hillel.zhuravitskiy.homeworks.homvork11;

public class Burger {
    String bun;
    String meat1;
    String cheese;
    String mayonnaise;
    String salad;
    String meat2;


    public Burger(String bun, String meat1, String cheese, String mayonnaise, String salad) {
        this.bun = bun;
        this.meat1 = meat1;
        this.cheese = cheese;
        this.mayonnaise = mayonnaise;
        this.salad = salad;

    }
    void  usual() {
        System.out.println("Звичайний бургер : " + bun+", " + meat1 +", "+ cheese +", "+ mayonnaise +", "+ salad );


    }

    public Burger(String bun, String meat1, String cheese, String salad) {
        this.bun = bun;
        this.meat1 = meat1;
        this.cheese = cheese;
        this.salad = salad;
    }
    void dietary(){
        System.out.println("Дієтичний бургер : " + bun+", " + meat1 +", "+ cheese +", "+ salad );
    }
    public Burger(String bun, String meat1, String cheese, String mayonnaise, String salad, String meat2) {
        this.bun = bun;
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;
        this.meat1 = meat1;
        this.meat2 = meat2;

    }
    void dubleMeat(){
        System.out.println("Бургер з подвійним м'ясом : "+ bun+", " + meat1 +", "+ cheese +", "+ mayonnaise +", "+ salad+ ", " + meat2);



    }
}
