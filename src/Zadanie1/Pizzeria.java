package Zadanie1;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {
        printPizzas();

        Pizza pizza = getPizza();

        System.out.println("Wybrana pizza to: " + pizza + ". Jej numer na karcie to: " + pizza.ordinal());;



    }

    private static Pizza getPizza() {
        System.out.println("Wybierz pizzę: ");
        Scanner sc = new Scanner(System.in);
        Pizza pizza = Pizza.valueOf(sc.nextLine().toUpperCase());
        sc.close();
        return pizza;
    }

    private static void printPizzas() {
        System.out.println("Dostępne pizze to: ");
        for (Pizza pizza : Pizza.values()) {
            System.out.println(pizza.name());
        }
    }
}
