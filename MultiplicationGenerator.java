import java.util.Scanner;

public class MultiplicationGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        // Loop until a valid integer is entered
        while (true) {
            System.out.print("Enter a number to generate its multiplication table: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // clear the invalid input
            }
        }

        System.out.println("\nMultiplication Table of " + number + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", number, i, number * i);
        }

        scanner.close();
    }
}
