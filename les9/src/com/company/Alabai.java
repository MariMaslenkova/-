package com.company;

public class Alabai extends Dog {
// не перегрузка метода say из класса Dog, а перекрытие.
    public static void say() { // к стат методам обращаться через имя класcа
        System.out.println("мыу-мыу");
    }
}