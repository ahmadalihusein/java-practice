// Exercise 02 — Giving objects BEHAVIOR (methods) + a constructor
// RUN IT:  java 03-objects\Exercise02_Behavior.java
//
// Objects don't just HOLD data — they can DO things. Those are methods that
// live inside the class. And a CONSTRUCTOR lets us build an object with its
// data already filled in, in one line.

public class Exercise02_Behavior {
    public static void main(String[] args) {
        // Thanks to the constructor, we set name+age in ONE line (no more dot-by-dot):
        Dog rex = new Dog("Rex", 3);
        Dog milo = new Dog("Milo", 5);

        // Call a method (an action the object can do):
        rex.bark();
        milo.bark();

        System.out.println("---");

        // TODO 1: create a third Dog with your own name + age, then make it bark().

        // TODO 2: add a new method to the Dog class below called `birthday()`
        //         that increases the dog's age by 1 and prints
        //         "<name> is now <age>". Then call rex.birthday().
    }
}

class Dog {
    String name;
    int age;

    // CONSTRUCTOR: special method with the SAME name as the class, no return type.
    // It runs when you write `new Dog(...)` and fills in the fields.
    Dog(String name, int age) {
        this.name = name;   // "this.name" = the object's field; "name" = the value passed in
        this.age = age;
    }

    // A METHOD: an action this dog can perform.
    void bark() {
        System.out.println(name + " says: Woof!");
    }

    // TODO 2 hint: add your `birthday()` method here
}
