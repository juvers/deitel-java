import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            Account accountName = new Account(null);
            System.out.printf("Initial name is %s%n%n", accountName.getName());

            System.out.println("Please enter the name: ");
            String theName = input.nextLine();
            accountName.setName(theName);

            System.out.printf("Name in object is %s%n%n", accountName.getName());
        }
        ;
    }
}