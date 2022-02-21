package com.company;

public class TelegramBot extends ChatBot {

public TelegramBot(Message msg){
    super("Telegram", msg);
}

}
//    public TelegramBot(Message msg) {
//        super(() -> {// вызов конструктора родителя
//            try {// обьект у которого вызывается wait должен находиться в синхрониз блоке и синхронизирован сам по себе(по своей обл памяти)
//                while (true) {// чтобы телеграм постоянно находился в ожидании
//                    synchronized (msg) {
//                        msg.wait();// ждет пока текст сообщения не измениться.
//                        // блокирует выполнение текущего потока до тех пор пока в другом потоке для обьекта msg не будет вызван метод notify/notifyAll
//                    }
//                    System.out.println("Telegram: " + msg.getText());
//                }
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        });
//
//        this.msg = msg;
//
//    }