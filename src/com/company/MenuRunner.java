package com.company;

public class MenuRunner {
    public static void main (String[] args) {
        Sandwich Reuben = new Sandwich (5.75, "Reuben");
        Sandwich bec = new Sandwich (2.00, "BEC");
        Sandwich Waldorf = new Sandwich (7.25, "Waldorf");
        Sandwich Caeser = new Sandwich (4.50, "Caeser");
        Sandwich icedTea = new Sandwich (1.50, "Iced Tea");
        Sandwich Smoothie = new Sandwich (5.50, "Smoothie");

        Trio trio1 = new Trio (Reuben, Waldorf, icedTea);
        Trio trio2 = new Trio (bec, Caeser, Smoothie);
        Trio trio3= new Trio (bec, Caeser, icedTea);

        System.out.println(trio1. getName() + "Price" + trio1.getPrice());
        System.out.println(trio2. getName() + "Price" + trio2.getPrice());
        System.out.println(trio3. getName() + "Price" + trio3.getPrice());
    }
}
