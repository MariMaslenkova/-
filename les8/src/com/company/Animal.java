package com.company;
//
// если внутри класса присутствует хотябы 1 абстракт метод, то такой класс должен быть помечен кл.словом абстракт
//ПРИМЕЧАНИЕ:
// если класс помечен кл,слово абстракт, то не обезательно, что бы внутри него был хотябы 1 абстр метод.***

public abstract class Animal {
    // если реализация метода внутри класса невозможна, то такой метод нужно пометить кл.словом adstract.
    //у абстрактоного метода не должно быть тела!!!(без фиг скобок)

    public abstract void say();

    public void eat (String food){
        System.out.println(food);
    }
}
