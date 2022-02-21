package com.company;

public class Port {// синхр между тоннелем

    private int shipsCount; //текущее колво кораблей в порту
    private final static int maxWaitTime = 5000; // макс время ожидания разгрузки
    private final static int maxCapasity = 5;// макс вместимость порта


    private volatile long v; // гарантирует что никакой другой поток не получит доступ к этому свойству
    // пока значение этого свойства не обработано процессором полностью
    public void addShip(Ship ship) {

        System.out.println(ship.getName() + " вторгся на территорию порта");
        this.shipsCount++;
        // берем корабль и вызываем метод unlo
        // начинаем разгрузку корабля

        Thread t = new Thread(() -> {
            Object dispatcher = new Object();


            try {
                synchronized (dispatcher) {
                    ship.unloading(dispatcher); //
                    dispatcher.wait(maxWaitTime);// если корабль не успеет разгрузится до конца
                }
                if (ship.isUnLoaded()){
                    System.out.println("Гуд! " + ship.getName() + " разгрузиуся!");
                } else {
                    System.out.println("Упс! " + ship.getName() + " не успел! В другой раз, неудачник!");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {
                this.shipsCount--;
                this.notify();// у текущего обьекта порта вызываем мд нотифай
            }
        });
        t.start();
        // если в порту есть свободное место то берем новый корабль из тоннеля
        if (this.shipsCount < maxCapasity) {
            synchronized (this) {
                this.notify();
            }
        }
    }

    public boolean isFree() {
        return this.shipsCount < maxCapasity;
    }
}
/** AtomicLong i = new AtomicLong
 гарантируют что все операции будут происходить в синхронизированном контексте
 предназначены для всех примитивных типов данных
 есть для массивов

 */