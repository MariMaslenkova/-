package com.company;

public class Main {

    public static void main(String[] args) {
	/** интерфейсы и абстрактные классы*/
	/**
     * */

	CatCollection cc = new CatCollection();
	cc.add(
	        new Cat("Tom",12),
            new Cat("Kuzya",2),
            new Cat("Pol",5),
            new Cat("Mot",8),
            new Cat("Rick",6)
    );
       //1 экран (в консоль)
        //2 csv
        //3 html

        cc.export(new Print<Cat>());

        cc.export(new HTML<Cat>("index.html"));

    }
}
