package com.company;

public class Car {
    public int price;
    public Color color;
    public String name;
    public int year;

    public Car(String name, Color color, int price, int year){
        this.year = year;
        this.price= price;
        this.color=color;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", color=" + color +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
