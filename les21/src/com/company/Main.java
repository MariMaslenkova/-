package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        // чтение и запись из текстового файла

        FileWriter writer = new FileWriter("1.txt");
        writer.write("\tHappy New Year!\n 2022"); // перенос строки
        writer.write("I love Java", 7, 4);// все это сохраняется в оп памяти
        writer.append('!');

        writer.flush();// инициирует запись файла
        writer.close();// закрывает обрывает доступ файла к джаве. прекращает запись файла

        // чтобы сократить время записи. проще сначала сформировать и одним скопом записывать чем записывать постепенно
        // по эхтому нужен метод flush


        // запись в режиме добавления
        FileWriter appWriter = new FileWriter("1.txt", true); // добавление в конец существующего файла
        appWriter.write("\n Marry X-mas");
        appWriter.flush();
        appWriter.write("!!!");
        appWriter.flush();
        writer.close();


        // Чтение из файла
        FileReader reader = new FileReader("1.txt");
        while (true) {
            int c = reader.read();
            if (c == -1) { // конец файла
                break;
            }
            System.out.print((char) c);// иначе символы на новой строке
        }
        reader.close();


        FileReader reader2 = new FileReader("1.txt");// чтение из файла по частям (по 10 симфолов за раз)

        reader2.skip(10);// чтение с определенного символа. пропускаем первые 15 символов

        while (true) {
            char[] buf = new char[10];// буфер для чтения кусками
            int n = reader2.read(buf); // колво символов кот удалось прочитать
            if (n == -1) {
                break;
            }
            System.out.print(buf);
        }
        reader2.close(); // закрытие файла


        // чтение файла через сканер

        File f = new File("test.txt");
        Scanner sc = new Scanner(f);
        int integer = sc.nextInt();
        float floatt = sc.nextFloat();

        sc.nextLine();// чтобы прочитать разрозненный текст
        String message = sc.nextLine(); // метод некст лайн вызывать 2 раза


        System.out.println();
        System.out.println(integer);
        System.out.println(floatt);
        System.out.println(message);


        // перемещение курсора в рамках файла
        RandomAccessFile raf = new RandomAccessFile("1.txt", "rw");// r только для чтения
        //rw читать писать
        // rws - запись даннных и изменяется дата изменения
        //rwd - запись данных дата модификации  дата не изменится пока не закрыт файл

        raf.seek(7);// номер позиции символа
        byte[] chung = new byte[9];
        raf.read(chung);
        String s = new String(chung);
        System.out.println(s);


        raf.seek(15);
        String str = "";
        while (true) {
            byte [] content = new  byte[10];
            int n = raf.read(content);
            if (n==-1){
                break;
            }
            str+=new String(content);
        }
        raf.seek(15);
        raf.writeBytes(" and Marry X-mas");
        raf.writeBytes(str);
        raf.close();
    }
}
