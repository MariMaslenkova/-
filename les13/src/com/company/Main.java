package com.company;

import java.io.File; // класс для работы с файлами не касающегося их содержимого
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// checked исключения( видны до комплиляции)
   // наследуют класс Exception

        File f = new File("1.txt");// создание нового файла
         if (!f.exists()){ // создать 1.txt если не существует


             try {
                 f.createNewFile();// у обьекта с искомым нозванием вызываем метод создать новый файл с таким названием
             } catch (IOException e) { // альт энтер сораунт трайкеч
                 e.printStackTrace();
             }
         }
         ////////////////////////////////////////////////////////////
        // про кота

         Cat kitty = new Cat(); // при вызове метода ит горит красным и просит обернуть в трайкеч
        try {
            kitty.eat("lime");
        } catch (CatFoodException e) {
            e.printStackTrace();
        }
        ///////////////////////////////////////////////////////////////////////////////
       // про банк

        String cardNumber = "676767";
        Bank belarusBank = new Bank();
        while (true){ // бесконечный цикл вайл
            System.out.println("Введите пин код:");
            Scanner sc = new Scanner(System.in);
            String pin = sc.nextLine(); //считывает строку

            try {
                belarusBank.checkPin(cardNumber,pin);
                break;
            } catch (CardIsBlockedException e) {
                System.out.println("Ваша карта заблокирована! Неудачник!");
                return;
            } catch (IncorrectPinFormatException e) {
                System.out.println("Неверный формат пин кода. Введите 4 цифры");
            } catch (IncorrectPinException e) {
                System.out.println("Неверный пин код. Повторите попытку!");

            }
        }
    }
}
