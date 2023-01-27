import java.util.Scanner;

class Comparison {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number1;
            int number2;
            System.out.println("Enter first number: ");
            number1 = input.nextInt();

            System.out.println("Enter second number: ");
            number2 = input.nextInt();

            if (number1 > number2) {
                System.out.printf("%d is greater than %d%n", number1, number2);
            }

            if (number2 > number1) {
                System.out.printf("%d is greater than %d%n", number2, number2);
            }
        }

    }
}