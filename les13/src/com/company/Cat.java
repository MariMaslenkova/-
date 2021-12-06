package com.company;

import com.company.CatFoodException;

public class Cat {
    public void eat(String food)throws CatFoodException{ // в сигнатуре указываем названия кл-ов исключений через запятую. после кл слова trows
        // ме-д генер кл которого наслед от кл Эксепшен
        if ("lime".equals(food)) { //сравниваем лайм и фуд
            // если лайм то генерируем исключения намеренно ломаем программу
            CatFoodException e = new CatFoodException();
            throw e;
        }
    }
}
