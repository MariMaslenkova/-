package com.company;

import java.io.*;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // сериализация/ десиарилизация объектов (представление обьекта в виде набора байт)
        // сериализация - представление обьекта в наборе / массив байт
        // десиарилизация - наоборот

        LinkedList<Cat> cats = new LinkedList<>();
        Cat cat2 = new Cat();
        cat2.age = 18;
        cat2.setColor("write");
        cats.add(cat2);
        Cat cat3 = new Cat();
        cat3.age = 5;
        cat3.setColor("spotted");
        cats.add(cat3);


//////////////////////////////////////////////////////////////////////////////////////////////
        Cat cat = new Cat();
        cat.age = 4;
        cat.setColor("black");
        cat.weight = 12.5f;
        System.out.println(cat);

        // сериализация обьекта кэт и запись в файл

        FileOutputStream fos = new FileOutputStream("cat.bin");//
        ObjectOutputStream oos = new ObjectOutputStream(fos); // этот класс сериализует обьект
        // ObjectOutputStream (обьект) -> []byte -> FileOutputStream -> cat.bin

        oos.writeObject(cat);// метод для сериализации обьекта// не перетирает , а добовляет в конец в зависимости от
        oos.writeObject(cats);// запись котов для сер-ии
        oos.close();// закрытие патока

        // никаой обьект не сериализуется просто так не сериализуется
        ////////////////////////////////////////////////////////////////////////////


        // десeриализация обьектов из файла
        FileInputStream fis = new FileInputStream("cat.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        // FileInputStream читает cat.bin -> []byte -> ObjectInputStream -> Object

        // чтение/ десиар-ия из файла , должно происходить в том же порядке что и запись

        Cat catFromFile = (Cat) ois.readObject();//
        LinkedList<Cat> catsFromFile = (LinkedList<Cat>) ois.readObject();
        System.out.println(catFromFile);
        System.out.println(catsFromFile);

    }
}
