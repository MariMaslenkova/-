package com.company;

public class Main {


public static void main(String[] args) {
        // write your code
// codewars.com
// leetcode.com

// методы- функция
        // вызов метода

        int result = sum(12,134);
        System.out.println(result);


        printMaxValue(12.67f, 13.89f); // не создаем переменную тк метод ничего не возвращает


        System.out.println(min(1,-8,90));


        System.out.println(avg(2,2,2));
        System.out.println(avg(100,200,300));
        System.out.println(avg(10,20,30,40,50));
        System.out.println(avg(10));


        System.out.println(fact(9));


        System.out.println(fact2(5));

        int[] arr={1,23,26,22,26,23,5};
        System.out.println(count(5, arr));





        bits();
        }
// определение метода описание
static int sum(int a, int b){
        int s= a+b;
        return s; // возврат переменной S

        }
// метод который не возвращает значение

static void printMaxValue(float x, float y){
        if (x>y) {
        System.out.println(x);
        } else {
        System.out.println(y);
        }
        }


static  int min (int a, int b, int c){
        if (a < b && a < c) {
        return a;
        }
        if (b<c) {
        return b;
        }
        return c;
        }

// метод с неограниченным числом параметров/аргументов

static float avg(int ...v) {//массив
        if (v.length == 0) {
        return 0;
        }

        int sum=0;
        for (int e : v) {
        sum +=e; // sum=sum+e;
        }
        return (float)sum / v.length; // явное преобразование
        }

// метод который считает факториал
// 5!= 5*4*3*2*1=120
static int fact (int n) {
        int s=1;
        while (n!=0) {
        s*=n;
        n--;
        }
        return s;
        }

// рекурсия-вызов метода  в самом себе

static int fact2 (int n) {
        //5!=5*4!
        if (n==1) {
        return 1;
        }
        return n*fact2(n-1);

        }

// []
//n=6

static int count(int n, int[] arr) { // int...
        int counter=0; // временная переменная куда записывается промежуточный результат
        for (int e : arr) { // проходим по массиву
        if (e==n) { // если нашлось совпадение
        counter++; // увеличение на 1
        }
        }
        return counter;
        }





// Побитовые операции
static void bits() { // если ничего не принимает оставляем круглые скобки пустыми
        // & - побитовое И
        // | - побитовое ИЛИ     нужны чтобы манипулировать битами. работают с двумя элементами
        // >> - побитовый сдвиг вправо
        // << - побитовый сдвиг влево
        System.out.println(7&14);
        System.out.println(7|14);// если не ноль то записывам единицы
        System.out.println(7>>2); // 00...111 >> 00...1
        System.out.println(7<<6); // 00...111<< 00...111000000


    // v скорость от [0...100] 7Bits
    //u напряжение 0-0.8[0...80] 7bits
    // е Температура [0...150] 8bits
    int v= 59;
    int u = 20;
    int t = 119;

    // 10bits[7bits - напряжение][7bits - скорость][8bits - температура]
    int r=u;
    r=r<<7 | v;
    r=r<<8 | t;
    System.out.println(r);
    //0010100 0111011  01110111



        }
        }



