package com.company;

public class Main {

    public static void main(String[] args) {
// this,
// super


        Car auto = new Car(); // создание объекта // кар()-метод
        auto.color= "red";
        auto.speed=120;
        //car.this == auto
        System.out.println(auto.distance(2,30)); // запускаем метод сразу в соут

        Car auto2=new Car();
        auto2.speed = 137;
        // car.this==auto2
        System.out.println(auto2.distance(5,39));
        System.out.println(auto2.color);

        Lada l = new Lada();
        l.setSpeed(45);
        System.out.println(l.cycles);

        Car auto3 = new Car (23);

        Car auto4 = new Car (45,"red");
        System.out.println(auto3.speed);
        System.out.println(auto4.color);


        Cat Koshka = new Cat("white");
       // Cat Koshka2 = new Cat();

    }
}
