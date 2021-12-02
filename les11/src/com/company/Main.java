package com.company;

public class Main {

    public static void main(String[] args) {
// класс Object
        // Cat.java

        Cat kot = new Cat("krasnyj", "Myrzik");
        //kot.hashCode() // все классы джава неявно наследуют класс Object
        // Object// заставляет все обьекты в джава придерживаться единого поведения. набор методов которые нужны джаве
        // при многопоточном программировании
        System.out.println(kot); //com.company.Cat@1b6d3586 - вызывается метод(sout) который принимает просто Object

        String s = "Privet " + kot; // джава вызывает у обьекта кот метод тустринг
        System.out.println(s);

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        Cat kot2 = new Cat("krasnyj", "Myrzik");
        System.out.println(kot == kot2);// фолс потому что при сравнении ссылок(те части кот ссылаются на кусок памяти)
        // через оператор == всегда будем получать значение фолс!!! за исключением тех случаев когда обе ссылки указывают на одну и ту же обл памяти
        // == сравнивает не значения , а ссылки(адреса в памяти)


        Cat kot3 = kot;// ссылаются на одну область памяти
        System.out.println(kot3 == kot);

        System.out.println(kot.equals(kot2));
        Cat kot4 = new Cat("krasnyj", "Vasya");
        System.out.println(kot.equals(kot4));
    }
}
