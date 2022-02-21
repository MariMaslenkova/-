package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        // коллекции

        // ArrayList , LinkedList- векторные коллекции
        // HashMap - хранит связку ключ+значение, ключ(уникальный)+значение
        // Set, Stack, Gueueu-

        // ArrayList-

// внутри себя класс аррэйлист оперирует массивом
        ArrayList<Integer> list = new ArrayList<>();// коллекция ArrayList ничем принципиальным от массива не отличается.
        list.add(12);
        list.add(45);
        list.add(89);
        list.add(100);
        list.add(2, 78); // вставка элемента в середину по индексу

        System.out.println(list);// list.toString - тоже самое

        int value = list.get(3); // вывод елемента по индексу
        System.out.println(value);

        list.set(1,55);// замена одного значения коллекции на другое 1индекс, 2 на что заменить
        System.out.println(list);
         for (int e: list){ // вывод коллекции форичем(главное чтобы в коллекции был итератор)
             System.out.println(e);
         }

         // удаление элемента
        list.remove(0);
        System.out.println(list);

        Integer i=78;
        list.remove(i);// при использовании в кач дженерика интежер удаление через сохраниение в переменную интежер
        System.out.println(list);

        list.size(); // возвращает колво элементов в коллекции
        System.out.println(list.size());

        list.clear();// удаление элементов всех за раз
        System.out.println(list);

        // во всех методах используется рантайм

        //list.add(10,100); эксепшен
        //System.out.println(list);

        list.add(52);
        list.add(100);
        list.add(52);
        list.add(2300);

        ArrayList<Integer> list2 = new ArrayList<>(); // 2 коллекция
        list2.add(45);
        list2.add(89);


        list.addAll(1,list2);// добавление нескольких элементов за раз по индексу
        System.out.println(list);

        //удалиние нескольких эл за раз
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(89);
        list3.add(2300);
        list3.add(789);
        list3.add(233);
        list.removeAll(list3);
        System.out.println(list);


        Object[] items = list.toArray();// преобразование коллекции в маасив
        Integer[] intItems = new Integer[items.length];
        for (int j=0; j<items.length; j++){
            intItems[j]=(Integer)items[j]; // запись данные в массив с явным преобразованием
        }
        System.out.println(intItems);

        //2 перегрузка toArray
        Integer[] intItems2 = new Integer[1];
        intItems2= list.toArray(intItems2);// массив нужного нам типа на входе перепишим что вернет туэррей в эту же ссылку
        for(int e:intItems2){
            System.out.println(e);
        }

        //
        // обратная
        list.indexOf(52);// возвращает индекс первого значения
        System.out.println(list.indexOf(52));
        System.out.println(list.lastIndexOf(52)); // последнее значение
        // если элемент не найден  то индексоф и ластиндексоф вернут -1!

        //метод Clone
        ArrayList<Integer> copy = (ArrayList<Integer>) list.clone(); // создание копии коллекции c преобразованием к интежеру

        copy.add(569856);
        System.out.println(copy);
        System.out.println(list);

        // stream i parralelstriam


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
// les19
        //





    }
}
