package com.company;

import java.util.Stack;

public class StackMain {
    public static void main(String[] args) {
        // стэк - коллекция работает по принципу первым пришел- последним вышел
        // LIFO - last in first out
        // набор тарелок


        Stack<Character> stack= new Stack<>();
        //пуш добавляет элемент в вершину стека
        stack.push('A');// использовать только жирные методы
        stack.push('K');
        stack.push('@');
        stack.push('A');
        System.out.println(stack);

        Character c = stack.pop();// достает элемент с вершины стека// элемент удаляется из стека
        System.out.println(c);
        System.out.println(stack);

        // возвращает элемент без удаления
        System.out.println(stack.peek());
        System.out.println(stack);

    }
}