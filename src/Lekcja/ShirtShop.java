package Lekcja;

import java.util.Scanner;

public class ShirtShop {
    public static void main(String[] args) {

//        System.out.println("SMALL - " + Lekcja.Tshirt.SMALL);
//        System.out.println("MEDIUM - " + Lekcja.Tshirt.MEDIUM);
//        System.out.println("LARGE - " + Lekcja.Tshirt.LARGE);
//        System.out.println(Lekcja.Size.SMALL.getDescription() + " " + Lekcja.Size.SMALL.name() + " "
//        + Lekcja.Size.SMALL.ordinal());
//        System.out.println(Lekcja.Size.MEDIUM.getDescription() + " " + Lekcja.Size.MEDIUM.name() + " "
//        + Lekcja.Size.MEDIUM.ordinal());
//        System.out.println(Lekcja.Size.LARGE.getDescription() + " " + Lekcja.Size.LARGE.name() + " "
//        + Lekcja.Size.LARGE.ordinal());

        Size[] values = Size.values();
        System.out.println("Dostępne rozmiary thirtów:");
        for (Size value : values) {
            System.out.println(value.toString());
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz rozmiar");

        String size = sc.nextLine();
        Size shirtSize = Size.fromDescription(size);


        Tshirt tshirt = new Tshirt();

        tshirt.setSize(shirtSize);

        System.out.println(tshirt.getSize());
        System.out.println("Rozmiar tshirta: " + tshirt.getSize().getDescription());

    }
}