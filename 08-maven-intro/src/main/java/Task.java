// A SECOND file in src/main/java, right next to App.java.
// This is the Task blueprint — same idea as your Product/Dog classes from 03-objects.
// It has no main(); it's just a description of what a Task is.

public class Task {
    String name;
    boolean done;

    // Constructor: build a Task with a name; new tasks start not-done.
    Task(String name) {
        this.name = name;
        this.done = false;
    }
}
