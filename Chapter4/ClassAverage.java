package Chapter4;

import java.util.Scanner;

public class ClassAverage {
    /**
     * Counter-controlled repetition also called definite repetition are used to
     * terminate loop.
     * Counter-controlled loops
     * are best when the number of test results is known in advance.
     */

    public static void main(String[] args) {
        double total = 0.0;
        int gradeCounter = 1;
        try (Scanner input = new Scanner(System.in)) {

            while (gradeCounter < 10) {
                System.out.print("Enter score: ");
                total += input.nextInt();
                gradeCounter++;
            }
        }
        System.out.printf("Average is %.2f%n", (total / 10));
    }
}
