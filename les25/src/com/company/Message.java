package com.company;

public class Message {
    public String getText() {// получить значение
        return text;
    }

    public synchronized void setText(String text) {// чтобы вносить изменения
        this.text = text;
        //this.notify();// сообщает одному случайному потоку чтоб он прекратил ждать // если нотифай , то сработет один поток
        this.notifyAll();   // сообщает всем потокам которые ждут данный обьект чтобы они больше не ждали

        // нотифай должен быть вызван внутри синхронизированного блока
    }


    private String text;
}
