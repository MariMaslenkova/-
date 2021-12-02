package com.company;

public class Colculator {
    public float plus (float x, float y) {
        return this.makeOperation(x,y, (a,b)-> a+b);
    } // в круглых скобка лябды типы данных для аргументов можно не указывать

    public float minus (float x, float y) {
        return this.makeOperation(x,y, (a,b)-> a-b);
    }
    public float divide (float x, float y) {
        return this.makeOperation(x,y, (a,b)-> a/b);
    }
    public float multiply (float x, float y) {
        return this.makeOperation(x,y, (a,b)-> a*b);
    }

    private float makeOperation (float x, float y, Operation o) {
        return o.operate(x,y);
    }
}
