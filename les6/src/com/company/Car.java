package com.company;

public class Car {
    public String color;
    public float speed; // км/ч
    public int fuelVolume;

    public float distance(int h,int m){
     // this - это ссылка на текущий экземпляр объекта.
     // при создании обьекта его методы не копируются.
     // любой метод класса хранится в классе в единственном экземпляре и не копируется в область памяти обьекта при его создании

        float time = h+((float)m/60); //перевод времени в единый формат

        return this.speed*time; //возврат результата скорости умнож на время )(тайм)(
        //
    }

    public void setSpeed(float speed){// все машины выводят новую скорость кроме лады
        this.speed = speed; // иначе ява не видит свойство класса
        System.out.println("Скорость автомобиля: " + speed + " км/ч");


        // конструктор -
        // в любом классе присутсвует конструктор по умолчанию. прис конструктор кот называется по умолчанию
        // дефолтный конструктор
        //конструктор - метод, который не явно вызывается при создии объектов класса.
        //

        // переопределение дефолтного конструктора
        //



    }
    public Car(){ //метод который должен наз как класс без указания типа значения и воида / конструктор
        this.color = "black"; // вызов метода внутри кар
    }
    public Car(float speed){ // перегрузка метода
        this(12,12.5f); // this (....)- вызов конструктора класса внутри конструктора класса
        // конструкция должна распологаться в самом начале тела конструктора
        // и идти первой строчкой кода
        this.speed=speed;
      // this(); - вначало каждого конструктора вызывать дефолтный . срабатывает любая перегрузка


    }
   public Car (float speed, String color){
        this.speed=speed;
        this.color=color;
   }
   private Car(int fuelVolume, float speed){ // не будет работать те приват
        this.fuelVolume= fuelVolume;
        this.speed= speed;
   }
}