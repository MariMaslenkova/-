package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Siemens siemens = new Siemens(400, 200, "Siemens");
        Delonghi delonghi = new Delonghi(470, 180, "Delonghi");
        Saeco saeco = new Saeco(430, 190, "Saeco");

        System.out.println("Выбрать кофемашину:");
        System.out.println("1. Siemens");
        System.out.println("2. Delonghi");
        System.out.println("3. Saeco");
        int input = sc.nextInt();

        while (input != 4) {
            if (input == 1) {
                Siemens siemens1 = new Siemens(400, 200, "siemens");
                System.out.println("Ваш выбор Siemens");
                System.out.println("Siemens menu:");
                System.out.println("1. Объем кофе и воды");
                System.out.println("2. Приготовить Американо");
                System.out.println("3. Приготовить Эспрессо");
                System.out.println("4. Приготовить двойной эспрессо");
                System.out.println("5. Заполнить бак водой");
                System.out.println("6. Заполнить бак кофе");
                System.out.println("7. Информация");
                System.out.println("8. Выключить кофемашину");
                int input1 = sc.nextInt();
                Scanner sc1 = new Scanner(System.in);

                while (input1 != 8) {
                    switch (input1) {
                        case 1:
                            System.out.println("Кол-во кофе " + siemens1.volCoffee + " гр.");
                            System.out.println("Кол-во воды " + siemens1.volWater + " гр.");
                            break;

                        case 2:
                            if (siemens1.volWater < 150){
                                System.out.println("Недостаточно воды в баке для приготовления");
                            }
                            if (siemens1.volCoffee <20){
                                System.out.println("Недостаточно кофе для приготовления");
                            }
                            siemens1.makeAmericano(Recipes.waterAmericano, Recipes.coffeeAmericano);
                            System.out.println("Американо готов.");

                            break;
                        case 3:
                            if (siemens1.volWater < 150){
                                System.out.println("Недостаточно воды в баке для приготовления");
                            }
                            if (siemens1.volCoffee <50){
                                System.out.println("Недостаточно кофе для приготовления");
                            }
                            siemens1.makeEspresso(Recipes.waterEspresso, Recipes.coffeeEspresso);
                            System.out.println("Эспрессо готов.");
                            break;

                        case 4:
                            if (siemens1.volWater < 150){
                                System.out.println("Недостаточно воды в баке для приготовления");
                            }
                            if (siemens1.volCoffee <100){
                                System.out.println("Недостаточно кофе для приготовления");
                            }
                            siemens1.makeDoubleEspresso(Recipes.waterDoubleEspresso, Recipes.coffeeDoubleEspresso);
                            System.out.println("Двойной Эспрессо готов");
                            break;

                        case 5:
                            siemens1.resetWaterCount();
                            System.out.println("Бак с водой заполнен на " + siemens1.volWater + "мл.");
                            break;

                        case 6:
                            siemens1.resetCoffeeCount();
                            System.out.println("Бак с кофе заполнен на " + siemens1.volCoffee + "гр.");
                            break;

                        case 7:
                            System.out.println("Кофемашина " + siemens1.name + "  Кол-во воды: "
                                    + siemens1.volWater + "мл."
                                    + "  Кол-во кофе: " + siemens1.volCoffee + "гр.");
                            break;

                    }
                }
                if (input1 == 8) {
                    System.out.println("Кофемашина выключена");
                    break;
                }
            }

            if (input == 2) {
                Delonghi delonghi1 = new Delonghi(470, 180, "Delonghi");
                System.out.println("Delonghi menu:");
                System.out.println("1. Объем кофе и воды");
                System.out.println("2. Приготовить Американо");
                System.out.println("3. Приготовить Эспрессо");
                System.out.println("4. Приготовить двойной эспрессо");
                System.out.println("5. Заполнить бак водой");
                System.out.println("6. Заполнить бак кофе");
                System.out.println("7. Информация");
                System.out.println("8. Выключить кофемашину");
                int input2 = sc.nextInt();
                Scanner sc2 = new Scanner(System.in);

                while (input2 != 8) {
                    switch (input2) {
                        case 1:
                            System.out.println("Кол-во кофе " + delonghi1.volCoffee + " гр.");
                            System.out.println("Кол-во воды " + delonghi1.volWater + " гр.");
                            break;

                        case 2:
                            if (delonghi1.volWater < 150){
                                System.out.println("Недостаточно воды в баке для приготовления");
                            }
                            if (delonghi1.volCoffee <20){
                                System.out.println("Недостаточно кофе для приготовления");
                            }
                            delonghi1.makeAmericano(Recipes.waterAmericano, Recipes.coffeeAmericano);
                            System.out.println("Американо готов.");
                            break;

                        case 3:
                            if (delonghi1.volWater < 150){
                                System.out.println("Недостаточно воды в баке для приготовления");
                            }
                            if (delonghi1.volCoffee <50){
                                System.out.println("Недостаточно кофе для приготовления");
                            }
                            delonghi1.makeEspresso(Recipes.waterEspresso, Recipes.coffeeEspresso);
                            System.out.println("Эспрессо готов.");
                            break;

                        case 4:
                            if (delonghi1.volWater < 150){
                                System.out.println("Недостаточно воды в баке для приготовления");
                            }
                            if (delonghi1.volCoffee <100){
                                System.out.println("Недостаточно кофе для приготовления");
                            }
                            delonghi1.makeDoubleEspresso(Recipes.waterDoubleEspresso, Recipes.coffeeDoubleEspresso);
                            System.out.println("Двойной Эспрессо готов");
                            break;

                        case 5:
                            delonghi1.resetWaterCount();
                            System.out.println("Бак с водой заполнен на " + delonghi1.volWater + "мл.");
                            break;

                        case 6:
                            delonghi1.resetCoffeeCount();
                            System.out.println("Бак с кофе заполнен на " + delonghi1.volCoffee + "гр.");
                            break;

                        case 7:
                            System.out.println("Кофемашина " + delonghi1.name + "  Кол-во воды: "
                                    + delonghi1.volWater + "мл."
                                    + "  Кол-во кофе: " + delonghi1.volCoffee + "гр.");
                            break;
                        default:
                    }
                }
                if (input2 == 8) {
                    System.out.println("Кофемашина выключена");
                    break;
                }
            }

            if (input == 3) {
                Saeco saeco1 = new Saeco(430, 190, "Saeco");
                System.out.println("Saeco menu:");
                System.out.println("1. Объем кофе и воды");
                System.out.println("2. Приготовить Американо");
                System.out.println("3. Приготовить Эспрессо");
                System.out.println("4. Приготовить двойной эспрессо");
                System.out.println("5. Заполнить бак водой");
                System.out.println("6. Заполнить бак кофе");
                System.out.println("7. Информация");
                System.out.println("8. Выключить кофемашину");
                int input3 = sc.nextInt();
                Scanner sc3 = new Scanner(System.in);

                while (input3 != 8) {
                    switch (input3) {
                        case 1:
                            System.out.println("Кол-во кофе " + saeco1.volCoffee + " гр.");
                            System.out.println("Кол-во воды " + saeco1.volWater + " гр.");
                            break;

                        case 2:
                            if (saeco1.volWater < 150){
                                System.out.println("Недостаточно воды в баке для приготовления");
                            }
                            if (saeco1.volCoffee <20){
                                System.out.println("Недостаточно кофе для приготовления");
                            }
                            saeco1.makeAmericano(Recipes.waterAmericano, Recipes.coffeeAmericano);
                            System.out.println("Американо готов.");
                            break;

                        case 3:
                            if (saeco1.volWater < 150){
                                System.out.println("Недостаточно воды в баке для приготовления");
                            }
                            if (saeco1.volCoffee <50){
                                System.out.println("Недостаточно кофе для приготовления");
                            }
                            saeco1.makeEspresso(Recipes.waterEspresso, Recipes.coffeeEspresso);
                            System.out.println("Эспрессо готов.");
                            break;

                        case 4:
                            if (saeco1.volWater < 150){
                                System.out.println("Недостаточно воды в баке для приготовления");
                            }
                            if (saeco1.volCoffee <100){
                                System.out.println("Недостаточно кофе для приготовления");
                            }
                            saeco1.makeDoubleEspresso(Recipes.waterDoubleEspresso, Recipes.coffeeDoubleEspresso);
                            System.out.println("Двойной Эспрессо готов");
                            break;

                        case 5:
                            saeco.resetWaterCount();
                            System.out.println("Бак с водой заполнен на " + saeco1.volWater + "мл.");
                            break;

                        case 6:
                            saeco1.resetCoffeeCount();
                            System.out.println("Бак с кофе заполнен на " + saeco1.volCoffee + "гр.");
                            break;

                        case 7:
                            System.out.println("Кофемашина " + saeco1.name + "  Кол-во воды: "
                                    + saeco1.volWater + "мл."
                                    + "  Кол-во кофе: " + saeco1.volCoffee + "гр.");
                            break;
                        default:
                    }
                }
                if (input3 == 8) {
                    System.out.println("Кофемашина выключена");
                    break;
                }
            }
        }
    }
}