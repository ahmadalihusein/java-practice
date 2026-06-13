// Exercise 02 — loops and conditions
// RUN IT:  java 01-basics\Exercise02_Loops.java

public class Exercise02_Loops {
    public static void main(String[] args) {
        // EXAMPLE: print numbers 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("---");

        // TODO 1: print only the EVEN numbers from 1 to 20
        //         (hint: the % operator gives a remainder. x % 2 == 0 means even)

        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i); 
        }

        System.out.println("---");

        int i = 1;
        while (i <= 30) {
            if (i % 3 == 0 && i % 5 ==0){
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
            i++;
    }

        // TODO 2: print "FizzBuzz" classic:
        //   for numbers 1 to 30:
        //     - if divisible by 3 AND 5  -> print "FizzBuzz"
        //     - else if divisible by 3   -> print "Fizz"
        //     - else if divisible by 5   -> print "Buzz"
        //     - else                     -> print the number
        // (this exact question gets asked in real junior interviews)
    }
}
