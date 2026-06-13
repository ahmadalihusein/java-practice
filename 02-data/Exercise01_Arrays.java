// Exercise 01 — Arrays (a fixed-size list of values)
// RUN IT:  java 02-data\Exercise01_Arrays.java

public class Exercise01_Arrays {
    public static void main(String[] args) {
        // EXAMPLE: an array of 5 exam scores
        int[] scores = {70, 85, 90, 60, 100};

        // print the first and last
        System.out.println("First score: " + scores[0]);        // index starts at 0!
        System.out.println("Last score: " + scores[scores.length - 1]);

        // loop through all of them
        for (int score : scores) {
            System.out.println("Score: " + score);
        }

        System.out.println("---");

        // TODO 1: calculate and print the SUM of all scores
        //         (hint: make a variable `total = 0`, add each score to it in a loop)

        // TODO 2: calculate and print the AVERAGE
        //         (hint: total divided by scores.length —
        //          but length is an int, so cast: (double) total / scores.length)

        // TODO 3: find and print the HIGHEST score
        //         (hint: track a `max` variable, update it when you find something bigger)
    }
}
