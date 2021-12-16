package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //вспомогательные классы в java
        // String (StringBuilder, StringBuffer)
        // Math
        // Классы оболочки примитивные типы
        // Date и Calendar
        // File
        ///////////////////////////////////////////////////////////////////////////////////////
        //String
        String s = "text";
        String s2 = new String();
        String s3 = new String("hello");

        // выполнить на джаве код которые написаны не на джаве
        //интернал internal
        "hgfjghd".toCharArray(); // вызов метода

        char[] chars = s.toCharArray(); // преобразует строку в массив символов

        System.out.println(s.length()); //узнать длину строки

        // charAt = [] для массива
        char c = s.charAt(2); // вытянуть символ по индексу
        System.out.println(c);

        s = "Hello world maza faka ";
        System.out.println(s.substring(6));
        System.out.println(s.substring(0, 5));

        String[] words = s.split(" ");// регулярное выражение (regex) загуглит
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        // все методы строк возвращают копию строки измененную методом

        System.out.println(s.indexOf('a')); // первый индекс
        System.out.println(s.lastIndexOf('a')); // последний индекс
        // если символа нет то вернется -1
        System.out.println(s.lastIndexOf("maza")); // индекс первого элеиента строки

        System.out.println(s.replace('a', 'F'));
        System.out.println(s.replace("Hello", "Fuck"));


        s = "    Java     ";
        System.out.println(s.trim()); // убирает лидирующие и не лидирующие пробелы

        // форматирование строк

        // статик методы
        String name = "Masha";
        int age = 17;
        String info = String.format("My name is %s I am %d years old", name, age); // форматирование символов
        // %s подстановка строки
        // %d подстановка целого числа
        // %f подстановка вещественного числа
        // %b подстановка булево значения
        // %с подстановка одного символа (char)
        System.out.println(info);
        // доп правило %
        System.out.println(String.format("%-20s", "Java"));
        System.out.println(String.format("%10.6f", 3.1415));

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                String res = String.format("%d*%d=%-2d   ", j, i, i * j);
                System.out.print(res); // печать одной строки
            }
            System.out.println(); // каждую итерацию преносит на новую строчку
        }
        System.out.println("Hello\tWorld\nJava"); // \ служат для форматирования тексата внутри строки
        // \n переход на новую строку
        // \t табуляция


        // (StringBuilder, StringBuffer)

        StringBuffer buf = new StringBuffer(100); // вместимость под сколько символов нужна память
        // по дэфолту вместимость 16
        buf.append("jhfjsdkahjgfbtrjeht");// добавление строки в память
        System.out.println(buf);
        buf.append(25);
        System.out.println(buf);

        //стрингбафер синхронизированный и патоко безопасен. но работает медленнее
        // стрингбилдер несинхронизированый
//
        //////////////////////////////////////////////////////////////////////////////////////////
        //           14.3
        // Math
        Math.pow(5, 3); // возведение числа в степень
        System.out.println(Math.pow(5, 3));

        // Посчитать 2 в степени n. н от 0 до 1000000
        System.out.println(Math.floor(5.2669874)); //округляет в меньшую сторону
        System.out.println(Math.ceil(5.2669874)); // в большую
        System.out.println(Math.round(5.52669874)); // по честному

        System.out.println(Math.random()); // возвращает от 0 до 1

        double r = Math.random(); // вывести от 50до 80
        int d = (int) (50 + r * 30); // (50-0)+R*(80-50)
        System.out.println(d);

        Random rand = new Random();
        rand.nextInt();// от мин инт до макс инта
        rand.nextInt(100); // от 0 до 100 не включая


        // угадай число
        // от 0 до 100 [0;100]

//        int comp = rand.nextInt(101);
//        Scanner sc = new Scanner(System.in);
//        int counter = 0; // счетчик попыток
//        while (true) { // бесконечный цикл
//            System.out.println("Введите число от 0 до 100");
//            int cc = sc.nextInt();
//            counter++;
//            if (cc > comp) {
//                System.out.println("Меньше");
//            }
//            if (cc < comp) {
//                System.out.println("Больше");
//            }
//            if (cc==comp){
//                System.out.println("Ой ну фсе! Угадал!");
//                break;
//            }
//        }
//        System.out.println("Затрачено попыток: " + counter);

        ////////////////////////////////////////////////////////////////////////////////////////////
        // оболочки

        // примитивные типы в джава + обьекты

        Integer a = 100;
        int b = a * 100;

        Double dd = 10.3; // у всех примитивных типов есть класс обертка;
        Float ff = 12.33f;
        Boolean bb = true;
        Character ccc = 'A';
        Byte bbb = 125;
        Short sh = 1233;

        String ss = new String("ghjhghjhg");

        Long ll = new Long(123);

        a.doubleValue();

        int result = Integer.parseInt("1258");
        System.out.println(result);

        double ddd = Double.parseDouble("12.36547");

        Boolean ssss = Boolean.valueOf(true);
        int w = 123;
        Integer ii = Integer.valueOf(w); // преобразует из примитивного типа в обьект

        String str = Boolean.toString(true); // преобр в строку
        System.out.println(str);

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////

       // Date & Calendar

        // дата применяется если нинужно ничего делать только хранить
        // Calendar если нужно чтото делать

      //   Date - работа с датой

        Date date = new Date(); // при использовании дэх конструктора в дайт запишеться текущая дата с ос
        System.out.println(date);

        Date date1 = new Date(-3600*100000); // @Deprecated - чтобы зачеркивало метод
        // время Unix time ( время задано с 1 января 1970)
        System.out.println(date1);// в скобках кол милисикунд  с 1 января 1970
        System.out.println(date.getTime());
        date.setTime(1200); // меняет время

        date.setTime(1200); // перед или после
        System.out.println(date.after(date1));

        Calendar calendar= Calendar.getInstance(); // статик метод который возвращает обьект календаря
        System.out.println(calendar);
        // ERA WEEK OF YEAR

       // calendar.set(Calendar.ERA, 0);
       //calendar.set(Calendar.WEEK_OF_YEAR,1);
       // calendar.set(Calendar.WEEK_OF_MONTH,4);

        //calendar.set(Calendar.YEAR,2020);
        //calendar.set(Calendar.MONTH, Calendar.SEPTEMBER);


        System.out.println(calendar.getTime());
        System.out.println(calendar.get(Calendar.MILLISECOND));

        calendar.add(Calendar.MONTH,1);
        System.out.println(calendar.getTime());//

        calendar.add(Calendar.DAY_OF_MONTH, -248);
        System.out.println(calendar.getTime());


    }

}
