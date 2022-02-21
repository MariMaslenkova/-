package com.company;

public class Test {
    public  String name ;
    public static int a;
   // class Cat{}// не можем создавать обьекты этого класса
   static class Cat{} // теперь все кто имеет доступ к классу тест , имеют доступ к классу кэт

    private static class Dog{} // если вложеный класс приват то доступа нет

    public static void sayHello(){
        System.out.println("Privetiki");
        // доступен через класс потомка
        // существуют на уровне класса. обращаться через класс
        // из статик метода нельзя обратится
        // нет зис и супер
        // динам видят статики , но статик методы не видят динамический контент
        //
    }

    public void test(){
       this.name="Vasya";
    }

    public int sum(int a , int b){
       return a+b;
    }
}
