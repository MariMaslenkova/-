package com.company;

public class Car {
    private float speed;

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        if (speed <0 || speed>250){
            // генерация исключения
            CarException e = new CarException();
            e.maxSpeed=250;
            e.minSpeed=0;
            throw e;// симуляция поломки программы
        }
        this.speed = speed;
    }
}
