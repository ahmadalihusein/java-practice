// Project 1 — To-Do List App
// RUN IT:  java 04-project-todo\TodoApp.java
//
// Build this in STAGES. Stage 1 (the menu loop) is already done so you can run it
// right away and see it work. Then fill in Stage 2, 3, 4 one at a time.

import java.util.ArrayList;
import java.util.Scanner;

public class TodoApp {
    public static void main(String[] args) {
        // Our list of tasks — an ArrayList of Task OBJECTS (just like your Products).
        ArrayList<Task> tasks = new ArrayList<>();

        // Scanner is the NEW tool: it reads what the user types in the terminal.
        Scanner scanner = new Scanner(System.in);

        // ===== STAGE 1: the menu loop (already done — just read & run it) =====
        // This loops forever until the user chooses 4 (Quit).
        while (true) {
            System.out.println();
            System.out.println("=== MY TO-DO LIST ===");
            System.out.println("1. Add a task");
            System.out.println("2. View tasks");
            System.out.println("3. Mark task as done");
            System.out.println("4. Quit");
            System.out.print("Choose: ");

            String choice = scanner.nextLine();   // read the user's typed line

            if (choice.equals("1")) {
                // ===== STAGE 2: Add a task =====
                // TODO: ask "Task name: ", read the line with scanner.nextLine(),
                //       then add a new Task to the list:  tasks.add(new Task(thatName));
               System.out.println("(Add a new task)"); 
               String name = scanner.nextLine();
                tasks.add(new Task(name));

            } else if (choice.equals("2")) {
                // ===== STAGE 3: View tasks =====
                // TODO: loop through `tasks` and print each one.
                //       Show whether it's done. Hint, inside the loop:
                //         String box = t.done ? "[x]" : "[ ]";
                //         System.out.println(box + " " + t.name);
                System.out.println("(Task list: )");
                for(Task t : tasks){
                System.out.println("- " + t.name ? "[X]" : "[ ]"; );
            }

            } else if (choice.equals("3")) {
                // ===== STAGE 4: Mark a task as done =====
                // TODO: this one's the trickiest — leave it for last.
                //       Show the tasks with numbers, ask which number, set that task's
                //       .done = true. We'll tackle it together when you get here.
                System.out.println("(Mark done — not built yet)");

            } else if (choice.equals("4")) {
                System.out.println("Bye! Keep grinding. 👊");
                break;   // breaks out of the while(true) loop = quits the app

            } else {
                System.out.println("Please type 1, 2, 3, or 4.");
            }
        }

        scanner.close();
    }
}

// The blueprint for one task. Same idea as Product/Dog.
class Task {
    String name;
    boolean done;   // false = not done yet, true = finished

    Task(String name) {
        this.name = name;
        this.done = false;   // a brand-new task always starts NOT done
    }
}
