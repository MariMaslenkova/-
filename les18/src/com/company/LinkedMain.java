package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedMain {


    public static void main(String[] args) {
        // LinkedList

        LinkedList<String> list = new LinkedList<>();// очень похож на ArrayList
        // отличие только в том что реализует двухсвязный список
        list.add("hello");
        list.add("world!");
        list.add(1, " ");
        System.out.println(list);

        list.remove();// удаляет первый элемент списка
        System.out.println(list);

        //list.get();// выводит элемент по индексу
        list.getFirst();//показывает первый элемент (бошку)


        //добавление элементов в начало 1) (L)
        //добавление в середину 2)(A)
        //добавление в конец 3)(L)и (А)


        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        // добавление в начало

        long t = System.currentTimeMillis();// возвращает колво милисикунд с 1970года

        addToBegin(arrayList);
        System.out.println("Arraylist добавление в начало: " + (System.currentTimeMillis() - t));


        t = System.currentTimeMillis();// возвращает колво милисикунд с 1970года

        addToBegin(linkedList);
        System.out.println("LinkedList добавление в начало: " + (System.currentTimeMillis() - t));

////////////////////////////////////////
        // в середину
        arrayList.clear();
        linkedList.clear();
        t = System.currentTimeMillis();// возвращает колво милисикунд с 1970года

        addToMiddle(arrayList);
        System.out.println("Arraylist добавление в середину: " + (System.currentTimeMillis() - t));


        t = System.currentTimeMillis();// возвращает колво милисикунд с 1970года

        addToMiddle(linkedList);
        System.out.println("LinkedList добавление в середину: " + (System.currentTimeMillis() - t));
        ///////////////////////////////////////////////////////////////////////////////////////////
// добавление в конец
        arrayList.clear();
        linkedList.clear();
        t = System.currentTimeMillis();// возвращает колво милисикунд с 1970года

        addToEnd(arrayList);
        System.out.println("Arraylist добавление в конец: " + (System.currentTimeMillis() - t));


        t = System.currentTimeMillis();// возвращает колво милисикунд с 1970года

        addToEnd(linkedList);
        System.out.println("LinkedList добавление в конец: " + (System.currentTimeMillis() - t));


    }


    public static void addToBegin(List<Integer> col) {
        for (int i = 0; i < 1000000; i++) {
            col.add(0, i);
        }
    }

    public static void addToMiddle(List<Integer> col) {
        for (int i = 0; i < 1000000; i++) {
            col.add(col.size() / 2, i);
        }
    }

    public static void addToEnd(List<Integer> col) {
        for (int i = 0; i < 1000000; i++) {
            col.add(i);
        }


    }
}
