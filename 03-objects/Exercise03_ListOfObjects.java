// Exercise 03 — A list of OBJECTS (this ties 02-data and 03-objects together!)
// RUN IT:  java 03-objects\Exercise03_ListOfObjects.java
//
// Real apps store MANY objects in a list: a list of users, products, orders...
// Here: an ArrayList of Product objects — like a shop's inventory.

import java.util.ArrayList;

public class Exercise03_ListOfObjects {
    public static void main(String[] args) {
        // A list that holds Product OBJECTS (not strings, not numbers — whole objects):
        ArrayList<Product> shop = new ArrayList<>();
        shop.add(new Product("Nasi Lemak", 5));
        shop.add(new Product("Teh Tarik", 3));
        shop.add(new Product("Roti Canai", 2));

        // Loop through the objects and use their fields:
        System.out.println("Menu:");
        for (Product p : shop) {
            System.out.println("- " + p.name + ": RM" + p.price);
        }

        System.out.println("---");

        // TODO 1: add one more Product of your choice to the shop, then print the menu again.
        shop.add(new Product("Roti Telur", 4));
         System.out.println("Menu:");
         for (Product p : shop) {
        System.out.println("- " + p.name + ": RM" + p.price);
         }
         System.out.println("---");

        // TODO 2: calculate and print the TOTAL price of everything in the shop.
        //         (hint: same "running total" pattern from 02-data — make `total = 0`,
        //          loop through, and add each p.price to it.)
        int total = 0;
        for (Product p : shop) {
            total += p.price;
             }
        System.out.println("Total price of menu: RM" + total);
    }
}

class Product {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
