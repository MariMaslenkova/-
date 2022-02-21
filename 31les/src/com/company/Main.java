package com.company;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {


    //Cat{ } // класс внутри класса


    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        /** класс можно создавать везде в фигурных скобках
         *
         * статические классы
         * */
        TestDlyaTesta.sayHello();
        //,Test.sayHello();
        class Dog {
        }// класс внутри метода

        Test.Cat cat = new Test.Cat();// обьект класса кэт
/***********************************************************************************************************************/
        //рефлексия
        // динамическое изменение памяти
        // или динамическое изменение/ либо получение информации о них(о полях) полей класса в рантайме(во время выполнения программы)
        // дает мета(все что внутри фигурных скобках) информацию о классе
        Class c = Test.class;//класс обьект класса класс() обьект типа класс
        Method[] metods = c.getMethods();// возвращает массив методов класса
        for (Method m : metods) {
            Test tt = new Test();
            System.out.println(m.getName());
        }
        Method m = c.getMethod("sum", int.class, int.class);
        Test ttt = new Test();
        Integer res = (Integer) m.invoke(ttt, 25, 89);
        System.out.println(res);

        // получаем список свойств класса
        Field[] fields = c.getFields();
        for (Field f : fields) {
            System.out.println(f.getName());
        }

        Field f = c.getField("name");
        f.set(ttt, "Vasilij");
        System.out.println(ttt.name);



    }

}
