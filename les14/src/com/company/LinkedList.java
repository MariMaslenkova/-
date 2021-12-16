package com.company;

public class LinkedList {
    private Node head;// ссыль на голову списка на первый эл списка

    public void add (int v){
        if (this.head==null){// если зисхед == 0 коллекция пустая
         this.head=new Node(v);
         return;
        }

        // находим последний элемент в списке
        Node node = this.head; // вспомогательная ссылка ссылка на ссылку
        while (node.next!=null){
            node = node.next; // в нод записать нужную ссылку
        }

        node.next=new Node(v);// добавление элемента в конец коллекции
    }
    public void print(){// метод для вывода на экран всех элементов коллекций
    Node node = this.head; // вспомогательная ссылка ссылка на ссылку
        while (node != null){
            System.out.println(node.value);// печать значения
        node = node.next;
    }
    }
}
