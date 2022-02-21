package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        //коллекция которая особым образам предост доступ к элементам
        // FIFO- first in first out
        Queue<String> q = new LinkedList<>();// строим очередь на основании линкидлист
        q.add("Red"); // порядок элементов в очереди не меняется
        q.add("Yellow");
        q.add("Green");
        q.add("White");
        System.out.println(q);

        System.out.println(q.element()); // возращает первый элемент

       String s =  q.poll();// возвращает первый элемент  и удаляет его
        System.out.println(s);
        System.out.println(q);


    }
}