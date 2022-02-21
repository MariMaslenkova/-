package com.company;

public class Tunnel extends Thread {// запуск как отдельный поток
    private ShipGenerator gen; // на вход подает шипджен
    private Ship ship; // корабль который в данный момент находиться в тоннеле
    private Port port; //приват свойство типа порт


    public Tunnel(ShipGenerator gen, Port port) {
        this.gen = gen;
        this.port = port;
    }


    @Override
    public void run() {// поток работает в беск режиме
        while (!this.isInterrupted()) {// цикл работает пока не прервем его работу
            // 1 если тоннель пуст то мы помещаем в него новый корабль
            if (this.ship == null) {
                this.ship = this.gen.newShip();// создаем новый корабль и говорим что он теперь в тоннеле
                System.out.println("Виу-Виу-Виу: " + this.ship.getName() + " вошел в тоннель, с грузом: "+ this.ship.getCapacity());
            }
            //2 ждем пока в порту не освободится место для корабля
            try {
                if (!this.port.isFree()) {// ждем пока освободиться порт только тогда когда он не свободен
                    synchronized (this.port) { // синхр по обьекту порт
                        this.port.wait();
                    }
                }
                System.out.println("Свободная касса! Загоняй следующий!");

                //3, отправляем ожидающий корабль в порт
                port.addShip(this.ship);
                this.ship = null; // кораблик типа уплыл из порта

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
