import java.util.Scanner;

public class DivisionByZeroHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two integers
        System.out.print("Enter the numerator: ");
        int numerator = scanner.nextInt();

        System.out.print("Enter the denominator: ");
        int denominator = scanner.nextInt();

        try {
            // Attempt division
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Division operation completed.");
        }

        scanner.close();
    }
}
