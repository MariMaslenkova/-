package com.company;

import java.util.HashSet;

public class SetMain {
    public static void main(String[] args) {

        // Set это интерфейс
        HashSet<Character> set = new HashSet<>(); // в сет у элементов нет индекса
        set.add('A');
        set.add('B');
        set.add('A');
        set.add('C');
        System.out.println(set);

        HashSet<Cat> cats = new HashSet<>();
        cats.add(new Cat(1));
        cats.add(new Cat(2));
        cats.add(new Cat(1));
        cats.add(new Cat(1));
        System.out.println(cats);
    }
}