package com.company;

import java.util.LinkedList;

public class CatCollection {
    private LinkedList<Cat> cats;

    public CatCollection(){
        this.cats=new LinkedList<>();
    }

    public void add(Cat...c ){
        for (Cat cat:c){
            this.cats.add(cat);
        }
    }

   public void export(Exportable<Cat> ex){
        ex.expotr(this.cats);
   }

    }

