package com.company;

public class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;


    public User(String name){
        this.name=name;
    }

    @Override // альт инсерт метод ту стринг
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    /**********************************************************/

    public int coins;// к 26 уроку
    public User(int coins){
        this.coins=coins;
    }

}
