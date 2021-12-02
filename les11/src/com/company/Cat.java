package com.company;

import java.util.Objects;

public class Cat {
    public String color;
    public String name;

    public Cat(String color, String name){ // конструктор переопределение дэфолтного
        this.color = color;
        this.name = name;
    }

    @Override    // альт инсерт тустринг  переопределение метода тустринг
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // hashCode - аккумулятивное представление объектов в памяти в виде числа.
    // В его формирование могут участвовать значения полей обьекта полей этого класса.
    // люб обьект


    @Override // переопред метода equals
    // неглас правило!!!
    // если хешкоды сравневыемых обьектов совпадают, то иквалс должен вернуть тру.
    public boolean equals(Object o) { // сравнивает 2 лбъекта текущий к кот этот метод вызывается и тот кот мы ему даем на вход
        if (this.hashCode()== o.hashCode()){ // это должна быть первая строчка в данном методе!!! всегда
            return true;
        }
        if (!(o instanceof Cat)){ // если о не кот, то ретурт ложь  /?
            return false;
        }
        Cat kot = (Cat)o; // явное преобразование обьект в класс кэт
        if (kot.color.equals(this.color) && kot.name.equals(this.name)) {
            return true;
        }
        return false;
    }


    @Override // перреопред метода hashCode
    // коллизия это совпадение хешкодов у разных объектов
    public int hashCode() {
        return Objects.hash(color,name); // дефолтный вид метод
    }
}
