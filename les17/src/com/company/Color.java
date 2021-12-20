package com.company;

public enum Color {

    RED("#ff0000"),// перечисления должны стоять вверху документа
    GREEN("#00ff00"),
    WHITE("#ffffff");

    private String hexColor;
    // конструктор енамов должен быть описан с модификатором private!!!

    private Color(String hexColor) {
        this.hexColor = hexColor;
    }

    public String getHexColor(){ // геттер который возвращает хекскалор чтобы значение можно было получить
        return this.hexColor;
    }

}
