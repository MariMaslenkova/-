package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) { //
// статические поля класса
        System.out.println(Dog.legsCount); // не нужно создвать обьект класса. обращение через имя класса

        Dog sobachka= new Dog();
        sobachka.legsCount = 3;

        Dog dog2 = new Dog();
        dog2.legsCount=5;

        System.out.println(dog2.legsCount);
        System.out.println(Dog.legsCount);

        System.out.println(Dog.earsCount);
        System.out.println(Dog.eyesCount);

        System.out.println(dog2.count());

        Dog.say();



        dog2.setAge(12);
        sobachka.setAge(5);
        Alabai.say();

        Alabai alabai = new Alabai();
        dog2.say();
        alabai.say();
//********************************************************************************************
        Integer[] arr = {1,-5,7,34,8};
        Arrays.sort(arr, Main::compare);
        for (int e:arr) {
            System.out.println(e);
        }

        //******************************************************************************

        // чтение данных с клавиатуры
        Scanner sc= new Scanner(System.in);// обьект класса саканер ввод с клавиатуры. клавиатура по умолчанию
       // int input = sc.nextInt();
       // System.out.println(input);
       // String s = sc.next(); // чтение строки

        // 1 Создать собаку // ввод 1
        // 2 вывести кол созданных собак
        // 3 выход

        int c = 0; // номер ввода от пользования
        Dog.resetCounter();// сброс счетчика собак
        while (c!=3) {
            System.out.println("Создать собаку");
            System.out.println("Вывести кол-во созданных собак");
            System.out.println("Выход");
            System.out.println("Ваш выбор:");
            c = sc.nextInt(); // записывает ввод пользователя

            switch (c) {
                case 1:
                    new Dog();
                    System.out.println("Собака успешно создана");
                    break;

                case 2:
                    System.out.println(dog2.count());
                    break;

                case 3:
                    break;
                    default:
                        System.out.println("пиши правильно");

            }
        }
    }
    //****************************************************************************************************************
    // 0=> a=b; -1=> a<b; 1=> a>b;
    public static int compare(int a, int b){
        if (a==b) {
            return 0;
        }
        if (a<b){
            return -1;
        }
        return 1;
    }
}
