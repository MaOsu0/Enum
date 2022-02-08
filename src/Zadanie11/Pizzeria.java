package Zadanie11;

import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Wyświetl wszystkie pizze");

        Pizza.getPizzas();

        System.out.println("Wybierz pizzę");
        Pizza pizza = Pizza.valueOf(sc.nextLine());

        System.out.println("wybrana pizza to " + pizza);


        sc.close();

    }
}
