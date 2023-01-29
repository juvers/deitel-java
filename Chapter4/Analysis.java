package Chapter4;

import java.util.Scanner;

public class Analysis {
    public static void main(String[] args) {
        int passed = 0;
        int failed = 0;
        int counter = 0;
        // always put the scanner outside the while loop
        try (Scanner input = new Scanner(System.in)) {
            while (counter < 10) {
                int value;
                System.out.print("Enter 1 for passed or 2 for failed: ");

                value = input.nextInt();
                if (value == 1) {
                    passed++;
                } else {
                    failed++;
                }
                counter++;
            }
        }

        System.out.printf("Numbers passed: %d%n", passed);
        System.out.printf("Numbers failed: %d%n", failed);
        if (passed >= 8) {
            System.out.println("Give bonus to instructors");
        }
    }
}
