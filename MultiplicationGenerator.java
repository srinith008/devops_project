public class MultiplicationGenerator {
    public static void main(String[] args) {
        int n = 5; // default
        if (args.length > 0) {
            try {
                n = Integer.parseInt(args[0]);
            } catch (Exception e) {
                System.out.println("Invalid argument. Using default 5.");
            }
        }

        System.out.println("Multiplication Table for " + n);
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
