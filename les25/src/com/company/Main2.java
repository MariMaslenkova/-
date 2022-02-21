package com.company;

import java.util.Scanner;

/**
 Домашка на потоки
 */

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        Thread timer = new Thread(()->{
            while (!Thread.currentThread().isInterrupted()) {
                try {
                    Thread.sleep(2000);
                    System.out.println("КУ-КУ!");
                } catch (InterruptedException e) {
                    /** catch InterruptedException - сбрасывает состояние потока
                     *  после этого поток больше не считается прерванным*/
                    System.out.println("Программа завершена!");
                    Thread.currentThread().interrupt();
                }
            }
        });

        Scanner sc =new Scanner(System.in);
        timer.start();
        sc.nextLine();
        timer.interrupt();
        timer.join();



    }
}
