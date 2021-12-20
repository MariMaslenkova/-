package com.company;

public enum Calc {
    SUM { // переопределение метода для каждого обьекта

        @Override
        public float exec(int a, int b) {
            return a + b;
        }
    },
    DIVIDE {
        @Override
        public float exec(int a, int b) {
            return (float) a / b;
        }
    },
    MULTIPLY {
        @Override
        public float exec(int a, int b) {
            return a * b;
        }
    },
    SUB {
        @Override
        public float exec(int a, int b) {
            return a - b;
        }
    };


    public abstract float exec(int a, int b); // абстракт
}
