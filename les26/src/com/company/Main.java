package com.company;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        /** Stream API -
         * функциональные языки - вся работа программы это функция с аргументами,
         * аргументами могут выступать функции
         *
         * Stream - стрим это поток данных . никакого отн к треду не имеет
         * API - набор методов кот позволяют обрабатывать данные*/

        ArrayList<Integer> list = new ArrayList<>();
        list.add(120);
        list.add(200);
        list.add(-56);
        list.add(0);

        list.stream();/**   Создает поток на основе данных содержащихся в коллекции*/

        Stream<Integer> stream = list.stream();
        /**************************************************************************************************************/

        // вывести на экран числа которые больше 100;
        for (int e : list) {// применили фильтр
            if (e > 100) {
                System.out.println(e);
            }
        }

        /** метод фильтр*/
        stream = stream.filter((Integer t) -> t > 100);/** t должно быть больше 1000*/
        /** выыод стрима на экран*/
        stream.forEach(System.out::println);// если отфильтровать и сразу вывести

/** (a) -> {test a}*/ // a типа подается на вход и в теле лямбды записан метод с этой же а
        /**************************************************************************************************************/

        Arithmetic a = new Arithmetic();

        float x = 15;
        float y = 25;
        float res = exec(a::sum, x, y);// хочу в качестве лямбды использовать метод sum который находиться в обьекте а.
        System.out.println(res);
/***********************************************************************************************************************/
// map - преобразует данные стрима из одного состояния в другое(переписывает / заменяет данные стрима, причем эти данные которые
// заменяем , могут быть другого типа) кол-во данных в стриме не изменится

        Stream<String> stream2 = Stream.of("12.7", "12", "34.89");
        stream2.
                map(s -> Float.parseFloat(s)).
                forEach(System.out::println);// cntr пробел


        // reduce
        Stream<Integer> stream3 = Stream.of(12, 0, 58, 8);
        int sum = stream3.reduce((z, prev) -> z + prev).get();
        System.out.println(sum);


        Stream<Integer> stream4 = Stream.of(12, 0, 58, 8);
        sum = stream4.reduce(100, ((z, prev) -> z + prev));
        System.out.println(sum);


        Stream<Integer> stream5 = Stream.of(12, 0, 58, 8);
        sum = stream5.reduce(10,
                (prev, z) -> z > 10 ? z : prev,
                (prev, z) -> z + prev);
        System.out.println(sum);
/***********************************************************************************************************************/
        Stream<Integer> stream6 = Stream.of(12, 0, 58, 8);
        stream6.sorted().
                        forEach(System.out::println);// автоматически сортированый стрим(джава сама решит ка сортировать)



        Stream<Integer> stream7 = Stream.of(12,0,58,8);
        stream7.sorted((a1,a2)->{
            if (a1.equals(a2)){
                return 0;
            }
            if (a1>a2){
                return -1;
            }
            return 1;
        }).forEach(System.out::println);




    }

    public static float exec(Calculator c, float a, float b) {
        return c.calc(a, b);
    }
// если в программе есть метод который совпадает с сигнатурой лямбды которую хочешь использовать
    // если нет то пишем по старинке
    /******************************************************************************************************************/


}
