package com.company;
// если класс наследует абстрактный класс, то:
//1) реализовать(переопределить) в дочернем классе все абстрактные методы родителя
//2) сделать дочерний класс абстрактным


// наследование интерфейсов производиться при помощи ключ слова implements
public class Cat extends Animal implements Predator,Mammal { // альт энтер(переопределение методов)
    @Override
    public void say() {
        System.out.println("мыу-мыу");
    }

    @Override
    public void drinkMilk() {

    }

 //   @Override
 //   public void eatMeal(String meal) { // можно не писать тк у него есть реализация в предаторе

 //   }

    @Override
    public void hunt(Predator p) {

    }

    @Override
    public void hunt(PlantEating p) {

    }
    //     @Override
    //    public void eat(String food){



}


