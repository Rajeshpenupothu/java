import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        // Initialize sum to store the sum of digits
        int sum = 0;

        // Make a copy of the input number to work with
        int temp = Math.abs(number);  // Use absolute value to handle negative numbers

        // Calculate the sum of digits
        while (temp > 0) {
            int digit = temp % 10;   // Extract the last digit
            sum += digit;            // Add the digit to sum
            temp /= 10;              // Remove the last digit
        }

        // Print the result
        System.out.println("The sum of digits of " + number + " is: " + sum);
    }
}
