package com.company;


import java.util.List;

public interface Exportable<T> {
    void expotr(List<T> documents); //можно подставить любой List
}
