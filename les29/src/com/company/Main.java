package com.company;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws InterruptedException {
/**наследование
 * геттеры и сеттеры
 * методы с переменным числом параметрами
 * сериализация десириализация
 * + Stream API +
 * интерфейсы и абстрактные классы
 * статические классы
 * потоки
 * коллекции*/


//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(25);
//        list.add(125);
//        list.add(-10);
//        list.add(89);
//        list.add(3);
//        list.add(7);
//
//        //Stream<Integer> stream = list.stream()tream(); // возвращает стрим коллекции
//
//        Stream<Integer> stream = list.parallelStream(); // возвращает стрим коллекции , но делает это внутри себя на основе потоков
//        // обрабатывает коллекцию разбивая на куски что влияет на скорость обработки
//
//        stream.forEach(System.out::println);// данные выводятся рандомно тк обрабатывалось в отдельных потоках
/***********************************************************************************************************************/
// Потоки
        // порт  в котором помещается 5 корабликов
        // у коробля есть грузовместимость 1тонна разгружается 1000милисек
        // тоннель помещается макс 1 корабль ждет пок ав порту не освобтдится 1 место
        // океан где бесконечное колво кораблей
        // тот кто не успел разгрузиться тот неудачник

        ShipGenerator gen = new ShipGenerator();
        Port port = new Port();
        Tunnel tunnel = new Tunnel(gen, port);

        tunnel.start();



        tunnel.join();

    }
}
