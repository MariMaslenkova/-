package com.company;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.stream.Stream;

public class Shop {
    private LinkedList<Car> cars;

    public Shop() {
        this.cars = new LinkedList<>();
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public Stream<Car> findCars(CarFilter f) {
        return this.cars.stream()// загоняет все элементы коллекции в стрим
                .filter(c -> c.price >= f.fromPrice && c.price <= f.toPrice)
                .filter(car -> car.color == f.color)
                .filter(car -> car.name.contains(f.term))
                .filter(c -> c.year >= f.fromYear && c.year <= f.toYear)
                .sorted(this.sort(f.sortBy, f.asc))
                .skip(f.pageSize*(f.page-1)) // первые 20 выкидывыем
                .limit(f.pageSize);
    }
    private Comparator<Car> sort(SortBy sortBy, boolean asc){
        switch (sortBy){
            case PRICE:
                return (o1, o2) -> {
                    if (o1.price>o2.price){
                        return asc?1:-1;
                    }
                    if (o1.price<o2.price){
                        return asc?-1:1;
                    }
                    return 0;
                };
        }//TODO: implements other sort methods
        return null;
    }
}
