package com.company;
// внутри тела интерфейся (фиг скобки) могут  / должны распологатся методы без реализации без тела
// методы с реализацией внутри интерфейся недопустимы.
// нельзя распологать свойства.
// можно расположить могут присутствовать статические поля(статик)***
// нельзя создать обьект интерфейса не реализовав все его абстрактные методы***

// помогают решить 2 проблемы
// обойти множественное наследование
// то же что и абстк класс
// отличие в абстр можно свойства
//в интерф все методы должны абстрак

//
public interface Predator {
    // начиная с врсси джава,8 методам интерфейса можно задавать реализацию.
    default void eatMeal(String meal){
        System.out.println(meal);
    }

    void hunt (Predator p);
    void hunt (PlantEating p);
}
