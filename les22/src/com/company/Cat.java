package com.company;

import java.io.Serializable;

public class Cat implements Serializable { // для того чтобы обьекты этого класса сериализовались имплементим интерфейс
    // срабатывает как галочка для класса , что его можно сериализовать или дес-ать

    private static final long serialVersionUID = 2;
    private String color;// модификатор доступа не влияет на запись и чтение свойства
    public int age;
    protected transient float weight;// transient убирает свойство из процесса сериализации и десиарилизации

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return String.format("Age: %d, Color: %s, Weight: %f", this.age, this.color, this.weight);
    }
}
