package com.company;

public class Main {

    public static void main(String[] args) {
// абстрактые классы  интерфейсы

// если невозможно себе представить существование обьекта определенного класса, то такой класс должен быть абстрактным***
//    Animal a = new Animal(); //

// ***в джава невозможно создать обьект абстрактного класса*** не реализовав все его абстрактные методы
        //

// Manager -> User+Accountant // в менеджере наследовать методы из юзера и бухгалтера
        // новый класс и наследуется юзер MyUser -> User
        // UserAccounttant -> MyUsera
        //



        Cat Murzik = new Cat();
        Murzik.say(); //  в скобках ничего не пишем потомучто мыу мыу прописано в методе

        Predator p = (Predator)Murzik;
        Mammal m = (Mammal)Murzik; // преобразование кота к предатору
        p.eatMeal("мяско");


        Animal dog = new Animal() { //
            @Override
            public void say() {
                System.out.println("гау гау");
            }
        }; // ***
        Animal mouse = new Animal() {
            @Override
            public void say() {
                System.out.println("пи пи нах");
            }
        };
        dog.say();
        mouse.say();

        Mammal mammol = new Mammal() {
            @Override
            public void drinkMilk() {
                System.out.println("ням");
            }
        };
        mammol.drinkMilk();

        // в дж,8 и выше можно использовать лямбда выражения.
        // лямбда - замена реализации абстрактного класса или интерфейса с ОДНИМ абстрактным методом


        Mammal  mammol2 = ()->{ // синтаксис лямбда
            System.out.println("хрум хрум");
        };

        mammol2.drinkMilk();

        Mammal mammol3=()-> System.out.println("жрет");   // если абстрактный метод который реализует лямбда содержит ровно одно выражение и это выражение возвращает тот же тип
        // данных что и абстрактный метод, то фигурные скобки можно опустить/не писать.
        mammol3.drinkMilk();

        Colculator cal = new Colculator();
        System.out.println(cal.minus(89,23));
        System.out.println(cal.divide(9,3));
        System.out.println(cal.multiply(6,6));
        System.out.println(cal.plus(5,4));

    }
}
