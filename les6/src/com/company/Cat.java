package com.company;

public class Cat {
    public String color;

    public Cat(String color){
        this.color = color;
    }
    // Если в классе присутствует хотябы один конструктор отличный от дефолтного, то дефолтный конструктор удаляется из реализации класса
    //т.е нельзя создать объект такого класса используя дк.
     // конструктор тоже наследуется
}
