package com.company;

/** рефакторинг - меняем структору кода не меняя функциональность*/

abstract class ChatBot extends Thread { // класс потока// класс является потоков
    private Message msg;
    private String name;

    public ChatBot(String name, Message msg) {
        this.msg = msg;
        this.name = name;
    }

    @Override
    public void run() {
        // super.run();
        try {// обьект у которого вызывается wait должен находиться в синхрониз блоке и синхронизирован сам по себе(по своей обл памяти)
            while (!this.isInterrupted()) {// чтобы телеграм постоянно находился в ожидании //
                synchronized (msg) {
                    msg.wait();/** ждет пока текст сообщения не измениться.
                     блокирует выполнение текущего потока до тех пор пока в другом потоке для обьекта msg не будет вызван метод notify/notifyAll*/
                }
                if (!msg.getText().isEmpty()) {   /** если сообщение не пустое то пишем соут*/
                    System.out.println(this.name + ": " + msg.getText());
                }

            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
