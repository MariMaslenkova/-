package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        // if (логическое выражение) {
        //(набор команд который выполнится только в том случае если условие истено)
//} else {
        // набор команд выполнится если условие ложно
//}

        // == Знак равенства

        // != Знак неравенства

        // && Логическое И

        // || Логическое ИЛИ

        int age = 50;
        if (age >= 18) {
            System.out.println("совершеннолетний");     // SOUT
        } else {
            System.out.println("не совершеннолетний");
        }

        float height = 165f;
        if (age >=18 && height >=180) {
            System.out.println("Вы подходите");
        } else {
            System.out.println("Вы не подходите");
        }
        // если возраст меньше 13 то это ребенок. если от 13 до 21 то он подросток, боль

        //<13
        // [13;21)
        // >=21
        if (age <13) {
            System.out.println("ребенок");
        } else {
            if (age <=21) {
                System.out.println("Подросток");
            } else {
                System.out.println("Взрослый");
            }
        }


        boolean isMale = true;
        if (isMale) {
            System.out.println("Цветы");
        } else {
            System.out.println("носки");
        }
        //  тоже самое  !isMale <==> isMale=false (! знак инвертирует логическое выражение)

        int month =10;
        switch (month) {
            case 1 :
                System.out.println("Январь");
                break; // прерывает выполнение свичкейса
            case 2 :
                System.out.println("Февраль");
                break;
            case 5 :
                System.out.println("май");
                break;
                default:
                    // ни один из кейсов не сработал
                    System.out.println("неверный номер месяца");
        }

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
        }

    int year = 2015;
        if (year %100 == 0) {// year делится на 100 без остатка
        }
        if (year %400 != 0) {// year не делится на 400 без остатка
        }

        //тернарный оператор.
        int sum=123;
        int discount = 0;
        discount = sum >=100 ? 10 : 5; //Три оператора
        System.out.println(discount);


        //операторы инкремента и декремента увеличение и уменьшение на единицу
        int v=12;
        v++; // v++ тоже самое что v=v+1;
        System.out.println(v);
        v--;
        System.out.println(v);


        int v2=v++;
        System.out.println(v);

        int c = v++ + ++v - --v + ++v + --v;
        System.out.println(c);

        c+=12; // c=c+12;


    }
}