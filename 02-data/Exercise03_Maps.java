// Exercise 03 — HashMap (pairs of KEY -> VALUE, like a dictionary)
// Use this when you want to look something up by a name/id.
// RUN IT:  java 02-data\Exercise03_Maps.java

import java.util.HashMap;

public class Exercise03_Maps {
    public static void main(String[] args) {
        // EXAMPLE: phone book — name (key) -> phone number (value)
        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Ali", "012-3456789");
        phoneBook.put("Siti", "019-8765432");

        // look up by key
        System.out.println("Ali's number: " + phoneBook.get("Ali"));

        // loop through all entries
        for (String name : phoneBook.keySet()) {
            System.out.println(name + " -> " + phoneBook.get(name));
        }

        System.out.println("---");

        // TODO 1: add one more person to the phone book, then look up their number.

        // TODO 2: make a NEW HashMap<String, Integer> called `prices`
        //         (note: Integer, because the values are numbers).
        //         Add: "Nasi Lemak" -> 5, "Teh Tarik" -> 3
        //         Then print the price of Nasi Lemak.
    }
}
