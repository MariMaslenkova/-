package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // Потоки - являются частью процесса
        // Процесс -
        // 0-thread/ main-thread - нулевой поток(создается при запуске любого процесса программы)
        // когда умирает главный поток, то умирает и весь процесс
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        // создание потока

        long t = System.currentTimeMillis(); // 2750
//        for (int i = 0; i < 10000000; i++) {
//            double d = Math.sin(12 * i) + Math.log10(234) * Math.random() - Math.asin(i * 9);
//        }
//        System.out.println(System.currentTimeMillis()-t);
//

        // поток в джаве - это новый обьект


        Thread t1 = new Thread(() -> { // обьект потока с обьектом интерфейса с лямбда выр //создание нового потока
            for (int i = 0; i < 5000000; i++) {
                double d = Math.sin(12 * i) + Math.log10(234) * Math.random() - Math.asin(i * 9);
            }
            System.out.println(System.currentTimeMillis() - t);
        });


        Thread t2 = new Thread(() -> { // обьект потока с обьектом интерфейса с лямбда выр //создание нового потока
            for (int i = 5000000; i < 10000000; i++) {
                double d = Math.sin(12 * i) + Math.log10(234) * Math.random() - Math.asin(i * 9);
            }
            System.out.println(System.currentTimeMillis() - t);
        });


        long tt = System.currentTimeMillis();
        t1.start(); // запуск потоков
        t2.start();

        try {
            t1.join();// join приостанавливает выполнение потока в котором запущен поток у которого вызывается метод джоин, до тех пор пока этот поток не завершится
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(System.currentTimeMillis() - tt); //160

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Test test = new Test();

        Thread th1 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                synchronized (test) {// постановка в очередь // в скобки любой обьект. джава
                    test.n++;
                }
                test.change(1);
                Test.change2(1);
            }
            System.out.println("thread 1");
        });

        Thread th2 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                synchronized (test) {// пока аобьект заблокирован у него не работает никакой метод можно создать доп обьект обьект О и его поставить в синхронайз, чтобы точно не навредить программе
                    test.n--;
                }
                test.change(-1);
                Test.change2(-1);
            }
            System.out.println("thread 2");
        });


        th1.setPriority(Thread.MAX_PRIORITY);// установка приоритета потоку
        // мин 1
        // норм 5
        // макс 10
        th2.setPriority(2);// можно числом

        th1.setName("Поток 1");
        th2.setName("Поток 2");




        th1.start();
        th2.start();
        th1.join();
        th2.join();
        System.out.println(test.n);
        System.out.println(test.n2);
        System.out.println(Test.n3);
        System.out.println(th2.getId());
        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    }
}
