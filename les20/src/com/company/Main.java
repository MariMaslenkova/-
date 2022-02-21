package com.company;

public class Main {

    public static void main(String[] args) {
	// Integer
        // Iterator- обеспечивает
        SortedList list = new SortedList();
        list.add(12);
        list.add(100);
        list.add(-5);
        list.add(78);
        list.add(3);
        list.add(-98);
        list.add(54);
        list.add(233);

       //com.company.SortedList@1b6d3586
        // System.out.println(list);// Не переопределен метод тустринг

        System.out.println(list);

        for (Integer e : list){
            System.out.println(e);
        }
    }
}
