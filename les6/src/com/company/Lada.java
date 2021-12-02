package com.company;

public class Lada extends Car {// все свойства и методы которые есть в калсса кар

    public Lada(){} //  переопределение дк овверайт не пишется при переопределении конструктора

    public int age; // новое свойство
    public int cycles; // обороты

    public Lada (int age, int cycles, String color, float speed){
        super(speed, color); // вызов конструктора родительского класса кар
        this.age=age;
        this.cycles=cycles;


    }


    public void drive(){ // при наслед доступно все что есь у родителя
        this.speed=12;
        this.color="green";
        this.distance(1,9);
        this.age=12;


    }

    // переопределить метод спид в методах лады
    @Override // вызываем общую логику для всех машин. + меняются обороты.
    public void setSpeed(float speed){ // копируем метод из класса родителя
        this.cycles= (int)(speed * 100 / 0.28); // явное преобразование к инту
        // super - это ссылка на родительский экз объекта ссыль на ближайшего родителя

        super.setSpeed(speed);


    }

}
