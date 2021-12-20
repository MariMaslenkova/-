package com.company;

public class User<T, E extends Number> {// Т внутри класса юзер это новый тип данных
    // чтобы Е можно было задавать только числом
    // нельзя использовать примитивные типы, но можно использовать класс оболочку
    public T id;//

    public E salary;


    // sum: Integer (1200)
    //sum : Float (15.25f)
    public <R extends Number> int addSalary(R sum) throws Exception { // добавление дженерика для одного метода
        if (sum instanceof Integer) {
            float s = sum.intValue() / 100.0f; // преобразование числа к флоту
            float newSalary = this.salary.floatValue() + s;
            return (int) (newSalary * 100); // явно преобр к инту
        }
        if (sum instanceof Float) {
            float newSalary = this.salary.floatValue() +  sum.floatValue();
            return (int) (newSalary * 100);
        }
        throw new Exception();
    }
}
