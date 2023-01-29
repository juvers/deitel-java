package Chapter3;

import java.util.Scanner;

public class AccountBalanceTest {
    public static void main(String[] args) {

        AccountBalance jude = new AccountBalance("Jude", 53.27);
        AccountBalance simon = new AccountBalance("Simon", 41.27);

        System.out.printf("%s has %.2f dollars %n", jude.getName(), jude.getBalance());
        System.out.printf("While %s has %.2f dollars %n", simon.getName(), simon.getBalance());

        try (Scanner input = new Scanner(System.in)) {
            // get balance input
            System.out.println("Enter Jude's balance: ");

            double judeBalance = input.nextDouble();

            System.out.println("Enter Simon's balance: ");
            double simonBalance = input.nextDouble();

            // notify balance addition
            System.out.printf("Adding %s to Simon's balance %n", simonBalance);
            System.out.printf("Adding %s to Jude's balance %n", judeBalance);

            // set balance
            jude.setBalance(judeBalance);
            simon.setBalance(simonBalance);

            // show new balance
            System.out.printf("Jude's balance is %.2f%n", jude.getBalance());
            System.out.printf("Simon's balance is %.2f%n", simon.getBalance());

        }
        ;
    }
}
