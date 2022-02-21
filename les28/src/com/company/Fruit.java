package com.company;

public class Fruit {
    public String getColor() {// просто возвращает значение. но свойство остается приватным
        return color;
    }


    public void setColor(String color) {// остается приватным но можно задавать значение
        if (color.equals("transparent")){
            throw new RuntimeException("Нет таких фруктов");// рантайм чтобы необязательно было брать в блок трайкеч метод
        }
        this.color=color;
    }


    private String color;// насследоваться не будет тк приват/ для этого нужно создать геттеры и сеттеры
    public float weight; //наследуется тк паблик
    protected int size; // наследуется только в пакете

    public Fruit(float weight){ // переопределен дефолт конструктор
        this.weight= weight;
    }

    public void print(){
        String s = String.format("Color: %s, Weight: %f, Size: %d", this.color, this.weight, this.size);
        System.out.println(s);

    }
}
