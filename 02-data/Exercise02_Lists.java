// Exercise 02 — ArrayList (a list that can GROW and SHRINK)
// Arrays have a fixed size. ArrayLists don't — you'll use these far more often in real jobs.
// RUN IT:  java 02-data\Exercise02_Lists.java

import java.util.ArrayList;

public class Exercise02_Lists {
    public static void main(String[] args) {
        // EXAMPLE: a growable list of tasks
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Learn Java");
        tasks.add("Learn SQL");
        tasks.add("Get internship");

        System.out.println("I have " + tasks.size() + " tasks:");
        for (String task : tasks) {
            System.out.println("- " + task);
        }

        System.out.println("---");

        // TODO 1: add two more tasks of your own to the list, then print the list again.

        // TODO 2: remove the first task (hint: tasks.remove(0)), then print the list.

        // TODO 3: print whether the list contains "Learn SQL"
        //         (hint: tasks.contains("Learn SQL") gives true/false)
    }
}
