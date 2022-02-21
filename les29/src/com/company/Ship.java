package com.company;

public class Ship { // класс коробля

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int capacity;// столько груза у него сейчас
    private String name;
    private static int counter;// имя автомат


    // конструктор

    public Ship(int capacity) {
        this.capacity = capacity;
        this.name = String.format("Кораблик - %d", ++counter);
    }


    public void unloading(Object dispatcher) {// разгрузка
        new Thread(()->{
            try {
                Thread.sleep(this.capacity*1000);
                synchronized (this){
                this.capacity=0;
                } //корабль разгружен
                //сообщаем диспеtчеру что корабль разгруэен
                synchronized (dispatcher) {
                    dispatcher.notify();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }

    public synchronized boolean isUnLoaded(){
        return this.capacity==0;
    }
}
