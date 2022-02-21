package com.company;

public class Test {
    public int n; // является разделяемым ресурсом
    public int n2;
    public static int n3;


    public synchronized void change(int d) { // в сигнатуру метода доб синхронайз, чтобы синхронизировать весь код в методе
        System.out.println(Thread.currentThread().getName());
        this.n2 += d;
    } // тоже самое, что и

//    public  void change(int d){ // синхронизируется код по ссылке this
//        synchronized (this){
//    }
//        this.n2+=d;}

// автосинхр - можно вызывать в разных потоках
    // если несинхран - нельзя использовать в неск потоках
    // синхронайз немного замедляет скорость выполнения потоков

    // стрингбафер и стрингбилдер
    // использовать стрингбилдер


    public synchronized static void change2(int d) {// в статик методах в качестве синхронизатора может выступать сам класс
        n3 += d;
    } // в этом случае блокируется весь класс, нельзя обратиться к методам, создать обьект, обратится к классу
    //
 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



}
