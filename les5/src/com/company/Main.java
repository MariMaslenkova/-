package com.company;

public class Main {

    public static void main(String[] args) {
	// опп обьектно-ориентированное программирование
        //
        //три принципа:
  //!!!  //1 инкапсуляция (вкл в себя возможность создания обьекта + сокрытие его реализации) каждый обьект предст собой капсулу, независим от ост обьектов
        // сокрытие ()


        // 2 полиморфизм - возможность обьекта принимать различные состояния от окр среды.:
        // перегрузка методов - одно из проявлений полиморфизма и явное преобразование обьектов класса
        // явное преобразование обьектов класса


        //3 наследование - перенос одного класса в другой см. коментарий к классу анимал


        //4 абстракция -

        //1 для создания обьекта описвть шаблон/загОтовку. ключ слово класс (описывает новый шаблон обьекта)


// создание обьекта
        //любой класс в джава это новый пользовательский тип данных()
        Cat kitty  = new Cat ();// название переменной , имя переменной, выделение памяти, название класса
        kitty.age = 17;
        kitty.name = "Анатолий";
        kitty.weight = 6.65f;
        kitty.eat("Огурец");
        kitty.sleep(3);
        kitty.sleep (2,6);
        kitty.sleep ((byte)4);
        kitty.tails = true;
        kitty.breath();

        // class Cat = [Animal] + [Cat]
        // Animal a = kitty;  явное преобразование класса // сат к энимал. доступны свойства от энимал
         // Animal a = (Animal) kitty; устаревшее
        // a.breath(); будет браться из класса кэт

        Cat kitty2 = new Cat();
        kitty2.age = 2;
        kitty2.name = "Аристарх";
        kitty2.weight= 8.3f;
        kitty2.eat("Рыбка");
        kitty2.sleep(8);


    }
}
