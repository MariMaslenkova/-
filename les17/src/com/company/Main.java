package com.company;

public class Main {

    public static void main(String[] args) {

//        Color color = Color.GREEN;
//
//        System.out.println(color.getHexColor());
//
//        System.out.println(Calc.SUB.exec(25,54));
//        System.out.println(Calc.DIVIDE.exec(25,54));
//
        // дженерики- обобщения

        // создавать/инициализировать обьекты типа дженерек нельзя изза возможного отсутствия в них дефолтного конструктора
        // какие типы можно использовать в кач дженериков - ответ - все кроме примитивных

        User<Integer, Byte> user = new User();
        user.id = 12;// присвоение айдишника пользователю
        user.salary = (byte) 127;
        System.out.println(user.id);
        System.out.println(user.salary);


        User<String, Float> user2 = new User();
        user2.id = "user2 id";
        user2.salary = 123.12f;
        System.out.println(user2.id);
        System.out.println(user2.salary);


        try {
            int r = user2.<Integer>addSalary(1789);// к текущей зп прибавляется 17,89
            System.out.println(r);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //[1,2,5,8,8,7] вывести самое повторяемое число и сколько раз
        int arr[] = {1, 12, 58, 12, 69, 14, 12};
        int count = 0;
        int n = 0;
        int max = 0; //максимальное найденое количество повторений
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                n = arr[i];
            }
        }
        System.out.println("Число " + n + ", кол-во повторений: " + max);
    }

}

