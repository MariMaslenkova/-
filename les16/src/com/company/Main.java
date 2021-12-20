package com.company;

public class Main {

    public static void main(String[] args) {
// enum
        // энам - набор значений которые можно записать в поле


        Month m = Month.MARCH;// ничего кроме енама присвоить обьекту нельзя
        m.ordinal(); // узнать номер значения
        System.out.println(m.ordinal());
        m.name();// вывод имени на экран
        System.out.println(m.name());
    }
}
