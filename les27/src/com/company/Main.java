package com.company;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        /** Stream API*/

        Stream<Integer> s1 = Stream.of(1, 2, -5, 5, -5, 10);
        /** skip пропускает первые n элементов
         * limit берет первые n элементов*/

        s1
                .skip(2)
                .limit(3)
                .forEach(System.out::println);
/**********************************************************************************************************************/

        /** Peek - применяет метод к каждому элементу стрима*/

        Stream<User> s2 = Stream.of(
                new User("Vasiliy"),
                new User("Arkadiy"));

        s2
                .peek(u -> u.setName(u.getName().toUpperCase()))//берем пользователя . пик перебирает через сет нейм текущее имя приведенное к верх регистру
                .forEach(System.out::println);

/**********************************************************************************************************************/
// получить самый первый четный элемент

        Stream<Integer> s3 = Stream.of(25, 89, 21, -96, 5);
        // findFirst - возвращает первый элемент
        int res = s3
                .filter(x -> x % 2 == 0)
                .findFirst()
                //.orElse(-1)//чтобы не выкидывался эксепшен/ прит использовании орэлсе то гет убираем
                .get();
        System.out.println(res);


        /**************************************************/
        Stream<User> s4 = Stream.of( // 26les
                new User(20),
                new User(5),
                new User(30)
        );

        // найти общее кол-во монет
        // среди всех пользователей,
        // но только у тех у кого их больше10
        res = s4
                .reduce(0,
                        (u1, u2) -> {
                            if (u2.coins > 10) {
                                return u1 + u2.coins;
                            }
                            return u1;
                        },
                        (x, y) -> x + y);
        System.out.println(res);

        /** можно записать короче
         *
         */
        //res= s4
        //               .reduce(0,
        //                       (u1, u2) -> u2.coins > 10 ? u2.coins + u1:u1,
        //                       (x, y) -> x + y);
        //        System.out.println(res);*//
        // применение стримовских штук это когда пишешь фильтртипа ка кна сайтах где нужно чтото отфильтровать

        /*********************************************************************************************************/
        // bynthytn vfufpby

        Shop shop = new Shop();
        shop.addCar(new Car("Car1", Color.BLACK, 6580, 1987));
        shop.addCar(new Car("Car2", Color.ORANGE, 7540, 2000));
        shop.addCar(new Car("Car3", Color.YELLOW, 8521, 1999));
        shop.addCar(new Car("Car4", Color.WHITE, 1458, 1995));
        shop.addCar(new Car("Car5", Color.WHITE, 9652, 2011));
        shop.addCar(new Car("Car6", Color.YELLOW, 8965, 2005));
        shop.addCar(new Car("Car7", Color.BLACK, 4256, 2013));
        shop.addCar(new Car("Car8", Color.YELLOW, 2541, 1997));
        shop.addCar(new Car("Car9", Color.WHITE, 2356, 2001));
        shop.addCar(new Car("Car10", Color.YELLOW, 8712, 2010));

        CarFilter filter = new CarFilter();
        filter.pageSize = 3;
        filter.page = 1;
        filter.fromYear = 1987;
        filter.toYear = 2020;
        filter.fromPrice = 3000;
        filter.toPrice = 10000;
        filter.color = Color.YELLOW;
        filter.term = "a";
        filter.sortBy = SortBy.PRICE;
        filter.asc = true;

        shop.findCars(filter)
                .forEach(System.out::println);


    }
}
