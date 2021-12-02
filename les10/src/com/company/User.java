package com.company;

public final class User { // запрещает наследование если стоит в сигнатуре класса
    // Passport:
    // -String date;
    // -String photo;
    private Passport passport;
    public Child[] children;


    public Passport getPassport() { // при помощи геттера можно обратится к любому полю типа паспорт
        return passport;
    }

    public void setPassportData(String date,String photo) { // принимает вместо обьекта два аргум
        this.passport = new Passport(date, photo); // внутри себя свойство паспорта ициализирует
    }

    public class Passport{ // обьявление класса внутри класса User.
        public String date;// если кроме этого класса больше нигде не нужен
        public String photo;


        public Passport(String date, String photo){ // конструктор для паспорта
            this.date=date;
            this.photo=photo;
        }
    }

    //объекты класса Child можно создавать только внутри класса User
    // доступ к полям объекта этого класса имеет только класс User
    private class Child{ // обьявление вложенного класса
        public String name;
    }

    // если вложенный класс имеет мд паблик и при этом помечен кл словом статик то обьекты такого класса можно создавать
    // вне контекста родительского(внешнего) класса
    public static class Cat { // в джаве статическими бывают и класса
        public String color;
    }


    public void test(){ // нкогда не встретится в практике
        class Test{ // класс внутри метода
            public String id; // класс сразу по умолчанию приват
        }
    }


}
