// Exercise 03 — methods (reusable blocks of logic)
// RUN IT:  java 01-basics\Exercise03_Methods.java

public class Exercise03_Methods {

    // EXAMPLE method: takes two numbers, returns their sum
    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("2 + 3 = " + add(2, 3));

        // TODO 1: write a method `isEven(int n)` that returns true/false,
        //         then use it to print whether 7 and 10 are even.

        // TODO 2: write a method `max(int a, int b)` that returns the larger one.
        //         Print max(15, 9).
    }
}
