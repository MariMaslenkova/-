package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // исключения exceptions
        // любая ситуация которая приводит к поломке
        //в джава существует 2 типа исключений:
        //checked- проверяемые - Exception (название класса)
        // unchecked- непроверяемые RuntimeExteption(название класса)

        try {
            System.out.println(1/0);
        } catch (ArithmeticException e) {// e- записывается ошибка
            System.out.println(e.getMessage());// вернет текст ошибки
        }
        System.out.println("all ok");
        // у каждого типа исключения есть свой класс

        try {
            int[] arr = {1,2,3};
            arr[-1]=8;
        }catch (ArrayIndexOutOfBoundsException e ){ // обязательно указывать тип исключения
            System.out.println(e.getMessage());
        }

        // int[] arr={}
        // n
        //arr[n]/n

        int[] arr = {1,23,5,7,8};

        System.out.println("Введите n");

        Scanner sc=new Scanner(System.in);

        try {
            int n = sc.nextInt();//InputMismatchException
            System.out.println(arr[n] / (float)n);
        } catch (InputMismatchException e){
            System.out.println("Введи число!!!");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Введен неверный индекс массива!");
        }catch (ArithmeticException e){
            System.out.println("Делить на ноль нельзя,дебил!");
        }
        // все предидущие исключения/примеры относятся к классу unchecked / непроверяемые в момент написания невозможно выловить

        // это значит что классы этих исключений наследуют класс RuntimeException - искл этого типа могут возникнуть только в моменьт запуска программы

        // исключения такого типа могут возникнут только во время выполнения программы и они необязательны для обработки
        // их не обязательно помещать в блок трайкеч

        Car car=new Car();
        try {
            car.setSpeed(250);
        } catch (CarException e){
            System.out.println("Недопустимая скорость!");
            System.out.println("Диапазон скорости от " + e.minSpeed + "км/ч. до "+ e.maxSpeed +  "км/ч.");
        }finally { //  он не обязателен. код выполнится в любом случае
            System.out.println("Ты меня увидишь в любом случае!");
        }// используется

    // F

    }
}
