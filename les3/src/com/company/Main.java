package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // массив - совокупность данных одного типа, доступ к элементам которого осуществляется по индексу
        // New-оператор выделения памяти

        int[] m = new int[4]; //одномерный массив
        // нумерация/индексация элементов массива начинается с 0
        m[3] = 123;
        m[0] = -12321;
        m[1] = 3;
        System.out.println(m[0]);
        System.out.println(m[1]);


        float[][] m2 = new float[3][2];// двухмерный массив-матрица
        m2[1][0] = 12.56f;


        // inline инлайн строчная инициализация массива
        int[] m3 = {10, -20, 96,};
        System.out.println(m3[1]);

        int[][] m4 = {{12, 4}, {15, 8}, {16, 89}};

        //
        System.out.println(m4.length); // .length - длина массива
        System.out.println(m4[0].length);  // кол-во столбцов в матрице м4
        // в джаве нельзя добавлять ли удалять элементы в созданном массиве

        // int index=2;
        //m3[index]=1000;


        // циклы!
        int k = 0;
        while (k < 10) { //сначала проверяет условие потом выполняет команду
            System.out.println("privet");
            k++;
        }

// k=10;
        do { // цикл с постпроверкой условия
            System.out.println("Java");
            k++;
        } while (k < 10);


        // 1часть - блок инициализации
        // 2часть - блок условия/блок выполнения цикла
        // 3часть - блок поститерации (некая одна операция языка которая будет выполняться после каждой итерации цикла)
        // каждый из 3 блоков опционален
        for (int i = 0; i < 5; i++) {
            System.out.println("kyky");
        }
        // for (;;) - ,бесконечный цикл


        for (int i = 0; i < m3.length; i++) { // вывод на экран всех элементов массива
            System.out.println(m3[i]);
        }
        // отладка приложения просмотр просмотр выполнения кода построчно красный кружок

        for (int i = 0, j = 0; i < m4.length; ) {
            System.out.println(m4[i][j]);
            j++;
            if (j >= m4[i].length) {
                i++;
                j = 0;
            }
        }


        for (int i = 0, j = 0; i < m4.length; ) {
            System.out.println(m4[i][j]);
            j++;
            if (j >= m4[i].length) {
                i++;
                j = 0;
            }
        }

        // цикл в цикле
        for (int i = 0; i < m4.length; i++) {
            for (int j = 0; j < m4[i].length; j++) {
                System.out.println(m4[i][j]);
            }
        }


        // "foreach" используется для прохода по массиву либо коллекции

        for (int e : m) {
            System.out.println(e);
        }

// break - прерывает выполнения цикла
// continue - переходит к следующей итерации цикла не дожидаясь выполнения текущей

        int[] arr = {12,-45,87,66,123,89};
        for (int e: arr){
            if (e%3==0){
                System.out.println(e);
                break;

            }
        }

        for (int e: arr){
            if (e%2 !=0){
                continue; // переход к следующему элементу массива
            }
            System.out.println(e);
        }

    }
}