package com.company;

public class TestDlyaTesta extends Test {

    public static void sayHello(){
        Test.sayHello();//  вывод родительского результата + ниже
        System.out.println("Novyj");// метод в родителе затрется
    }// затирание  статик
}
