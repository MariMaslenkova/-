package com.company;

import java.util.List;

public class Print<T> implements Exportable<T>{// если захотим печатать котов т
    // явно указываем тип данных который печатаем и этот же тип данных используем для експортбл
    @Override
    public void expotr(List<T> documents) {
        for (T doc: documents){
            System.out.println(doc);
        }
    }


}
