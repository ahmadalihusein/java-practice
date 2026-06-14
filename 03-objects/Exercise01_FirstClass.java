// Exercise 01 — Your first class & objects
// RUN IT:  java 03-objects\Exercise01_FirstClass.java
//
// A CLASS is a blueprint. An OBJECT is one real thing built from it.
// Here the blueprint is "Student". Below we build actual students from it.

public class Exercise01_FirstClass {
    public static void main(String[] args) {
        // Build an object (a real student) from the Student blueprint:
        Student alice = new Student();
        alice.name = "Alice";
        alice.age = 20;

        // Build a SECOND student — same blueprint, different data:
        Student bob = new Student();
        bob.name = "Bob";
        bob.age = 22;

        // Read the data back out with a dot:
        System.out.println(alice.name + " is " + alice.age + " years old.");
        System.out.println(bob.name + " is " + bob.age + " years old.");

        System.out.println("---");

        // TODO 1: create a THIRD student object called `you`.
        //         Set the name to your own name and any age. Print it like above.

        Student you = new Student();
        you.name = "Ali";
        you.age = 20;

         System.out.println(you.name + " is " + you.age + " years old.");

          System.out.println("---");

        // TODO 2: add a new field to the Student blueprint below: a String called `course`.
        //         Then set alice.course = "Diploma IT" and print it.
        alice.course = "Diploma IT";

     System.out.println(alice.name + " is a " + alice.course + " student.");


    }
}

// The blueprint. Notice it has no main() — it's not a program, it's a description
// of what every Student HAS. These are called "fields".
class Student {
    String name;   // every student has a name
    int age;       // ...and an age
    // TODO 2 hint: add your `course` field here
    String course;
}
