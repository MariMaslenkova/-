package com.company;

public class User {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int salary;

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }




    private int bonus;




    public User(String name, int salary, int bonus){
        this.name=name;
        this.salary=salary;
        this.bonus=bonus;

    }
}
