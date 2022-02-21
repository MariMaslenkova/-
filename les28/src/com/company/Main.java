package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        /**наследование
         * геттеры и сеттеры
         * методы с переменным числом параметрами
         * сериализация десириализация
         * интерфейсы и абстрактные классы
         * статические классы
         * потоки
         * коллекции*/


/**********************************************************************************************************************/
        Orange orange = new Orange();
        orange.size = 5;
        orange.country = "Azerbaidzhan";


        try {
            orange.setColor("transparent");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        orange.print();

        Fruit f = new Orange(); // создастся обьект типа фрукт с методами только из оранжа
/***********************************************************************************************************************/
//CSV

//        String[][] report = {
//                {"FIO", "OKLAD", "PREMIA", "VSEGO"},
//                {"Petrov U.G.", "1200", "200", "=B2+C2"},
//                {"Ivanov E.L.", "1800", "370", "=B3+C3"},
//                {"Itogo", "", "", "=D2+D3"}
//        };
        UserCollection us=new UserCollection();
        us.add(new User("Ivanov", 1520,965),
                new User("Kukushkin", 845,898),
                new User("Pryshkin", 8745,87),
                new User("Mamedov", 95,87));

        String[][] report = us.generateReport();




        FileWriter fw = new FileWriter("report.csv");
        for (int i = 0; i < report.length; i++) {
            for (int j = 0; j < report[0].length; j++) {
                fw.write(report[i][j] + ";");
            }
            fw.write("\n");
        }
        fw.flush();// инициирует запись в файл
        fw.close();// закрытие файла

/**********************************************************************************************************************/


/***********************************************************************************************************************/
        // методы с переменным числом параметров

        int sum = sum(10, 25, 69, 54, 89, 65, 23, 65, 4, 8);
        System.out.println(sum);

    }

    /**********************************************************************************************************************/
    public static int sum(int... a) {// работаем как с обычным массивом
        int s = 0;
        for (int i : a) {
            s += i;
        }
        return s;
    }
/**********************************************************************************************************************/
}
