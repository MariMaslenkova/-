package com.company;

public class CarFilter {
    public int fromPrice;
    public int toPrice;
    public Color color;
    public String term;
    public int fromYear;
    public int toYear;
    //
    public int pageSize;// сколько элементов за раз отдавать
    public int page;// номер страницы

    public SortBy sortBy;
    public boolean asc; // возрастание
}
