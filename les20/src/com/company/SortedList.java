package com.company;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class SortedList implements Collection<Integer> {
    private LinkedList<Integer> list;// обьекты будут лежать ка обычный линкедлист

    public SortedList() {//переопределение дэф конструктора
        this.list = new LinkedList<>();// выделение памяти под обьект Линкедлист
    }

    private class ListIterator implements Iterator<Integer> {//вложенный класс + альтэнтер
        private LinkedList<Integer> copyList; // копия коллекции
        private int index;// счетчик индекс текущего актуального элемента в коллекции который возвращается в методе некст

        public ListIterator() {//переопред конструктора
            this.copyList = (LinkedList<Integer>) list.clone();

            //сортировка
            Collections.sort(this.copyList, (o1, o2) -> {// способ для сортировки коллекции
                if (o1 < o2) {// критерии по которому сравниваются обьекты
                    return -1;
                }
                if (o1.equals(o2)) {// Обьекты нельзя сравнивать через двойное равно
                    return 0;
                }
                return 1;
            });
        }


        @Override
        public boolean hasNext() {
            return this.index<=this.copyList.size()-1;
        }

        @Override
        public Integer next() {
            return this.copyList.get(this.index++);
        }


    }

    @Override// переопределение метода тустринг
    public String toString() {
        return this.list.toString();
    }

    @Override
    public int size() {
        return this.list.size();// вернет то что вернет сайз линкедлист
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return this.list.contains(o);
    }

    @Override
    public Iterator<Integer> iterator() {

        return new ListIterator();
    }

    @Override
    public Object[] toArray() {
        return this.list.toArray();
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return this.list.toArray(a);
    }

    @Override
    public boolean add(Integer integer) {
        return this.list.add(integer);
    }

    @Override
    public boolean remove(Object o) {
        return this.list.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return this.list.containsAll(c);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return this.list.addAll(c);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return this.list.removeAll(c);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return this.list.retainAll(c);
    }

    @Override
    public void clear() {
        this.list.clear();

    }
}
