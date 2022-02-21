package com.company;

public class Orange extends Fruit { // нет дефолтного конструктора тк в классе фрукт нет дефолтного конструктора
    public Orange(){ // явно прописываем деф конструктор // если у родителя нет деф конструктора то в классе потомке его нет
        super(12); // кл словом супер обращаемся к классу родителю
        // вызов контруктора родителя должен быть первой строчкой в классе потомке
    }
    public String country;


    @Override
    public void print(){
        super.print();
        System.out.println(this.country);
    }

}
