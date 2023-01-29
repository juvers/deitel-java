package Chapter4;

import java.util.Scanner;

/**
 * Sentinel-controlled loops
 * are best when the number of test results is not known in advance.It requires
 * a sentinel value in this case -1
 */

public class ClassAverage2 {
    public static void main(String[] args) {
        double total = 0.0;
        int number = 0;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter grade or -1 to quit: ");
            int grade = input.nextInt();
            while (grade != -1) {

                System.out.println("Enter grade or -1 to quit: ");
                grade = input.nextInt();

                total += grade;
                number++;
            }
        }

        System.out.printf("The average score is %.2f%n", (total / number));
    }

}
