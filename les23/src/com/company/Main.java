package com.company;

public class Main {

    public static void main(String[] args) {
        // аргументы командной строки- доп параметры которые указываются при запуске приложения
        // аргументами дополнительная возможность чтото поменять в программе без перекомпиляции
        // переменные среды
        // command line arguments
        // environment variables назначение что и арг командной строки

        // jar file

      //  System.out.println("Любая надпись");
        System.out.println(System.getenv("JAVA_TEST"));


        int sum = 0;
        for (String arg: args){

           int n = 0;
           try {n = Integer.parseInt(arg);
           } catch (Exception e){
               System.out.println(arg + "- неверный формат");
           }
           sum+=n;
        }
        System.out.println(sum);


    }
}
