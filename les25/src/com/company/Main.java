package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	// Потоки
        // Telegram/Viber
        // c
        Message msg = new Message();// 1 обьект

        TelegramBot tbot=new TelegramBot(msg); // передаем ссылку на обьект msg
        tbot.start();// запуск потока

        ViberBot vbot = new ViberBot(msg);
        vbot.start();


        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите сообщение для отправки");
            String text = sc.nextLine();
            if (text.equals("exit")){
                msg.setText("");// пустое сообщение чтобы освободить потоки от вэйта
                vbot.interrupt();
                tbot.interrupt();

                tbot.join(); //метод джоин если нужно чтобы перед выходом потоки доделали что они там делали
                vbot.join();

                break;
            }
            msg.setText(text);

        }

    }
}
