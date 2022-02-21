package com.company;

import java.util.Random;

public class ShipGenerator {// типа океан

    public  Ship newShip(){
        return new Ship(new Random().nextInt(10)+1); // отдает обьект корабль ген рандомом// значение от 1 до 10включая
    }
}
