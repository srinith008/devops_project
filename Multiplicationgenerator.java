
import java.util.Scanner;

public class Multiplicationgenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to generate its multiplication table: ");
        int number = scanner.nextInt();

        System.out.println("\nMultiplication Table of " + number + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", number, i, number * i);
        }

        scanner.close();
    }
}

