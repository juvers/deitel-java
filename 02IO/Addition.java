import java.util.Scanner;

class Addition {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int number1;
            int number2;
            int sum;

            System.out.println("Enter first integer: ");
            number1 = input.nextInt();

            System.out.println("Enter second integer: ");
            number2 = input.nextInt();

            sum = number1 + number2;
            System.out.printf("Sum is %d%n", sum);
        }
    }
}