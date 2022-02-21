package com.company;

public class Cat {

    private int id;

    public Cat (int id){
      this.id=id;
    }

    @Override
    public boolean equals(Object obj) {
        Cat cat = (Cat)obj;
        return cat.id ==this.id;
    }

    @Override
    public int hashCode() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                '}';
    }
}
