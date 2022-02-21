package com.company;

import java.util.HashMap;
import java.util.LinkedList;

public class HashMapMain {
    public static void main(String[] args) {
        // коллекция хранит элементы особым образом
        // HaspMap (key + value)
// нельзя обратится по индексу

        HashMap<String, Integer> contacts = new HashMap<>(); // дженерики один для ключа второй для значения
        contacts.put("Ivanov", 3549331);
        contacts.put("Petrov", 2445195);
        contacts.put("Sidorov", 3549331);

        contacts.put("Ivanov", 895698);// если ключ повторяется то перезапишется значение по этому ключу

        System.out.println(contacts);

        // получение доступа к элементу в коллекции
        contacts.get("Petrov");
        System.out.println(contacts.get("Petrov"));

        System.out.println(contacts.get("Kozlov"));// если нет элемента получаем нулл (указатель в никуда)


        System.out.println(contacts.getOrDefault("Ivanov", 100));
        System.out.println(contacts.getOrDefault("Kozlov", 100)); // аодставляет по дефолту значение валью, если такого ключа нет


        // Pupkin
        if (!contacts.containsKey("Pupkin")) {
            contacts.put("Pupkin", 6541256);
        }
        System.out.println(contacts);

        System.out.println(contacts.containsValue(8974589)); //тру или фолс если есть или нет номер телефона


        // удаление обьекта

        contacts.remove("Pupkin");// удаление по ключу
        System.out.println(contacts);

        contacts.remove("Ivanov", 8956985); // удаление по ключу и значению
        System.out.println(contacts);

        // получить список всех ключей
        System.out.println(contacts.keySet());

        // получить все значения

        System.out.println(contacts.values());

        LinkedList<Integer> list = new LinkedList<>();
        list.addAll(contacts.values());
        System.out.println(list);// добавление коллекции контакс в линкедлист

        //////////////////////////////////////////////////////////////////////

        // сколько раз каждое число повторяется

        int[] arr = {12,56,89,45,4,5,9,8,7,4,45,9,8,8,12,12,12,56};
        // Integer/Integer
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int e : arr){
            Integer value=map.get(e); // добавление е в коллекцию хашмап
            if (value==null){
                map.put(e,1);
            } else {
                value++;
                map.put(e,value); // переписать значение value
            }
        }
        System.out.println(map);
// задача на собеседовании // все задачи в которых нужно посчитать колво элементов решаются хешмепом

    }
}