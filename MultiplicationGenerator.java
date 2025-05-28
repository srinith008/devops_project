public class MultiplicationGenerator {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java MultiplicationGenerator <number>");
            return;
        }

        try {
            int number = Integer.parseInt(args[0]);
            System.out.println("Multiplication Table for " + number);
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    }
}
