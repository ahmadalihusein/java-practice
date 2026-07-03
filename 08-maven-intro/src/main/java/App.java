// App.java uses the Task class — which lives in a SEPARATE file (Task.java)
// in this same folder. Because they're in the same project, App can use Task
// directly, with NO import needed. That's the thing to notice here.

public class App {
    public static void main(String[] args) {
        // Build two Task objects from the blueprint in Task.java:
        Task t1 = new Task("Learn Maven");
        Task t2 = new Task("Learn Spring Boot");
        Task t3 = new Task("Add third task");

        // Print them:
        System.out.println(t1.name + " - done? " + t1.done);
        System.out.println(t2.name + " - done? " + t2.done);
        System.out.println(t3.name + " - done? " + t3.done);

        // TODO: create a third Task called `t3` with your own text,
        //       then print it the same way as t1 and t2 above.
    }
}
